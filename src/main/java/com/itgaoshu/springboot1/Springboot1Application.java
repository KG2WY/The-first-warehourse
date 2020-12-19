package com.itgaoshu.springboot1;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
//导入Mapper扫描的注解
@MapperScan("com.itgaoshu.springboot1.UserMapper")
@EnableCaching//进行redis的操作
public class Springboot1Application {

	public static void main(String[] args) {
		SpringApplication.run(Springboot1Application.class, args);
	}

}
