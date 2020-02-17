package com.xxl.sso.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author xuxueli 2018-03-22 23:41:47
 */
@SpringBootApplication
@MapperScan("com.xxl.sso.server.mapper")
public class XxlSsoServerApplication {

	public static void main(String[] args) {
        SpringApplication.run(XxlSsoServerApplication.class, args);
	}

}