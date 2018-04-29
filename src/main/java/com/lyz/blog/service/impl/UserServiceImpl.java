package com.lyz.blog.service.impl;

import com.lyz.blog.dao.UserVoMapper;
import com.lyz.blog.modal.vo.UserVo;
import com.lyz.blog.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.apache.commons.lang3.StringUtils;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;


/**
 * @author youzeliang
 * on 2018/4/29
 */
public class UserServiceImpl implements UserService {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

    @Resource
    private UserVoMapper userDao;




    @Override
    public UserVo login(String username, String password) {
        if (StringUtils.isBlank(username) || StringUtils.isBlank(password)) {
            throw new TipException("用户名和密码不能为空");
        }
    }

    @Override
    public void updateByUid(UserVo userVo) {

    }
}
