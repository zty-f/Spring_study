package com.zty.config;

import com.zty.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

//@Configuration代表这是一个配置类，相对于beans.xml
@Configuration
@ComponentScan("com.zty.pojo")

//合并两个配置类
@Import(MyConfig2.class)
public class MyConfig {
    // @Bean 表示注册一个bean
    // 方法的名字即是bean中的id
    // 方法的返回值就是bean中的class
    @Bean
    public User user(){
        return new User();
    }
}
