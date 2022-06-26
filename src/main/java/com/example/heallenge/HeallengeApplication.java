package com.example.heallenge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication

// 정의 변수 설정
@PropertySource("classpath:global.properties")

// 컨트롤러, 서비스
@ComponentScan(basePackages = {
	"com.example.restcontroller",
	"com.example.service",
}) 

// 엔티티
@EntityScan(basePackages = {
	"com.example.entity"
})

// 저장소
@EnableJpaRepositories(basePackages = {
	"com.example.repository"
})

public class HeallengeApplication {

	public static void main(String[] args) {
		SpringApplication.run(HeallengeApplication.class, args);
	}

}
