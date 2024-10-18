package com.stac.attendance.domain.service.user;

import com.stac.attendance.domain.Dtos.UserDto;
import com.stac.attendance.domain.entities.User;

import java.util.List;

public interface UserService {
    UserDto create(UserDto dto);

    UserDto findOne(Long id);

    List<UserDto> findAll();

    UserDto update(UserDto user, Long id);

    void delete(Long id);
}
