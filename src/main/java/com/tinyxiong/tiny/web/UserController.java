package com.tinyxiong.tiny.web;

import com.tinyxiong.tiny.common.Response;
import com.tinyxiong.tiny.domain.User;
import com.tinyxiong.tiny.repository.UserRepository;
import com.tinyxiong.tiny.vo.UserVo;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/userController")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ModelMapper modelMapper;

    @PostMapping("/add")
    @ApiOperation(value = "新增", notes = "新增一个用户", httpMethod = "POST")
    @Transactional(propagation = Propagation.REQUIRED)
    public Response add(@ApiParam @RequestBody UserVo userVo) {
        
        userRepository.save(modelMapper.map(userVo, User.class));
        return Response.newNormalResponse();
    }
}
