package com.stackwaze.back.back.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.stackwaze.back.back.Model.User;
import com.stackwaze.back.back.Service.UserService;

@RestController
public class UserController {

  @Autowired
  UserService usersService;

  /**
   * Read - Get one user
   * 
   * @param id The id of the user
   * @return An Employee object full filled
   */
  @GetMapping("/user/{id}")
  public User getUser(@PathVariable final String id) {
    Optional<User> user = usersService.getUser(id);
    if (user.isPresent()) {
      return user.get();
    } else {
      return null;
    }
  }

  @GetMapping("/users")
  public Iterable<User> getUsers() {
    return usersService.getUsers();
  }
}
