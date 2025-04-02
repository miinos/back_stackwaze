package com.stackwaze.back.back.Controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.stackwaze.back.back.Model.User;
import com.stackwaze.back.back.Service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {

  @Autowired
  UserService userService;

  @Operation(summary = "Get user by ID", description = "Retrieves a user based on a user ID")
  @ApiResponse(responseCode = "200", description = "User found", content = @Content(schema = @Schema(implementation = User.class)))
  @ApiResponse(responseCode = "404", description = "User not found")
  @GetMapping("/{userId}")
  public Optional<User> getUserById(
      @Parameter(description = "ID of the user") @PathVariable String userId) {
    // Implementation
    return userService.getUser(userId);
  }
}