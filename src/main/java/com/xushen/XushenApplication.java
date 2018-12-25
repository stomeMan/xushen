package com.xushen;

//import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;
import org.springframework.scheduling.annotation.EnableAsync;

<<<<<<< HEAD
import java.util.HashMap;
=======
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
>>>>>>> 0aa9c49e5c6dd1206c8ba805add91f0ef7281f74
//import org.springframework.session.data.redis.config.ConfigureRedisAction;

@SpringBootApplication
@ServletComponentScan
//@MapperScan(basePackages = {"com.shenma.run.cron.mapper"})
@ImportResource(value = {
        "classpath:/spring/dubbo-consumer.xml"
})
public class XushenApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(XushenApplication.class);
    }

//    @Bean
//    public static ConfigureRedisAction configureRedisAction() {
//        return ConfigureRedisAction.NO_OP;
//    }

    public static void main(final String[] args) {
        HashMap m=new HashMap();
<<<<<<< HEAD
=======
        List s=new ArrayList<>();
>>>>>>> 0aa9c49e5c6dd1206c8ba805add91f0ef7281f74
        System.out.println(Math.pow(2,33));
    }
}

