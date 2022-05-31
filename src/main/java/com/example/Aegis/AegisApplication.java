package com.example.Aegis;

import com.example.Aegis.domain.User;
import com.example.Aegis.domain.User_Role;
import com.example.Aegis.repository.User_Repo;
import com.example.Aegis.repository.User_Role_Repo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AegisApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(AegisApplication.class, args);
		User_Repo userRepo=context.getBean(User_Repo.class);

		User user=new User();
		//user.setFirstName("Vishal");
		//user.setLastName("Kumar");
		//user.setEmailId("vishalkumar51095@gmail.com");
		//user.setDob();
		//user.setMobileNo("98989898");
		//user.setUserRole("developer");
		//user.getBalance();
		//user.setBalance(98.0d);
		//User user1= userRepo.save(user);
		//System.out.println(user1);

	}

}
