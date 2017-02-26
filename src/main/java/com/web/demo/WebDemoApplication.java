package com.web.demo;

import com.web.demo.utils.Config;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
@MapperScan("com.cuckoo.web.mysql.mapper")
public class WebDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebDemoApplication.class, args);
	}


	@PostConstruct
	public void configLoad() throws Exception {
		Config.reload();
	}
}
