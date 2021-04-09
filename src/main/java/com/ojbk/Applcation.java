package com.ojbk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Component;


@SpringBootApplication
//@Component      //不加这个注解的话, 使用@Autowired 就不能注入进去了
//@EnableDiscoveryClient
//@ComponentScan(basePackageClasses = "com.ojbk.dao.XiangmuRenshuMapper")
//引入xml配置
//@ImportResource(locations={"classpath:config/application-bean.xml"})
//@MapperScan()
public class Applcation {
    public static void main(String[] args) {
        SpringApplication.run(Applcation.class, args);
    }
}
