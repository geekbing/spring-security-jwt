package com.geekbing.security;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Date;

/**
 * Author: bing
 * Date: 2017-03-11 10:14
 * Email: dhuzbb@163.com
 */

/**
 * Spring Security需要我们实现几个东西
 * 第一个是UserDetails：这个接口中规定了用户的几个必须要有的方法，所以我们创建一个JwtUser类来实现这个接口。
 * 为什么不直接使用User类？因为这个UserDetails完全是为了安全服务的，
 * 它和我们的领域类可能有部分属性重叠，但很多的接口其实是安全定制的，所以最好新建一个类。
 * 这个接口中规定的很多方法我们都简单粗暴的设成直接返回某个值了，这是为了简单起见，你在实际开发环境中还是要根据具体业务调整。
 */
public class JwtUser implements UserDetails {

    private final Long id;
    private final String username;
    private final String password;
    private final String email;
    private final Collection<? extends GrantedAuthority> authorities;
    private final Date lastPasswordResetDate;

    public JwtUser(Long id, String username, String password, String email, Collection<? extends GrantedAuthority> authorities, Date lastPasswordResetDate) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.authorities = authorities;
        this.lastPasswordResetDate = lastPasswordResetDate;
    }

    @JsonIgnore
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @JsonIgnore
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @JsonIgnore
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @JsonIgnore
    @Override
    public boolean isEnabled() {
        return true;
    }

    @JsonIgnore
    public Long getId() {
        return id;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @JsonIgnore
    @Override
    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @JsonIgnore
    public Date getLastPasswordResetDate() {
        return lastPasswordResetDate;
    }
}
