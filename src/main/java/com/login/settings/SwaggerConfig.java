package com.login.settings;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
    Docket productApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.login.resources"))
                .paths(PathSelectors.any())
                .build();
                //.apiInfo(metaInfo());
    }

    /*@SuppressWarnings("rawtypes")
	private ApiInfo metaInfo() {

        ApiInfo apiInfo = new ApiInfo(
                "Documentação com Swagger",
                "Endpoints referente a bethstore",
                "1.0",
                "Terms of Service",
                new Contact("Vitor Santos", null,
                        "sebastiao.vitor@souunit.com.br"),
                "Apache License Version 2.0",
                "https://www.apache.org/licesen.html", new ArrayList<VendorExtension>()
        );

        return apiInfo;
    }*/

}
