package com.ttn.bootcamp.jpaassignment;

import com.ttn.bootcamp.jpaassignment.entities.Employee;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

    @Query("select firstname, lastname from Employee where salary > (select avg(salary) from Employee)")
    List<Object[]>  findSalaryGreaterThanAverage();

    @Modifying
    @Query("UPDATE Employee SET salary= :salary where salary < :avgsalary")
    void updateSalary(@Param("salary") int salary , @Param("avgsalary") int avgsalary);

    @Query("select avg(salary) from Employee")
    int findAverageSalary();

    @Modifying
    @Query("delete from Employee where salary = :minimum")
    void deleteMinimumSalary(@Param("minimum") int minimum);

    @Query("select min(salary) from Employee")
    int findMinimumSalary();

    @Query(value = "select empid, empfirstname, empage from employeetable where emplastname like '%Singh'", nativeQuery = true)
    List<Object[]> findEmployeeNQ();

    @Modifying
    @Query(value = "delete from employeetable where empage> :age", nativeQuery = true)
    void deleteEmployeeNQ(@Param ("age") int age);


}
