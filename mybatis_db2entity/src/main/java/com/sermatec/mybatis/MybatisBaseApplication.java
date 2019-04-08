package com.sermatec.mybatis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication

public class MybatisBaseApplication {

    public static void main(String[] args) {
        //执行：mvn mybatis-generator:generate
        SpringApplication.run(MybatisBaseApplication.class, args);
    }

}
