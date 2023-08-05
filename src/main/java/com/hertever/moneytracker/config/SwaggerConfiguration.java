package com.hertever.moneytracker.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
public class SwaggerConfiguration {
    @Bean
    public Docket moneyTrackerApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("developer-api")
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.hertever.moneytracker.controller"))
                .paths(PathSelectors.ant("/moneyTracker/v1/**"))
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Money Tracker Api")
                .description("Purpose is to ledger client's income and expenditure.")
                .version("1.0")
                .build();
    }
}
