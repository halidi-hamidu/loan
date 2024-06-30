package com.Portal.loan.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
	
	@Bean

    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        return http

            .authorizeHttpRequests(auth -> auth

                .requestMatchers("/").permitAll()

                .requestMatchers("/contact").permitAll()

                .requestMatchers("/store/**").permitAll()

                .requestMatchers("/register").permitAll()

                .requestMatchers("/login").permitAll()

                .requestMatchers("/logout").permitAll()

                .anyRequest().authenticated()

            )

            .formLogin(form -> form

                .defaultSuccessUrl("/dashboard", true)

//                .logout(config -> config.logoutSuccessUrl("/"))

            )

            .build();

    }



    /*This code defines a passwordEncoder() method that is annotated with @Bean. This annotation tells Spring to create an instance of the PasswordEncoder interface and make it available for injection into other beans.

        The method uses the BCryptPasswordEncoder class from Spring Security to create a password encoder that uses the bcrypt algorithm. Bcrypt is a strong and widely used password hashing algorithm that is resistant to brute force attacks.

            The method returns the newly created BCryptPasswordEncoder instance, which can then be used by other beans to encode and decode passwords. */
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
}

}
 