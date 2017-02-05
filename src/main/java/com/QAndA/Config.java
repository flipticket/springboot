package com.QAndA;

import org.hibernate.SessionFactory;
import org.hibernate.jpa.HibernateEntityManagerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;




@Configuration
@EnableAutoConfiguration 
@ComponentScan("com.QAndA")
public class Config extends SpringBootServletInitializer  {




	/**
	 * Server Start point
	 * @param args
	 * @throws Exception
	 */
/*	public static void main(String[] args) throws Exception {
		String webPort = System.getenv("PORT");
		if (webPort == null || webPort.isEmpty()) {
			webPort = "8080";
		}
		System.setProperty("server.port", webPort);
		SpringApplication.run(Config.class, args);
	}*/
	
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Config.class);
    }

    public static void main(String[] args) throws Exception {
        ApplicationContext context = SpringApplication.run(Config.class, args);
    }
	
    @Bean
    public SessionFactory sessionFactory(HibernateEntityManagerFactory hemf) {
        return hemf.getSessionFactory();
    }
	
	



}