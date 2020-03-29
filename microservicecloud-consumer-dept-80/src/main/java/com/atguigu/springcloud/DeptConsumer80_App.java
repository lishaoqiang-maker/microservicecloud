package com.atguigu.springcloud;

import com.atguigu.myRibbonRule.MySelRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @创建人 李少强
 * @创建时间 2020/3/21
 * @描述
 */
@SpringBootApplication
@EnableEurekaClient
//在启动该微服务的时候，就能去加载我们自定义的Ribbon配置类，从而使配置生效
@RibbonClient(name="MICROSERVICECLOUD-DEPT",configuration= MySelRule.class)
public class DeptConsumer80_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer80_App.class, args);
    }
}

