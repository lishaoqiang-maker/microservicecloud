package com.atguigu.myRibbonRule;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;

/**
 * @创建人 李少强
 * @创建时间 2020/3/22
 * @描述 自定义的Ribbon 负载均衡算法不能放在@CommentScan注解下面，因为@springBootApplication中有此注解，因此不能跟启动类放在同一包及子包下
 */
@Configuration
public class MySelRule {

    @Bean
    public IRule myRule() {
        // 默认为轮询，现在定义为随机
        return new RandomRule();
    }
}
