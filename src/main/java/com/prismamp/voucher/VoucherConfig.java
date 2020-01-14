package com.prismamp.voucher;

import java.time.Duration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.client.RestTemplate;

@Configuration
@PropertySource("classpath:config.properties")
@ComponentScan(basePackages = { "com.prismamp.voucher" })
public class VoucherConfig {
	
	@Value("${restTemplate.timeout}")
	private Duration timeout;
	
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplateBuilder()
				.setConnectTimeout(timeout)
				.build();
//	    return new RestTemplate();
	}
}
