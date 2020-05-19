/**
 * 
 */
package org.kashif.trainings.microservice.app;


import java.util.Collection;
import java.util.logging.Logger;

import org.kashif.trainings.microservice.model.Employee;
import org.kashif.trainings.microservice.rest.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kashif
 *
 */

@SpringBootApplication
@RestController
@ComponentScan(basePackages = "org.kashif.trainings.microservice")
public class MicroServiceApplication implements CommandLineRunner {
	
	private static final Logger logger = Logger.getLogger("MicroServiceApplication");
	
	@Autowired
	private EmployeeService employeeService;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(MicroServiceApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("MicroServiceApplication Started");
		
	}


	@RequestMapping("/")
	public Collection<Employee> getAllEmployees(){
		return employeeService.getAllEmployees();
	}

	@RequestMapping("/employee/{employeeId}")
	public Employee getEmployee(@PathVariable long employeeId) {
		return employeeService.getEmployee(employeeId);
	}

}
