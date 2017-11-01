package com.potter.elasticsearch;

import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.potter.elasticsearch.city.service.LogService;

/**
 * 测试生成log日志
 * @author 守彬
 *
 */
//@SpringBootApplication
//public class Logstash implements CommandLineRunner{
//
//    private static final Logger logger = LoggerFactory.getLogger(Logstash.class);
//
//    public static void main(String[] args) {
//        SpringApplication.run(Logstash.class, args);
//    }
//
//    @Autowired
//    LogService logDemoService;
//
//    @Override
//    public void run(String... strings) throws Exception {
//        while(true){
//            logDemoService.generateLog();
//            Thread.sleep(1000);
//            logger.info("current thread:{},content:{}",Thread.currentThread().getName(), UUID.randomUUID().toString());
//        }
//    }
//}
