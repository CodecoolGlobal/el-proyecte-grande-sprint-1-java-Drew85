package com.codecool.flightclub.management.security;

import com.codecool.flightclub.management.model.Client;
import com.codecool.flightclub.management.model.RoleEntity;
import com.codecool.flightclub.management.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.security.core.GrantedAuthority;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;


@Service("userDetailsService")
@Transactional
public class DatabaseAuthService implements UserDetailsService {

    private UserRepository userRepository;

    @Autowired
    public DatabaseAuthService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        Client user = userRepository.findByName(s);
        if (null == user){
            throw new UsernameNotFoundException("User does not exist.");
        }
        return new User(user.getName(), user.getPassword(), this.getAuthorities(user.getRoles()));
    }

    private Collection<? extends GrantedAuthority> getAuthorities(Set<RoleEntity> roles) {
        List<GrantedAuthority> authorities = new ArrayList<>();
        for (RoleEntity role : roles) {
            authorities.add(new SimpleGrantedAuthority("ROLE_" + role.getName()));
        }
        return authorities;
    }
}
