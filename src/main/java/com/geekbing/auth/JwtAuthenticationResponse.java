package com.geekbing.auth;

import java.io.Serializable;

/**
 * Author: bing
 * Date: 2017-03-11 13:13
 * Email: dhuzbb@163.com
 */
public class JwtAuthenticationResponse implements Serializable {
    private static final long serialVersionUID = 1250166508152483573L;

    private final String token;

    public JwtAuthenticationResponse(String token) {
        this.token = token;
    }

    public String getToken() {
        return this.token;
    }
}
