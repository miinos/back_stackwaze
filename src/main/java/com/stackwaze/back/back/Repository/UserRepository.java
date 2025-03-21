package com.stackwaze.back.back.Repository;

import org.springframework.data.repository.CrudRepository;

import com.stackwaze.back.back.Model.User;

public interface UserRepository extends CrudRepository<User, String> {

}
