package com.scifisoft.NewSystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.scifisoft.NewSystem.entities.User;
import com.scifisoft.NewSystem.services.UserService;

@SpringBootApplication
public class NewSystemApplication implements CommandLineRunner{

	 @Autowired
	   private UserService userService;
	     
	public static void main(String[] args) {
		SpringApplication.run(NewSystemApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		  {
  		  User newAdmin = new User("admin@mail.com", "ADMIN", "123456");
  		  userService.createAdmin(newAdmin);
  	  }
	}

}

