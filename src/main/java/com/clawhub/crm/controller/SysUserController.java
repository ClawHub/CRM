package com.clawhub.crm.controller;

import com.clawhub.crm.core.result.ResultUtil;
import com.clawhub.crm.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <Description>系统用户网关<br>
 *
 * @author DaShi<br>
 * @CreateDate 2019-01-22 15:41 <br>
 */
@RestController
@RequestMapping("sysUser")
public class SysUserController {

    /**
     * 系统用户服务接口
     */
    @Autowired
    private SysUserService sysUserService;

    /**
     * 注册
     *
     * @param sysUser 用户信息
     * @return the int
     */
    @PostMapping("signUp")
    public String signUp(@RequestBody SysUser sysUser) {
        //校验注册的用户名密码是否合法
        if (null == sysUser) {
            return ResultUtil.getError("2001");
        }
        return ResultUtil.getSucc(sysUserService.signUp(sysUser));
    }


//    /**
//     * 登陆
//     *
//     * @param name     the name
//     * @param password the password
//     * @return the string
//     */
//    @GetMapping("signIn")
//    public String signIn(@RequestBody String name, String password) {
//        //校验用户名是否存在
//
//        return sysUserService.signIn(name, password);
//    }

//    @PostMapping("signOut")
//    public void signOut() {
//
//    }

}
