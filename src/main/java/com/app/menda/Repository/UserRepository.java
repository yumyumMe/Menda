package com.app.menda.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.menda.Entity.Users;

@Repository
public interface UserRepository extends JpaRepository <Users ,Integer> {
    
}
