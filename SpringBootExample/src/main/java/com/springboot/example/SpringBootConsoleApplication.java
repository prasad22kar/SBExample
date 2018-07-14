/**
 * 
 */
package com.springboot.example;

import static java.lang.System.exit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springboot.example.service.HelloMessageService;

/**
 * @author Prasad
 *
 */

@SpringBootApplication
public class SpringBootConsoleApplication implements CommandLineRunner {

	@Autowired
	private HelloMessageService helloService;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Spring Boot Console Application Example system out statement");
//		SpringApplication.run(SpringBootConsoleApplication.class, args);
		
		SpringApplication app = new SpringApplication(SpringBootConsoleApplication.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);

	}

	public void run(String... arg0) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("Spring Boot Console Application Example overriden run method");
		if (arg0.length > 0) {
			System.out.println(helloService.getMessage(arg0[0].toString()));
		} else {
			System.out.println(helloService.getMessage());
		}

		exit(0);
	}

}
