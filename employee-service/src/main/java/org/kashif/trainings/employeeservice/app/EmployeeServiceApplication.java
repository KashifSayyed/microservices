/**
 * 
 */
package org.kashif.trainings.employeeservice.app;


import java.util.Collection;

import org.kashif.trainings.employeeservice.model.Employee;
import org.kashif.trainings.employeeservice.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
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
@ComponentScan(basePackages = "org.kashif.trainings.employeeservice")
@EnableDiscoveryClient
public class EmployeeServiceApplication implements CommandLineRunner {
	
	//private static final Logger logger = Logger.getLogger("EmployeeServiceApplication");
	
	@Autowired
	private EmployeeService employeeService;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(EmployeeServiceApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		//logger.info("EmployeeServiceApplication Started");
		
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
