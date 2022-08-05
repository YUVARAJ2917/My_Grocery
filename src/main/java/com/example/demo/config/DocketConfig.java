package com.example.demo.config;

import com.fasterxml.classmate.ResolvedType;
import com.fasterxml.classmate.TypeResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.async.DeferredResult;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.AlternateTypeRules;
import springfox.documentation.schema.WildcardType;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.time.OffsetDateTime;
import java.util.Date;
import java.util.Optional;

@Configuration
@EnableSwagger2
public class DocketConfig {

    @Bean
    public Docket redeemApi(final TypeResolver typeResolver) {

        final ResolvedType responseEntityOfDeferredResultType = typeResolver.resolve(
            ResponseEntity.class,
            WildcardType.class);
        final ResolvedType deferredResultOfResponseEntity = typeResolver.resolve(
            DeferredResult.class,
            responseEntityOfDeferredResultType);

        return new Docket(DocumentationType.SWAGGER_2)
            .useDefaultResponseMessages(false)
            .enable(true)
            .apiInfo(new ApiInfoBuilder()
                .title("Loyalty Pay Client Backend Service API")
                .description("Provides APIs for Client Backend sample")
                .version("1.0.0")
                .contact(new Contact("Bridge2 Solutions", "", ""))
                .build())
            .alternateTypeRules(      // Rules run in order that they are defined
                AlternateTypeRules.newRule(
                    deferredResultOfResponseEntity,
                    WildcardType.class))
            .alternateTypeRules(AlternateTypeRules.newRule(
                typeResolver.resolve(Optional.class, OffsetDateTime.class),
                Date.class))
            .select()
            .apis(RequestHandlerSelectors.basePackage("com.example.demo"))
            .build()
            .directModelSubstitute(OffsetDateTime.class, Date.class);
    }

}