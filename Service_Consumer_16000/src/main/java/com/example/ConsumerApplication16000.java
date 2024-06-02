package com.example;

import com.example.rule.CustomThreeTimeLoadBalancer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableFeignClients
@LoadBalancerClient(name="provider-server")
public class ConsumerApplication16000 {
//    /**
//     * 使用spring提供的RestTemplate发送http请求调用微服务
//     */
//    @Bean
//    @LoadBalanced
//    public RestTemplate getRestTemplate(){
//        return  new RestTemplate();
//    }

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication16000.class,args);
    }
}
