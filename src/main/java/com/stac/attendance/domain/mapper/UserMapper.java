package com.stac.attendance.domain.mapper;

import com.stac.attendance.domain.Dtos.UserDto;
import com.stac.attendance.domain.entities.User;
import org.mapstruct.*;

import java.time.ZonedDateTime;
import java.util.Date;
import java.util.List;

@Mapper(componentModel = "spring", imports = Date.class)
public interface UserMapper {
    UserDto toDto(User user);

    @Mapping(target = "createdAt", defaultExpression = "java(new Date())")
    User toEntity(UserDto dto);

    List<UserDto> toDtos(List<User> users);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    @Mapping(target = "updatedAt", defaultExpression = "java(new Date())")
    User update(UserDto dto, @MappingTarget User user);
}
