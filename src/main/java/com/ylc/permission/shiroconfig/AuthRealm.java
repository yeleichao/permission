package com.ylc.permission.shiroconfig;

import org.apache.commons.collections.CollectionUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: shiro
 * @Date: 2019/11/23
 */
public class AuthRealm extends AuthorizingRealm{
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        return null;
    }

   /* //授权
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        User user = principalCollection.fromRealm(this.getClass().getName()).iterator().next();
        List<String> permissionList = new ArrayList<>();
        Set<Role> roleSet = user.getRoles();
        if(CollectionUtils.isNotEmpty(roleSet)){
            for(Role role : roleSet){
                Set<Permission> permissionSet = role.getPermissions();
                if(CollectionUtils.isNotEmpty(permissionSet)){
                    for(Permission permission : permissionSet){
                        permissionList.add(permission.getName());
                    }
                }
            }
        }
        //将权限赋值
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        info.addStringPermissions(permissionList);

        return info;
    }

    //认证登陆
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        String username = token.getUsername();
        //TODO  从数据库中根据username查询

        return new SimpleAuthenticationInfo(user,user.getpassword,this.getClass().getName());
    }*/
}


















