package com.zty.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//等价于<bean id="user" class=com.zty.pojo.User"/>
//@Component组件
@Component
@Scope("prototype") //多例模式（原型）singleton：单例模式
public class User {

    // 相当于配置文件中 <property name="name" value="张天泳"/>
    @Value("张天泳")
    public   String name;
}
