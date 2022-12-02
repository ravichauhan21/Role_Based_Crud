package com.crud.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crud.entity.Role;

@Repository
public interface RoleDao extends CrudRepository<Role, String> {

}
