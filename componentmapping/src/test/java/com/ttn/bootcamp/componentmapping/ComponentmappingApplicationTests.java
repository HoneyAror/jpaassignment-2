package com.ttn.bootcamp.componentmapping;

import com.ttn.bootcamp.componentmapping.entities.Employee;
import com.ttn.bootcamp.componentmapping.entities.Salary;
import com.ttn.bootcamp.componentmapping.repos.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureTestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureTestEntityManager
class ComponentmappingApplicationTests {

	@Autowired
	EmployeeRepository repository;

	@Test
	public void testCreate() {
		Employee employee = new Employee();
		Salary salary = new Salary();

		employee.setAge(23);
		employee.setId(123);
		employee.setFirstname("HONEY");
		employee.setLastname("ARORA");

		salary.setBasicsalary((float) 30000.300);
		salary.setBonussalary(5000.500F);
		salary.setTaxamount(4300.500F);
		salary.setSpecialallowancesalary((float) 6000.200);
		employee.setSalary(salary);

		repository.save(employee);

	}

}
