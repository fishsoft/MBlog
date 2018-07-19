package com.morse;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by mac on 2017/1/8.
 */
@Configuration  //说明这个是spring的设置
@EnableWebMvc   //不是SpringBoot需要引入这个
@EnableSwagger2 //开启Swagger2
@ComponentScan("com.morse.controller")  //指定被扫描Controller的位置
public class Swagger2SpringMvc extends WebMvcConfigurerAdapter {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)  //Docket，Springfox的私有API设置初始化为Swagger2
                .select()
//                .apis(RequestHandlerSelectors.basePackage("cn.acheng1314.controller"))    //此处设置扫描包和上面设置的扫描包一样效果
                .paths(PathSelectors.any())
                .build()
                .apiInfo(new ApiInfoBuilder()   //设置API文档的主体说明
                        .title("博客Apis")
                        .description("雨下一整夜的博客APIs")
                        .version("1.01")
                        .termsOfServiceUrl("http://acheng1314.cn/")
                        .build());
    }

}

