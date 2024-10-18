package com.stac.attendance.domain.service.user;

import com.stac.attendance.domain.Dtos.UserDto;
import com.stac.attendance.domain.entities.User;
import com.stac.attendance.domain.errors.exceptions.UserNotFoundException;
import com.stac.attendance.domain.mapper.UserMapper;
import com.stac.attendance.domain.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{
    private final UserRepository repository;
    private final UserMapper mapper;

    @Override
    public UserDto create(UserDto userDto) {
        return mapper.toDto(repository.save(mapper.toEntity(userDto)));
    }

    @Override
    public UserDto findOne(Long id) {
        return repository.findById(id)
                .map(mapper::toDto)
                .orElseThrow(() -> new UserNotFoundException("user with this id: "+id+" not found"));
    }

    @Override
    public List<UserDto> findAll() {
        return mapper.toDtos(repository.findAll());
    }

    @Override
    public UserDto update(UserDto userDto, Long id) {
        User getUser = repository.findById(id).orElseThrow(
                () -> new UserNotFoundException("user with this id: "+ id + " not found")
        );
        return mapper.toDto(repository.save(mapper.update(userDto, getUser)));
    }

    @Override
    public void delete(Long id) {
        if(id != null)
            repository.deleteById(id);
    }
}
