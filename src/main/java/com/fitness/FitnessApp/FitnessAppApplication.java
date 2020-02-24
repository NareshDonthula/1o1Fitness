package com.fitness.FitnessApp;
import java.io.IOException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;

import com.fitness.FitnessApp.utils.PropertiesUtils;

@SpringBootApplication
@EnableAutoConfiguration
public class FitnessAppApplication extends SpringBootServletInitializer{
	@Value("${cloudFrountUrl}")
    private String cloudFrountUrl;
	
	@Value("${env.name}")
    private String envName;
	@Override
	 protected SpringApplicationBuilder configure(SpringApplicationBuilder app) {
	         return app.sources(FitnessAppApplication.class);
	     }
	public static void main(String[] args) throws IOException {
		    PropertiesUtils.initProperties();
	        ConfigurableApplicationContext context = SpringApplication.run(FitnessAppApplication.class, args);
	        FitnessAppApplication fitnessAppApplication = context.getBean(FitnessAppApplication.class);
	        printEnvironmentsProperties(fitnessAppApplication);
	}
	/*public static String getAppVersion() throws IOException{

	    String versionString = null;

	    //to load application's properties, we use this class
	    Properties mainProperties = new Properties();

	    FileInputStream file;

	    //the base folder is ./, the root of the main.properties file  
	    String path = "./application1.properties";

	    //load the file handle for main.properties
	    file = new FileInputStream(path);

	    //load all the properties from this file
	    mainProperties.load(file);

	    //we have loaded the properties, so close the file handle
	    file.close();

	    //retrieve the property we are intrested, the app.version
	    versionString = mainProperties.getProperty("cloudFrountUrl");
         System.out.println("****"+ versionString);
	    return versionString;
	}*/
	 private static void printEnvironmentsProperties(FitnessAppApplication FitnessAppApplication) {
	        StringBuilder stringBuilder = new StringBuilder("Properties Files ......\n");

	        stringBuilder.append("env.name").append(" : ").append(FitnessAppApplication.envName).append("\n")
	                .append("cloudFrountUrl").append(" : ").append(FitnessAppApplication.cloudFrountUrl).append("\n");
	                
	               
	        System.out.println(stringBuilder.toString());
	    }
}

