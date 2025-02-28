package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

// 와일드카드(*)로 인식을 다 했으므로 패키지 형식을 맞추면 된다.
@SpringBootApplication
@ComponentScan({"controller.*", "entity.*", "repository.*", "service.*"})
@EnableJpaRepositories("repository.*")
@EntityScan("entity.*")
public class PropplyBackApplication {

	public static void main(String[] args) {
		SpringApplication.run(PropplyBackApplication.class, args);
	}

}
