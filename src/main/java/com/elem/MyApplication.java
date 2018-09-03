package com.elem;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan
public class MyApplication {

	
	public static void main(String[] args) {
		/**
		 * 
		 */
		SpringApplication.run(MyApplication.class, args);
	}

}
