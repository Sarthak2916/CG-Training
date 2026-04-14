package com.example.sbiyonoproject.Model;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.sbiyonoproject.Repository.rep;

@Service
public class UserService implements UserDetailsService {

  @Autowired
  rep r;
  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
   Account acc=r.findByName(username);
   if(acc==null){
    throw new UsernameNotFoundException("UserName Not Fond");
   }
   return new User(acc.getName(),acc.getPassword(),new ArrayList<>());
  }
  
}
