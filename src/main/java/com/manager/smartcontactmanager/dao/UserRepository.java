package com.manager.smartcontactmanager.dao;

import com.manager.smartcontactmanager.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}
