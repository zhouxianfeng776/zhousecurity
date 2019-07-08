package com.zhou.test.config;

import com.fasterxml.classmate.TypeResolver;
import com.google.common.base.Predicate;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.async.DeferredResult;
import springfox.documentation.builders.*;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.schema.WildcardType;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Parameter;
import springfox.documentation.service.ResponseMessage;
import springfox.documentation.service.Tag;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static springfox.documentation.builders.PathSelectors.regex;
import static springfox.documentation.schema.AlternateTypeRules.*;
import static com.google.common.collect.Lists.*;
import static com.google.common.base.Predicates.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author 01384526
 * @title: Swagger2Configuration
 * @projectName zhousecurity
 * @description: TODO
 * @date 2019/5/2715:56
 */
@EnableSwagger2
@Configuration
@ConditionalOnExpression("${swagger.enable: true}")
public class Swagger2Configuration {

    @Autowired
    private TypeResolver typeResolver;

    @Bean
    public Docket testRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("test")
                .apiInfo(apiInfo())
                .select()
                .paths(petstorePaths())
                .build()
                .enableUrlTemplating(true)
                .globalOperationParameters(
                        newArrayList( new ParameterBuilder()
                                .name("someGlobalParameter")
                                .description("Description of someGlobalParameter")
                                .modelRef(new ModelRef("string"))
                                .parameterType("query")
                                .required(false)
                                .build()))
                ;
    }
    @Bean
    public Docket myRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("my")
                .apiInfo(apiInfo())
                .select()
                .paths(regex("/my.*"))
                .build()
                .enableUrlTemplating(true)
                .globalOperationParameters(
                        newArrayList( new ParameterBuilder()
                                .name("someGlobalParameter")
                                .description("Description of someGlobalParameter")
                                .modelRef(new ModelRef("string"))
                                .parameterType("query")
                                .required(false)
                                .build()))
                ;
    }

    @Bean
    public Docket createRestApi() {
        ParameterBuilder ticketPar = new ParameterBuilder();
        List<Parameter> pars = new ArrayList<>();
        //header中的ticket参数非必填，传空也可以
        ticketPar.name("Authorization").description("用户访问令牌")
                .modelRef(new ModelRef("string")).parameterType("header")
                .required(false).build();
        //根据每个方法名也知道当前方法在设置什么参数
        pars.add(ticketPar.build());
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.withClassAnnotation(Api.class))
                .build().globalOperationParameters(pars);
    }

    private Predicate<String> petstorePaths() {
        return or(
                regex("/test.*")
        );
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("WMS系统")
                .description("开发文档")
                .termsOfServiceUrl("http://springfox.io")
                .license("Apache License Version 2.0")
                .licenseUrl("https://github.com/springfox/springfox/blob/master/LICENSE")
                .version("1.0.0")
                .build();
    }

}
