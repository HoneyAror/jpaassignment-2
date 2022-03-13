package com.ttn.bootcamp.jpaassignment;

import com.ttn.bootcamp.jpaassignment.entities.Employee;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureTestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.transaction.Transactional;
import java.util.List;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureTestEntityManager
class JpaassignmentApplicationTests {

	@Autowired
	EmployeeRepository repository;

	@Test
	void createEmployee() {
		Employee employee = new Employee();
		employee.setId(1);
		employee.setFirstname("HONEY");
		employee.setLastname("ARORA");
		employee.setAge(22);
		employee.setSalary(20000);

		repository.save(employee);
	}

	@Test
	public void testFindSalaryGreaterThanAverage() {
		List<Object[]> partialData;
		partialData = (List<Object[]>) repository.findSalaryGreaterThanAverage();
		for (Object[] objects : partialData) {
			System.out.println(objects[0]);
			System.out.println(objects[1]);
		}
	}


	@Test
	@Transactional
	@Rollback(value = false)
	public void testUpdateSalary(){
		int salary= 40000;
		int avgSalary = repository.findAverageSalary();
		repository.updateSalary(salary, avgSalary);
	}

	@Test
	@Transactional
	//@Rollback(value = false)
	public void testDeleteMinimumSalary(){
		int mini=repository.findMinimumSalary();
		repository.deleteMinimumSalary(mini);
	}

	@Test
	public void testFindEmployee(){
		List<Object[]> partialData = (List<Object[]>) repository.findEmployeeNQ();
		for(Object[] objects : partialData) {
			System.out.println(objects[0]);
			System.out.println(objects[1]);
			System.out.println(objects[2]);
		}
	}

	@Test
	@Transactional
	@Rollback(value = false)
	public void testFindPartialDataNQ(){
		repository.deleteEmployeeNQ(45);
	}

}
