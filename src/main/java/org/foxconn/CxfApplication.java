package org.foxconn;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("org.foxconn.dao")
public class CxfApplication {
	public static void main(String[] args) {
		SpringApplication.run(CxfApplication.class,args);
	}
}
