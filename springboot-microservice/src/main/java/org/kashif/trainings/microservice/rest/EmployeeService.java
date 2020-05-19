/**
 * 
 */
package org.kashif.trainings.microservice.rest;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.kashif.trainings.microservice.model.Employee;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author kashif
 *
 */

@Component
public class EmployeeService {
	
	private Map<Long, Employee> employeesMap = new HashMap<>();
	
	public EmployeeService() {
		createEmployeeData();
	}
	
	public Collection<Employee> getAllEmployees(){
		return employeesMap.values();
	}

	public Employee getEmployee(@PathVariable long employeeId) {
		return employeesMap.get(employeeId);
	}
	
	private void createEmployeeData() {
		employeesMap.put(1L, new Employee(1, "Kashif", "Sayyed", "kashif.sayyed@gmail.com"));
		employeesMap.put(2L, new Employee(2, "John", "Smith", "john.smith@gmail.com"));
		employeesMap.put(3L, new Employee(3, "Chris", "Brown", "chris.brown@gmail.com"));
		employeesMap.put(4L, new Employee(4, "Mike", "Johnson", "mike.johnson@gmail.com"));
	}
}
