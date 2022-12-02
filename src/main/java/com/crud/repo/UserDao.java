package com.crud.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.crud.entity.User;
@Repository
public interface UserDao extends CrudRepository<User, String> {
}