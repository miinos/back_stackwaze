package com.stackwaze.back.back.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stackwaze.back.back.Model.User;
import com.stackwaze.back.back.Repository.UserRepository;

@Service
public class UserService {
  @Autowired
  private UserRepository userRepository;

  public Optional<User> getUser(final String id) {
    return userRepository.findById(id);
  }

  public Iterable<User> getUsers() {
    return userRepository.findAll();
  }
}
