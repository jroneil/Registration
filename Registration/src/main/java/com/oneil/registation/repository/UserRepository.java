package com.oneil.registation.repository;
import org.springframework.data.repository.CrudRepository;

import com.oneil.registation.config.entity.User;
public interface UserRepository extends CrudRepository<User, Integer>{

}
