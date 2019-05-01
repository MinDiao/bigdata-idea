package com.tz.hbasemr_two;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.client.Put;
import org.apache.hadoop.hbase.io.ImmutableBytesWritable;
import org.apache.hadoop.hbase.mapreduce.TableMapReduceUtil;
import org.apache.hadoop.mapred.FileInputFormat;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.util.Tool;
import org.apache.hadoop.util.ToolRunner;

public class LoveDriver implements Tool {
    private Configuration conf;

    public static void main(String[] args) throws Exception {
        int status = ToolRunner.run(new LoveDriver(), args);
    }

    public void setConf(Configuration configuration) {
        this.conf = HBaseConfiguration.create();
    }

    public Configuration getConf() {
        return this.conf;
    }

    public int run(String[] strings) throws Exception {
        // 1.创建job
        Job job = Job.getInstance(conf);
        job.setJarByClass(LoveDriver.class);

        // 2.配置mapper
        job.setMapperClass(ReadLoveFromHDFSMapper.class);
        job.setMapOutputKeyClass(ImmutableBytesWritable.class);
        job.setOutputValueClass(Put.class);

        // 3.配置reducer
        TableMapReduceUtil.initTableReducerJob("lovehdfs", WriteLoveReducer.class, job);
        // 4.配置输入InputFormat
        FileInputFormat.addInputPath(job, new Path("/lovehbase/"));
        // 5.输出
        return job.waitForCompletion(true) ? 0 : 1;
    }
}
