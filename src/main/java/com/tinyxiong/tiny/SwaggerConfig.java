package com.tinyxiong.tiny;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket createRestApi() {
        /**  在每个的 request 里面带入 {"userId":4,"account":"123"}  这个信息  */
        ParameterBuilder aParameterBuilder = new ParameterBuilder();
        aParameterBuilder
                .parameterType("header") //参数类型支持header, cookie, body, query etc
                .name("CURRENT_LOGIN_USER_CONTEXT") //参数名
                .defaultValue("{\"userId\":4,\"account\":\"123\"}") //默认值
                .description("Login User Context")
                .modelRef(new ModelRef("string"))//指定参数值的类型
                .required(false).build(); //非必需，这里是全局配置，然而在登陆的时候是不用验证的
        List<Parameter> aParameters = new ArrayList<Parameter>();
        aParameters.add(aParameterBuilder.build());

        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.tinyxiong"))
                .paths(PathSelectors.any())
                .build().globalOperationParameters(aParameters);

    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Swagger Test2")
                .description("Swagger Test2 description")
                .termsOfServiceUrl("http://gitbook sharing")
                .contact("tinyxiong")
                .version("1.0")
                .build();
    }

}