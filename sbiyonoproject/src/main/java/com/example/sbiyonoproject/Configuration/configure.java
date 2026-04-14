package com.example.sbiyonoproject.Configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.example.sbiyonoproject.Model.jwtfilter;

@Configuration
public class configure {
  
@Autowired 
jwtfilter jwtf;

  @Bean
  public PasswordEncoder pe(){
    return new BCryptPasswordEncoder();
  }

  @Bean
  public AuthenticationManager authmanager(AuthenticationConfiguration ac){
    return ac.getAuthenticationManager();
  }

  @Bean
  public SecurityFilterChain sfc(HttpSecurity http){
    return http.csrf(x->x.disable()).formLogin(x->x.disable()).httpBasic(x->x.disable()).sessionManagement(x->x.sessionCreationPolicy(SessionCreationPolicy.STATELESS)).authorizeHttpRequests(x->x.requestMatchers("/login","/signup").permitAll().anyRequest().authenticated()).addFilterBefore(jwtf, UsernamePasswordAuthenticationFilter.class).build();
  }
}
