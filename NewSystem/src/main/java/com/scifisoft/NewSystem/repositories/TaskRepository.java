package com.scifisoft.NewSystem.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scifisoft.NewSystem.entities.Task;
import com.scifisoft.NewSystem.entities.User;

public interface TaskRepository  extends JpaRepository<Task, Long>{

	List<Task> findByUser(User user); 
	
}
