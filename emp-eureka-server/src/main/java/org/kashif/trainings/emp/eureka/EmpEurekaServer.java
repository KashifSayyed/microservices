/**
 * 
 */
package org.kashif.trainings.emp.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author kashif
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class EmpEurekaServer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(EmpEurekaServer.class, args);

	}

}
