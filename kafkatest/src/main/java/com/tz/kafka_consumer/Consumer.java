package com.tz.kafka_consumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;

import java.util.Arrays;
import java.util.Properties;

/**
 * 四、消费者consumer-API
 */
public class Consumer {
    public static void main(String[] args) {
        // 1.配置消费者属性
        Properties prop = new Properties();

        // 配置属性
        // 服务器地址指定
        prop.put("bootstrap.servers", "192.168.133.128:9092");
        // 配置消费者组
        prop.put("group.id", "g1");
        // 配置是否自动确认offset
        prop.put("enable.auto.commit", "true");
        // 序列化
        prop.put("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
        prop.put("value.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");

        // 2.实例消费者
        final KafkaConsumer<String, String> consumer = new KafkaConsumer<String, String>(prop);

        // 4.释放资源线程安全
        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
            public void run() {
                if (consumer != null) {
                    consumer.close();
                }
            }
        }));

        // 3.订阅消息主题
        consumer.subscribe(Arrays.asList("shengdan"));

        // 4.拉消息poll, (推push)
        while (true) {
            ConsumerRecords<String, String> records = consumer.poll(1000);
            // 遍历消息
            for (ConsumerRecord<String, String> record : records) {
                System.out.println(record.topic() +"\t"+ record.value());
            }
        }
    }
}
