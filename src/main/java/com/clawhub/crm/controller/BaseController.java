package com.clawhub.crm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <Description> 基础网关<br>
 *
 * @author ClawHub<br>
 * @version 1.0<br>
 * @taskId <br>
 * @create 2019-01-21 21:14<br>
 */
@RestController
@RequestMapping("base")
public class BaseController {

    @GetMapping("welcome")
    public String welcome() {
        return "welcome to crm!";
    }
}
