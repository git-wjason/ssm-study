package com.jason.vo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("tiger1")    //创建一个 tiger1 的Tiger类型对象
public class Tiger {
    @Value(value ="${tiger.name}")
    private String name;
    @Value(value = "${tiger.age}")  //通过配置文件给属性赋值（不是通过这里读取的）
    private Integer age;

    public Tiger() {        /*为啥只能创建无参构造*/
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Tiger{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
