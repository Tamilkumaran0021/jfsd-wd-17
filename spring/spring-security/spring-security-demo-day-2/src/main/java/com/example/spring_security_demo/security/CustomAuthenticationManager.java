package com.example.spring_security_demo.security;

import com.example.spring_security_demo.entity.User;
import com.example.spring_security_demo.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class CustomAuthenticationManager implements AuthenticationManager {

    private UserRepository userRepository;
    private PasswordEncoder passwordEncoder;

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String username = authentication.getName();
        String password = authentication.getCredentials().toString();


        if (isValidUser(username, password)) {
            return new UsernamePasswordAuthenticationToken(username, password, getRoles(username));
        } else {
            throw new AuthenticationException("Invalid Credentials") {
            };
        }
    }

    private boolean isValidUser(String username, String password) {
        User user = userRepository.findByUsername(username);
        return passwordEncoder.matches(password, user.getPassword());
    }

    private Set<GrantedAuthority> getRoles(String username) {
        User user = userRepository.findByUsername(username);
        Set<GrantedAuthority> authorities = user.getRoles().stream()
                .map(role -> new SimpleGrantedAuthority(role.getName()))
                .collect(Collectors.toSet());
        return authorities;
    }
}
