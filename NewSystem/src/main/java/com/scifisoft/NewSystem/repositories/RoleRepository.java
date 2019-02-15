package com.scifisoft.NewSystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scifisoft.NewSystem.entities.Role;

public interface RoleRepository  extends JpaRepository<Role, String>{
	 
}