package com.stackwaze.back.back.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "users")
public class User {
  @Id
  @Column(name = "uid", length = 20)
  private String uid;

  @Column(name = "name", length = 50)
  private String name;

}
