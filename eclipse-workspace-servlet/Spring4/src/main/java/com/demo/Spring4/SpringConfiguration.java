package com.demo.Spring4;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
 
@Configuration
@ComponentScan(basePackages = {"com.demo.Spring4"})
@PropertySource(value= {"classpath:/application.properties"})
public class SpringConfiguration {
//	@Bean
//	public ProductComponent getProduct() {
//		return new ProductComponent();
//	}
//	@Bean
//	public CartComponent getCart() {
//		return new CartComponent();
//	}
}