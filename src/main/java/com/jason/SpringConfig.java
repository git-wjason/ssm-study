package com.jason;

import com.jason.vo.Student;
import org.springframework.context.annotation.*;

/*@Configuration  相当于beans.xml
* @ImportResource 相当于<bean>里面的<import:resource value="classpath:xxx.xml">导入其他容器，
*                 可以共用对象。相当于只要创建这个类代表的容器，既可以使用3个容器里面的对象
* */
@Configuration
                /*导入其他配置文件（容器对象）*/
@ImportResource(value = {"classpath:beans.xml","classpath:applicationContext.xml"})
              /*将文件导入框架*/
@PropertySource(value = "classpath:config.properties")
              /*组件扫描器——将这个包下的注解创建的对象放到本容器中*/
@ComponentScan

public class SpringConfig {
    /* @Bean:把对象注入到Spring容器中，作用相当于Bean标签
    *   说明：如果不指定对象名字，默认是方法名（creatStudent）作为对象名，
    *         相当于<bean>里面id="creatStudent"
    * */
    @Bean
    public Student creatStudent(){
        Student stu1=new Student("老吴",18,"男");
        return stu1;
    }
    /*指定对象的名字，id="LisiStudent".*/
    @Bean(name = "LisiStudent")
    public Student creatStudent2(){
        Student stu2=new Student("李四",28,"男");
        return stu2;
    }
}
