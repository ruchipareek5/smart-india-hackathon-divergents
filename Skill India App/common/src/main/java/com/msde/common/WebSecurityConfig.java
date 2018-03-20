//package com.skill.India.common;
//
//
//import org.springframework.boot.autoconfigure.security.SecurityProperties;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.annotation.Order;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.web.csrf.CookieCsrfTokenRepository;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
//
//
//
//	@Configuration
//	@Order(SecurityProperties.ACCESS_OVERRIDE_ORDER)
//	public class WebSecurityConfig extends WebMvcConfigurerAdapter {
//		@Override
//		protected void configure(HttpSecurity http) throws Exception {
//			// @formatter:off
//			http
//					.httpBasic().and()
//					.authorizeRequests()
//					.antMatchers("/pal-login.html","/pal-logout" ,"/home.html", "/signup.html", "/").permitAll()
//					.anyRequest().authenticated()
//					.and()
//					.csrf()
//					.csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse());
//			// @formatter:on
//		}
//	}
