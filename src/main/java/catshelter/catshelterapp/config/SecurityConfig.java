package catshelter.catshelterapp.config;

import org.springframework.boot.autoconfigure.security.servlet.PathRequest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.password.Pbkdf2PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
        return httpSecurity
                .authorizeHttpRequests(

                        authorizeRequests -> authorizeRequests

                                .requestMatchers(PathRequest.toStaticResources().atCommonLocations()).permitAll()

                                .requestMatchers("**", "/login", "/login-error", "/register", "/about", "/contact", "/subscribe", "/unsubscribe").permitAll()

                                .requestMatchers("/home", "/users/**", "/adoption/**").authenticated()
                                .requestMatchers("/admin/**").hasRole("ADMIN")


                                .anyRequest()
                                .authenticated()
                )
                .formLogin(formLogin -> formLogin

                        .loginPage("/login")

                        .usernameParameter("username")

                        .passwordParameter("password")

                        .defaultSuccessUrl("/home", true)

                        .failureUrl("/login-error")
                )
                .logout(
                        logout -> logout

                                .logoutUrl("/logout")

                                .logoutSuccessUrl("/").permitAll()

                                .invalidateHttpSession(true)
                )

                .csrf((csrf) -> csrf.ignoringRequestMatchers("/subscribe", "/unsubscribe"))
                .build();
    }


    @Bean
    public PasswordEncoder passwordEncoder() {
        return Pbkdf2PasswordEncoder
                .defaultsForSpringSecurity_v5_8();
    }
}