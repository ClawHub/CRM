package com.clawhub.crm.auth.config;

import com.clawhub.crm.entity.SysResource;
import com.clawhub.crm.entity.SysUser;
import com.clawhub.crm.service.SysResourceService;
import com.clawhub.crm.service.SysRoleService;
import com.clawhub.crm.service.SysUserService;
import org.apache.commons.collections.CollectionUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

/**
 * <Description> 自定义权限匹配和账号密码匹配  <br>
 *
 * @author LiZhiming<br>
 * @version 1.0<br>
 * taskId <br>
 * @CreateDate 2018年02月07日<br>
 */
@Component
public class MyShiroRealm extends AuthorizingRealm {

    /**
     * The Logger.
     */
    private Logger logger = LoggerFactory.getLogger(MyShiroRealm.class);

    /**
     * The Sys role service.
     */
    @Autowired
    private SysRoleService sysRoleService;

    /**
     * The Sys resource service.
     */
    @Autowired
    private SysResourceService sysResourceService;

    /**
     * The Sys user service.
     */
    @Autowired
    private SysUserService sysUserService;

    /**
     * Description: Do get authorization info <br>
     * 授权认证 看当前用户是否拥有访问某一资源的权限
     *
     * @param principals principals
     * @return authorization info
     * @author LiZhiming <br>
     * @taskId <br>
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        logger.info("权限配置-->MyShiroRealm.doGetAuthorizationInfo()");
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        //获取用户信息
        SysUser userInfo = (SysUser) principals.getPrimaryPrincipal();
        logger.info("userInfo :{}" + userInfo);
        if (userInfo == null) {
            return null;
        }
        //根据用户信息获取角色名称列表
        Set<String> roles = sysRoleService.findRoleNamesByUserId(userInfo.getUserId());
        logger.info("角色名称列表：{}", roles);
        authorizationInfo.addRoles(roles);

        //根据用户信息获取权限列表
        Set<SysResource> resources = sysResourceService.findSysResourcesByUserId(userInfo.getUserId());
        Set<String> permissions = new HashSet<>();
        if (!CollectionUtils.isEmpty(resources)) {
            for (SysResource sysResource : resources) {
                permissions.add(sysResource.getAuthMark());
            }
        }
        logger.info("权限列表：{}", permissions);
        authorizationInfo.addStringPermissions(permissions);
        return authorizationInfo;
    }

    /**
     * Description: 主要是用来进行身份认证的，也就是说验证用户输入的账号和密码是否正确<br>
     *
     * @param token token
     * @return authentication info
     * @throws AuthenticationException authentication exception
     * @author LiZhiming <br>
     * @taskId <br>
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token)
            throws AuthenticationException {
        logger.info("MyShiroRealm.doGetAuthenticationInfo()");
        //获取用户的输入的账号.
        String username = (String) token.getPrincipal();
        logger.info("----->>username :{}", username);
        logger.info("----->>Credentials :{}", token.getCredentials());
        //通过username从数据库中查找 User对象，如果找到，没找到.
        //实际项目中，这里可以根据实际情况做缓存，如果不做，Shiro自己也是有时间间隔机制，2分钟内不会重复执行该方法
        SysUser userInfo = sysUserService.findByUsername(username);
        logger.info("----->>userInfo :{}", userInfo);
        if (userInfo == null) {
            return null;
        }
        //账户禁用
//        MySQL保存boolean值时用1代表TRUE，0代表FALSE。boolean在MySQL里的类型为tinyint(1)
        if (userInfo.getUserState()) {
            throw new LockedAccountException();
        }
        SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(
                userInfo, //用户名
                userInfo.getUserPassword(), //密码
                ByteSource.Util.bytes(userInfo.getSalt()),//salt=username+salt
                getName()  //realm name
        );
        return authenticationInfo;
    }

    /**
     * Get authorization info authorization info.
     *
     * @return the authorization info
     */
    public AuthorizationInfo getAuthorizationInfo() {
        return getAuthorizationInfo(SecurityUtils.getSubject().getPrincipals());
    }
}