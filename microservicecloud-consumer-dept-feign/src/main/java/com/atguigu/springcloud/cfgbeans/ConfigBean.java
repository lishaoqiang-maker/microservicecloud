package com.atguigu.springcloud.cfgbeans;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @创建人 李少强
 * @创建时间 2020/3/21
 * @描述 //boot --> spring applicationContext.xml -- @Configuartion配置 ConfigBean = applicationContext.xml
 */
@Configuration
public class ConfigBean {
    @Bean
    @LoadBalanced// 开启负载均衡Spring Cloud Ribbon是基于Netflix Ribbon实现的一套客户端       负载均衡的工具。
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

//    /**
//     * Ribbon默认实现的是轮询RoundRobinRule 软负载，现在自定义为其他内置软负载
//     * @return
//     */
//    @Bean
//    public IRule myRule(){
////        return new RoundRobinRule();//轮询
//        return new RandomRule();// 随机
//    }
}
