package com.clawhub.crm.auth.config;

import com.clawhub.crm.entity.SysResource;
import com.clawhub.crm.service.SysResourceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * <Description> AuthAdapter<br>
 *
 * @author ClawHub<br>
 * @version 1.0<br>
 * @taskId <br>
 * @create 2019-01-24 21:44<br>
 */
@Component
public class AuthAdapter {
    /**
     * The Logger.
     */
    private Logger logger = LoggerFactory.getLogger(AuthAdapter.class);
    /**
     * The Sys resource service.
     */
    @Autowired
    private SysResourceService sysResourceService;

    /**
     * 初始化权限
     */
    public Map<String, String> loadFilterChainDefinitions() {
        // 权限控制map.从数据库获取
        Map<String, String> filterChainDefinitionMap = new LinkedHashMap<>();
        //获取所有权限
        List<SysResource> resources = sysResourceService.getAllResource();
        //测试：将鉴权关闭
//        filterChainDefinitionMap.put("/**", "anon");

        filterChainDefinitionMap.put("/auth/logout", "anon");
        filterChainDefinitionMap.put("/auth/login", "anon");
        for (SysResource resource : resources) {
            logger.info("=======================权限配置开始================================");
            logger.info("Size :{}", resources.size());
            logger.info("Url() :{}", resource);
            logger.info("Permission() :{}", resource.getAuthMark());
            filterChainDefinitionMap.put(resource.getUrl(), "perms[" + resource.getAuthMark() + "]");
            logger.info("=======================权限配置结束================================");
        }
        // 表示需要认证才可以访问
        filterChainDefinitionMap.put("/**", "authc");
        return filterChainDefinitionMap;
    }
}
