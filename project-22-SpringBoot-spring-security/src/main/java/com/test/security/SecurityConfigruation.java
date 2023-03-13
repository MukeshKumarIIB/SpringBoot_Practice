package com.test.security;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SuppressWarnings("deprecation")
@EnableWebSecurity
public class SecurityConfigruation extends WebSecurityConfigurerAdapter{
	

	//configure spring security authentication
	protected void cofigure(AuthenticationManagerBuilder auth) throws Exception {
		
		//set your configuration on auth object
		auth.inMemoryAuthentication()
		.withUser("bandaru")
		.password("sarasu10")
		.roles("USER")
		.and()
		.withUser("bandaru")
		.password("sarasu10")
		.roles("ADMIN")
		.and();
		
	}
	
	@Bean
	public PasswordEncoder getPasswordEncoder() {
		
		return NoOpPasswordEncoder.getInstance();
	}
	
	
	//configure spring security authorization\
	
	protected void configure(HttpSecurity http) throws Exception{
		
		http.authorizeRequests()
		.antMatchers("/admin").hasRole("ADMIN")
		.antMatchers("/user").hasRole("USER")
		.antMatchers("/manager").hasRole("USER")
		.antMatchers("/").permitAll()
		.and().formLogin();
	}
}
