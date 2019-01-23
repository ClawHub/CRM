package com.clawhub.crm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * The type Crm application.
 */
@SpringBootApplication
@MapperScan("com.clawhub.crm.mapper")
@EnableTransactionManagement
public class CrmApplication {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(CrmApplication.class, args);
    }

}

