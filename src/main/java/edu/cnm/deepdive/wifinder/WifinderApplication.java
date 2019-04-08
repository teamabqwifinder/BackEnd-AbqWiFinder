package edu.cnm.deepdive.wifinder;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;

@EnableWebSecurity
@EnableResourceServer
@SpringBootApplication
public class WifinderApplication extends ResourceServerConfigurerAdapter {

  @Value("${oauth.clientId}")
  private String clientId;

  /**
   * Main entry point for the QoD Spring Boot application. Any command line arguments will be
   * forwarded to {@link SpringApplication#run(Class, String...)}.
   *
   * @param args command line arguments.
   */
  public static void main(String[] args) {
    SpringApplication.run(WifinderApplication.class, args);
  }

  @Override
  public void configure(ResourceServerSecurityConfigurer resources) throws Exception {
    resources.resourceId(clientId);
  }

  @Override
  public void configure(HttpSecurity http) throws Exception {
    http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
    http.authorizeRequests().anyRequest().permitAll();//.hasRole("USER"); TODO Re-enable
  }

}
