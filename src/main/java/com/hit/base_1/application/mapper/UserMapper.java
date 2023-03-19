package com.hit.base_1.application.mapper;

import com.hit.base_1.adapter.web.v1.transfer.parameter.user.CreateUserParameter;
import com.hit.base_1.application.input.CreateUserDataInput;
import com.hit.base_1.domain.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface UserMapper {

  @Mappings({
      @Mapping(target = "username", source = "input.username"),
      @Mapping(target = "password", source = "input.password"),
      @Mapping(target = "fullName", source = "input.fullName")
  })
  User toUser(CreateUserDataInput input);

  CreateUserDataInput toCreateUserDataInput(CreateUserParameter parameter);

}
