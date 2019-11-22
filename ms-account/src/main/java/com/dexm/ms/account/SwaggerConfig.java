package com.dexm.ms.account;

import com.dexm.ms.account.api.ApiAccount;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Value("${build.version}") private String buildVersion;
	@Value("${build.timestamp}") private String buildTimestamp;

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage(ApiAccount.class.getPackage().getName()))
				.paths(PathSelectors.any())
				.build()
				.apiInfo(new ApiInfo(
						"MS Account",
						"Microservice to manage the account",
						String.format("%s - %s", buildVersion, buildTimestamp),
						"",
						new Contact("Dexm", null, null),
						null,
						null,
						Collections.emptyList()
				));
	}
}