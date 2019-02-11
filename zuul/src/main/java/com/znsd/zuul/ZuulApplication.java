package com.znsd.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;


/**
 * 作者：伍文龙
 * 时间：2019年1月27日
 * 描述；服务网管zuul
 */
@EnableAutoConfiguration
@EnableEurekaClient
@EnableZuulProxy
@SpringBootApplication
public class ZuulApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(ZuulApplication.class, args);
	}
	
}