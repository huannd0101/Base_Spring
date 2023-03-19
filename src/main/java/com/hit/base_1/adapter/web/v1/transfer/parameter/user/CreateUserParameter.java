package com.hit.base_1.adapter.web.v1.transfer.parameter.user;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CreateUserParameter {

  private String username;

  private String password;

  private String fullName;

}
