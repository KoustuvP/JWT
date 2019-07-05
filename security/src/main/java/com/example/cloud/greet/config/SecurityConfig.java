//package com.example.cloud.greet.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.authentication.AuthenticationProvider;
//import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.password.NoOpPasswordEncoder;
//
//
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//
//	/*
//	 * @Bean
//	 * 
//	 * @Override protected UserDetailsService userDetailsService() {
//	 * 
//	 * List<UserDetails> users=new ArrayList<>();
//	 * users.add(User.withDefaultPasswordEncoder().username("koustuv").password(
//	 * "12345").roles("USER").build()); return new
//	 * InMemoryUserDetailsManager(users); }
//	 */
//	@Autowired
//	private UserDetailsService userDetailsService;
//	@Bean
//	public AuthenticationProvider authProvider() {
//		DaoAuthenticationProvider provider= new  DaoAuthenticationProvider();
//		provider.setUserDetailsService(userDetailsService);
//		provider.setPasswordEncoder(NoOpPasswordEncoder.getInstance());
//		return provider;
//	}
//
///*	@Autowired
//	DataSource dataSource;*/
//
///*	@Autowired
//	PasswordEncoder passwordEncoder;*/
//
////	
////	@Autowired
////	ClientAuthenticationProvider clientAuthenticationProvider;
////	
////	@Autowired
////	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
////
////		/*auth.inMemoryAuthentication().withUser("user").password("{noop}password").roles("USER")
////		.and().withUser("koustuv").password("{noop}password").roles("USER");*/
////
////		System.out.println(clientAuthenticationProvider);
////		
////		auth.authenticationProvider(clientAuthenticationProvider);
////
////	}
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//
//		http
//        .httpBasic()
//      .and()
//        .authorizeRequests()
//          .antMatchers("/index.html", "/", "/home", "/login").permitAll()
//          .anyRequest().authenticated()
////		    .defaultSuccessUrl("/")
////		    .and() 
////		    .logout() 
////		    .logoutSuccessUrl("/login?logout=true")
//		    .and() .csrf() .disable();
//		 
//
//	}
////	
////	
////	@Bean
////	public PasswordEncoder passwordEncoder() {
////		return new BCryptPasswordEncoder();
////	}
////	@Bean
////	public RestTemplate restTemplate() {
////	    return new RestTemplate();
////	}
//
//	
//}
