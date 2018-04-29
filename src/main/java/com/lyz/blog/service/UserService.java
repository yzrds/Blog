package com.lyz.blog.service;

import com.lyz.blog.modal.vo.UserVo;

/**
 * @author youzeliang
 * on 2018/4/29
 */
public interface UserService {

    /**
     * 用戶登录
     * @param username
     * @param password
     * @return
     */
    UserVo login(String username, String password);

    /**
     * 根据主键更新user对象
     * @param userVo
     * @return
     */
    void updateByUid(UserVo userVo);

}
