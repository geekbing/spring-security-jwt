package com.geekbing.security;

import com.geekbing.entity.Role;
import com.geekbing.entity.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Author: bing
 * Date: 2017-03-11 10:23
 * Email: dhuzbb@163.com
 */

/**
 * 写一个工厂类来由领域对象创建 JwtUser
 */
public final class JwtUserFactory {

    private JwtUserFactory() {
    }

    public static JwtUser create(User user) {
        return new JwtUser(user.getId(),
                user.getUsername(),
                user.getPassword(),
                user.getEmail(),
                mapToGrantedAuthorities(user.getRoles()),
                user.getLastPasswordResetDate());
    }

    /**
     * 将List<Role> 转换成 List<GrantedAuthority>
     *
     * @param roles
     * @return
     */
    private static List<GrantedAuthority> mapToGrantedAuthorities(List<Role> roles) {
        return roles.stream()
                .map(role -> role.getName())
                .map(SimpleGrantedAuthority::new)
                .collect(Collectors.toList());
    }
}
