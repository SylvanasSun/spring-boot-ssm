package com.sun.sylvanas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by sylvanasp on 2016/8/25.
 */
@SpringBootApplication
@ImportResource("classpath:dubbo-provider.xml")
@ServletComponentScan("com.sun.sylvanas")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
