package com.dexm.ms.api;

import com.netflix.zuul.ZuulFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class MsApiApplication {

	@Bean
	public ZuulFilter xForwardedForSwagger() {

		return new RemoveXForwardedForSwagger();
	}

	public static void main(String[] args) {
		SpringApplication.run(MsApiApplication.class, args);
	}
}
