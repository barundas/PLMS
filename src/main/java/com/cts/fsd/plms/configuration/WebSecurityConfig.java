package com.cts.fsd.plms.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.savedrequest.NullRequestCache;

@Configuration
@EnableGlobalMethodSecurity(prePostEnabled = true)
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	
	
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable();
		http.requestCache().requestCache(new NullRequestCache());
		http.httpBasic();
		http.authorizeRequests().antMatchers("/").permitAll().anyRequest().fullyAuthenticated()
		.and()
//		.formLogin().loginPage("/login").permitAll()
//		.and()
		.exceptionHandling().accessDeniedHandler(null);
	}
}
