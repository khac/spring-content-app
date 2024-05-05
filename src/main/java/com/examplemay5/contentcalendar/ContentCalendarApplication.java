package com.examplemay5.contentcalendar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class ContentCalendarApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(ContentCalendarApplication.class, args);
		System.out.println();
		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
	}

}
