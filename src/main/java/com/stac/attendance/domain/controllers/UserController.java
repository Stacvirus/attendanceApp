package com.stac.attendance.domain.controllers;

import com.stac.attendance.domain.Dtos.UserDto;
import com.stac.attendance.domain.service.user.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.Level;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
@Slf4j
public class UserController {
    private final UserService service;

    @PostMapping
    public ResponseEntity<UserDto> create(@RequestBody UserDto dto){
        log.info("user input: =========>>>>>>>>>>>: "+ dto.toString());
        return new ResponseEntity<>(service.create(dto), HttpStatus.CREATED);
    }


}
