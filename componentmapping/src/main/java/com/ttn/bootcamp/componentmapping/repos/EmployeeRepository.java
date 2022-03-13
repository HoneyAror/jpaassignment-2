package com.ttn.bootcamp.componentmapping.repos;

import com.ttn.bootcamp.componentmapping.entities.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
