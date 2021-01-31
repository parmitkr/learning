package com.learning.boot.learning;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	// swagger UI
//http://localhost:8080/swagger-ui/  

	// doc
	// http://localhost:8080/v2/api-docs

	public static final Contact DEFAULT_CONTACT = new Contact("Parmit kumar", "www.parmit.kumar", "parmitkr@gmail.com");
	public static final ApiInfo DEFAULT = new ApiInfo("Learning Api Documentation", "Learning Api Documentation", "1.0", "urn:tos",
			DEFAULT_CONTACT, "Apache 2.0", "http://www.apache.org/licenses/LICENSE-2.0", new ArrayList<>());

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(DEFAULT);
	}

}
