package prabhjot.adam.internship.prep.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

/**
 * Authors: Prabhjot Aulakh and Adam Sean Winter
 */
@Configuration
public class SecurityConfig {
  
  @Bean
  public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
    httpSecurity
    // https://docs.spring.io/spring-security/reference/servlet/authorization/authorize-http-requests.html#authorize-requests
      .authorizeHttpRequests(auth -> {
        auth
          // this basically means that anyone can make a request to /api/auth/** without being authenticated
          // but any other request to any route has to be authenticated
          .requestMatchers("/api/auth/**")
          .permitAll()
          .anyRequest()
          .authenticated();
      });

    return httpSecurity.build();
  }
}
