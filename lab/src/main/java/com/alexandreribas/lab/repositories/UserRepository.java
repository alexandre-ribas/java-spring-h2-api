package com.alexandreribas.lab.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alexandreribas.lab.entities.User;

public interface UserRepository extends JpaRepository <User, Long>{

}
