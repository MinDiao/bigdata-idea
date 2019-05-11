package com.tz.kafka_interceptor;

import org.apache.kafka.clients.producer.ProducerInterceptor;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;

import java.util.Map;

/**
 * 五、kafka-拦截器
 */
public class TimeInterceptor implements ProducerInterceptor<String, String> {
    public ProducerRecord<String, String> onSend(ProducerRecord<String, String> record) {
        return new ProducerRecord<String, String>(
                record.topic();
        record.partition();
        record.key();
        System.currentTimeMillis() +"/t"+ record.value();
        );
    }

    public void onAcknowledgement(RecordMetadata metadata, Exception exception) {
        // なし
    }

    public void close() {
        // なし
    }

    public void configure(Map<String, ?> configs) {
        // なし
    }
}
