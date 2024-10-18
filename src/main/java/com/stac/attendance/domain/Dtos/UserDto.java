package com.stac.attendance.domain.Dtos;

import com.stac.attendance.domain.entities.enummerations.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.ZonedDateTime;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDto {
    private Long id;
    private String username;
    private String email;
    private String phone;
    private String password;
    private Role role;
    private Date createdAt;
    private Date updatedAt;
}
