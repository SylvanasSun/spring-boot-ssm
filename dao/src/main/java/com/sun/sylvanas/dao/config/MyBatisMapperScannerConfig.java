package com.sun.sylvanas.dao.config;

import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis扫描接口配置
 * 使用的tk.mybatis.spring.mapper.MapperScannerConfigurer，如果你不使用通用Mapper，可以改为org.xxx...
 *
 * Created by sylvanasp on 2016/8/25.
 */
@Configuration
// 注意，由于MapperScannerConfigurer执行的比较早，所以必须有下面的注解
@AutoConfigureAfter(MyBatisConfig.class)
public class MyBatisMapperScannerConfig {

    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer() {
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
        mapperScannerConfigurer.setBasePackage("com.sun.sylvanas.dao.mapper");
//        Properties properties = new Properties();
//        properties.setProperty("mappers", "com.sun.sylvanas.dao.util.MyMapper");
//        properties.setProperty("notEmpty", "false");
//        properties.setProperty("IDENTITY", "MYSQL");
//        mapperScannerConfigurer.setProperties(properties);
        return mapperScannerConfigurer;
    }

}
