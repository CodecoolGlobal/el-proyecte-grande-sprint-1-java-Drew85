package com.codecool.flightclub.management.security;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
import java.security.Key;
import java.util.List;

public class JwtTokenVerify extends OncePerRequestFilter {
    private final Key secretKey = Keys.hmacShaKeyFor("zdtlD3JK56m6wTTgsNFhqzjqPzdtlD3JK56m6wTTgsNFhqzjqP".getBytes());
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
            String token = request.getHeader("Authorization");
            if (token == null || !token.startsWith("Bearer")) {
// this is not a bearer token based authorization, so we let other filters
// perform the authentication, if they can:
                filterChain.doFilter(request, response);
                return;
            }
            String expectedHeaderValue = "Bearer " + parseToken("");
            if (!expectedHeaderValue.equals(token)) {
                throw new BadCredentialsException("invalid token found in Authorization header");
            }

            UsernamePasswordAuthenticationToken authToken = new UsernamePasswordAuthenticationToken(
                    "UserRegistrationApi", "", List.of(new SimpleGrantedAuthority("ROLE_USER_REGISTRATION"))
            );
            SecurityContextHolder.getContext().setAuthentication(authToken);

            filterChain.doFilter(request, response);
        }
    public Authentication parseToken(String token) {
        try {
            Claims body = Jwts.parser()
                    .setSigningKey(secretKey)
                    .parseClaimsJws(token)
                    .getBody();

//            User u = new User();
//            u.setUsername(body.getSubject());
//            u.setId(Long.parseLong((String) body.get("userId")));
//            u.setRole((String) body.get("role"));

            return null;

        } catch (JwtException | ClassCastException e) {
            return null;
        }
    }
    }
