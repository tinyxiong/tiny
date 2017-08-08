package com.tinyxiong.tiny.service;

import com.tinyxiong.tiny.domain.User;
import com.tinyxiong.tiny.repository.UserRepository;
import com.tinyxiong.tiny.vo.UserVo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ModelMapper modelMapper;

    public void save(UserVo userVo) {
        userRepository.save(modelMapper.map(userVo, User.class));
    }

}
