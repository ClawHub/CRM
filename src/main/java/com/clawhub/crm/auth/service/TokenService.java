package com.clawhub.crm.auth.service;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * <Description> token服务<br>
 *
 * @author ClawHub<br>
 * @version 1.0<br>
 * @taskId <br>
 * @create 2019-01-24 21:37<br>
 */
@Component
public class TokenService {
    public Map<String, Object> getInfo(String username) {
//        用户，角色，权限资源入redis
        Map<String, Object> map = new HashMap<>();
        map.put("username", username);
        map.put("user", "用户信息");
        map.put("role", "角色信息");
        map.put("resource", "资源信息");
        return map;
    }
}
