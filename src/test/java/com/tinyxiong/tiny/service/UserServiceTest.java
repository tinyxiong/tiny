package com.tinyxiong.tiny.service;

import com.tinyxiong.tiny.enumtype.EnabledType;
import com.tinyxiong.tiny.vo.UserVo;
import common.AbstractComponentTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class UserServiceTest extends AbstractComponentTest {

    @Autowired
    private UserService userService;

    @Test
    public void testSave() throws Exception {
        UserVo uservo = new UserVo();
        uservo.setName("testNG test");
        uservo.setEnabled(EnabledType.ENABLED);
        uservo.setOrgId(1L);
        uservo.setPassword("111");
        uservo.setPhone("1121");

        userService.save(uservo);
    }

}