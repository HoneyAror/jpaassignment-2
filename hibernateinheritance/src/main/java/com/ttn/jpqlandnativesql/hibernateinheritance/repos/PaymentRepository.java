package com.ttn.jpqlandnativesql.hibernateinheritance.repos;

import com.ttn.jpqlandnativesql.hibernateinheritance.entities.Payment;
import org.springframework.data.repository.CrudRepository;

public interface PaymentRepository extends CrudRepository<Payment, Integer> {
}
