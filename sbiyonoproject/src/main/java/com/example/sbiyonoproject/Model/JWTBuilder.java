package com.example.sbiyonoproject.Model;

import java.security.Key;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;

@Service
public class JWTBuilder {
 private static final String SECRET = "TmV3U2VjcmV0S2V5Rm9ySldUU2lnb9878kmluZ1B1cnBvc2VzMTIzNDU2Nzg=";
  public String generateToken(String name) {
    
    Map<String,Object> claim=new HashMap<>();
     return Jwts.builder()
            .setClaims(claim)
            .setSubject(name)
            .setIssuedAt(new Date(System.currentTimeMillis()))
            .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60)) // 1 hour
            .signWith(getSignKey(), SignatureAlgorithm.HS256)
            .compact();
  }

  private Key getSignKey() {
  byte[] b=Decoders.BASE64.decode(SECRET);
  return Keys.hmacShaKeyFor(b);
  }

  public String extractByName(String token) {
return Jwts.parser().setSigningKey(SECRET).build().parseClaimsJws(token).getBody().getSubject();
  }
  

}
