package com.base.cloud.configuration;

import com.base.cloud.entity.SecurityUser;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class CustomUserDetailsService implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        if ("user".equals(username)) {
            return new SecurityUser("user", "password", "user-role");
        } else if ("admin".equals(username)) {
            return new SecurityUser("admin", "admin", "admin-role");
        } else {
            return null;
        }
    }
}
