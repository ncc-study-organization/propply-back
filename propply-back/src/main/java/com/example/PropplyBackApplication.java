package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/* (exclude = {DataSourceAutoConfiguration.class})
 * 이건 아직 DB 연결이 없을 때 시험삼아 실행시켜보려고 넣은 것이니
 * 나중에 프로젝트 시작하면 지울 것
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@ComponentScan({"controller.*"})
public class PropplyBackApplication {

	public static void main(String[] args) {
		SpringApplication.run(PropplyBackApplication.class, args);
	}

}
