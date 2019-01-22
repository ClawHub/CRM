package com.clawhub.crm.controller;

import com.clawhub.crm.entity.EmployeeDepartment;
import com.clawhub.crm.entity.SysUser;
import com.clawhub.crm.entity.UserResource;
import com.clawhub.crm.service.SysUserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <Description>SysUserController<br>
 *
 * @author DaShi<br>
 * @CreateDate 2019-01-22 15:41 <br>
 */
@RestController
@RequestMapping("sysUser")
public class SysUserController {
    @Autowired
    SysUserService sysUserService;
    @Autowired
    EmployeeDepartment employeeDepartment;
    @Autowired
    UserResource userResource;

    @PostMapping("signUp")
    int signUp(@RequestBody SysUser sysuser){
        //校验注册的用户名密码是否合法

        return sysUserService.signUp(sysuser);
    }


    @GetMapping("signIn")
    String signIn(@RequestBody String name,String password){
        //校验用户名是否存在

        return sysUserService.signIn(name,password);
    }

    @PostMapping("signOut")
    void signOut(){

    }

    @PostMapping("updateUserInfo")
    int updateUserInfo(@RequestBody SysUser sysUser){

        return sysUserService.updateUserInfo(sysUser);
    }

    @PostMapping("updateUserDepartment")
    int updateUserDepartment(@RequestBody EmployeeDepartment employeeDepartment){
        return sysUserService.updateUserDepartment(employeeDepartment);
    }

    @PostMapping("updateUserResource")
    int updateDepartment(@RequestBody UserResource userResource){
        return sysUserService.updateUserResource(userResource);
    }

}
