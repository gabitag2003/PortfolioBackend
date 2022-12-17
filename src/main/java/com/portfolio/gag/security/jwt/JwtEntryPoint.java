
package com.portfolio.gag.security.jwt;

//esta clase chequeará si hay un token válido


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;
import org.springframework.security.web.AuthenticationEntryPoint;

@Component 
public class JwtEntryPoint implements AuthenticationEntryPoint{
    
    private final static Logger logger =LoggerFactory.getLogger(JwtEntryPoint.class);

    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authException) throws IOException, ServletException {
       logger.error("Falló el método commence");
       response.sendError(HttpServletResponse.SC_UNAUTHORIZED);

    }
    
}
