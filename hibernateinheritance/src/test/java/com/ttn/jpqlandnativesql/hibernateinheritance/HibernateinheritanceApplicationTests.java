package com.ttn.jpqlandnativesql.hibernateinheritance;

import com.ttn.jpqlandnativesql.hibernateinheritance.entities.Check;
import com.ttn.jpqlandnativesql.hibernateinheritance.entities.CreditCard;
import com.ttn.jpqlandnativesql.hibernateinheritance.repos.PaymentRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureTestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureTestEntityManager
class HibernateinheritanceApplicationTests {

	@Autowired
	PaymentRepository repository;

	@Test
	void contextLoads() {
	}

	@Test
		public void createPaymenmt(){
		CreditCard cc =new CreditCard();
		cc.setId(123);
		cc.setAmount(1000);
		cc.setCardnumber("1234567890");

		repository.save(cc);
	}

	@Test
	public void createCheckPayment(){
		Check ch= new Check();
		ch.setId(124);
		ch.setAmount(1000);
		ch.setChecknumber("1234567890");

		repository.save(ch);
	}

}
