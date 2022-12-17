
package com.portfolio.gag.security.jwt;

import com.portfolio.gag.security.entity.UsuarioPrincipal;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.SignatureException;
import io.jsonwebtoken.UnsupportedJwtException;
import java.util.Date;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;


//Clase que generará el token y contiene los méstodos de validación del mismo

@Component
public class JwtProvider {
  
private final static Logger logger =LoggerFactory.getLogger(JwtProvider.class);

  @Value("${jwt.secret}")
  private String secret;
  @Value("${jwt.expiration}")
  private int expiration;
  
    public String generateToken(Authentication authentication){
        UsuarioPrincipal usuarioPrincipal= (UsuarioPrincipal) authentication.getPrincipal();
        return Jwts.builder().setSubject(usuarioPrincipal.getUsername())
                .setIssuedAt(new Date ()) //Toma la fecha exacta en q se genera
                .setExpiration(new Date(new Date().getTime() +expiration*1000)) // a la fecha en q se genera se le suma el tiempo de expiración
                .signWith(SignatureAlgorithm.HS512 , secret) //algoritmo q usaremos para la firma
                .compact();
        
                
    }
    
    public String getNombreUsuarioFromToken(String token ){
        return Jwts.parser().setSigningKey(secret).parseClaimsJws(token).getBody().getSubject();
    }
    public boolean validateToken(String token){
        
        try {
            Jwts.parser().setSigningKey(secret) .parseClaimsJws(token);
            return true;
        }catch (MalformedJwtException e ){
            logger.error("Token mal formado");
        }catch (UnsupportedJwtException e){
            logger.error("Token no soportado");
        }catch (ExpiredJwtException e){
            logger.error("Token expirado");
        }catch (IllegalArgumentException e){
            logger.error("Token vacío");
        }catch (SignatureException e){
            logger.error("Firma no válida");
        }
        return false;   
    }
}
 