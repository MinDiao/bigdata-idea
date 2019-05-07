package com.tz.kafka_producer2_patition;

import org.apache.kafka.clients.producer.Partitioner;
import org.apache.kafka.common.Cluster;

import java.util.Map;

/**
 * 三、自定义分区设置
 */
public class Patition implements Partitioner {
    public int partition(String topic, Object key, byte[] keyBytes, Object value, byte[] valueBytes, Cluster cluster) {
        return 1;
    }

    public void close() {
        // なし
    }

    public void configure(Map<String, ?> configs) {
        // なし
    }
}
