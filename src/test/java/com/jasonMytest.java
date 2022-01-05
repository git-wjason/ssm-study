package com;

import com.jason.config.SpringConfig;
import com.jason.vo.Cat;
import com.jason.vo.Student;
import com.jason.vo.Tiger;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class jasonMytest {
    @Test/*使用beans.xm作为配置文件*/
    public void test01(){
        String config="beans.xml";
        ApplicationContext ctx=new ClassPathXmlApplicationContext(config);
        Student student=(Student)ctx.getBean("myStudent");
        System.out.println("使用beans.xml容器="+student);
    //myStudent=Student{name='张三', age=15, sex='女'}
    }
    @Test
    public void test02(){
        ApplicationContext ctx=new AnnotationConfigApplicationContext(SpringConfig.class);
        Student stu2=(Student) ctx.getBean("creatStudent");
        System.out.println("使用java类当容器="+stu2);
    //使用java类当容器=Student{name='老吴', age=18, sex='男'}
    }
    /*指定对象的名称*/
    @Test
    public void test03(){
        ApplicationContext ctx=new AnnotationConfigApplicationContext(SpringConfig.class);
        Student stu3=(Student) ctx.getBean("LisiStudent");
        System.out.println("使用java类当容器，指定对象名称="+stu3);
        //使用java类当容器，指定对象名称=Student{name='李四', age=28, sex='男'}
    }
    /*测试容器导入集合*/
    @Test
    public void test04(){
        ApplicationContext ctx=new AnnotationConfigApplicationContext(SpringConfig.class);
        Student stu4=(Student) ctx.getBean("LisiStudent");
        System.out.println("使用容器导入的LisiStudent===="+stu4);
        //使用容器导入的LisiStudent====Student{name='李四', age=28, sex='男'}
        Cat cat=(Cat)ctx.getBean("myCat1");
        System.out.println("使用容器导入的myCat1===="+cat);
        //使用容器导入的myCat1====Cat{name='mimi', sex='mumao', id=32454352}
        Student stu2=(Student) ctx.getBean("creatStudent");
        System.out.println("使用容器导入的creatStudent===="+stu2);
        //使用容器导入的creatStudent====Student{name='老吴', age=18, sex='男'}
    }
    @Test
    public void test05(){
        ApplicationContext ctx=new AnnotationConfigApplicationContext(SpringConfig.class);
        Tiger tiger=(Tiger) ctx.getBean("tiger1");
        System.out.println("用【注解+配置文件】创建的对象tiger==="+tiger);
        //用【注解+配置文件】创建的对象tiger===Tiger{name='东北虎', age=6}
    }
    @Test
    public void test06(){
        ApplicationContext ctx=new AnnotationConfigApplicationContext(com.jason.SpringConfig.class);
        Tiger tiger=(Tiger) ctx.getBean("tiger1");
        System.out.println("用组件扫描器默认扫描包 创建的对象tiger==="+tiger);
        //用【注解+配置文件】创建的对象tiger===Tiger{name='东北虎', age=6}
    }

}
