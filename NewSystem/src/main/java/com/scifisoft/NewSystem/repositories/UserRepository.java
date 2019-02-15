package com.scifisoft.NewSystem.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scifisoft.NewSystem.entities.User;

public interface UserRepository  extends JpaRepository<User, String> {

	List<User> findByNameLike(String name); 

}