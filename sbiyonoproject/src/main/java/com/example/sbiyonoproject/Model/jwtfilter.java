package com.example.sbiyonoproject.Model;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;
import org.springframework.web.filter.OncePerRequestFilter;

import io.jsonwebtoken.ExpiredJwtException;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@Service
public class jwtfilter extends OncePerRequestFilter {
  @Autowired
  JWTBuilder jwtbuilder;

  @Autowired 
  UserService userService;

  @Override
  protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
      throws ServletException, IOException {
        String details=request.getHeader("Authorization");
        String username=null;
    
        if(details==null || !details.startsWith("Bearer ")){
          filterChain.doFilter(request, response);
          return;
        }
        String token=details.substring(7);
        try{
          username=jwtbuilder.extractByName(token);
        }
        catch(ExpiredJwtException e){
          filterChain.doFilter(request, response);
          return;
        }
        if(username!=null && SecurityContextHolder.getContext().getAuthentication()==null){
          UserDetails u=userService.loadUserByUsername(username);
          UsernamePasswordAuthenticationToken x=new UsernamePasswordAuthenticationToken(u, null,u.getAuthorities());
          SecurityContextHolder.getContext().setAuthentication(x);


          
        }
        filterChain.doFilter(request, response);
  }
  
}
