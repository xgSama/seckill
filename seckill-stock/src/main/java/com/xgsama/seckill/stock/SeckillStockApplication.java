package com.xgsama.seckill.stock;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.Environment;

/**
 * SeckillStockApplication
 *
 * @author : xgSama
 * @date : 2021/9/1 20:53:08
 */
@Slf4j
@SpringBootApplication
public class SeckillStockApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SeckillStockApplication.class, args);
        Environment env = context.getEnvironment();
        String port = env.getProperty("server.port");
        String path = env.getProperty("server.servlet.context-path");

        log.info("\n----------------------------------------------------------\n\t" +
                "库存服务 is running! Access URLs:\n\t" +
                "Local: \t\thttp://localhost:" + port + path + "/\n\t" +
                "swagger-ui: \thttp://localhost:" + port + path + "/swagger-ui.html\n\t" +
                "actuator: \thttp://localhost:" + port + path + "/actuator/info\n\t" +
                "----------------------------------------------------------");

    }
}
