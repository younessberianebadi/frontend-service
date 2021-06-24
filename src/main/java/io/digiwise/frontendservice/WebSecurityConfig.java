package io.digiwise.frontendservice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception
    {
        auth.userDetailsService(userDetailsService());
    }
    @Bean
    public PasswordEncoder passwordEncoder()
    {
        return new BCryptPasswordEncoder();
    }
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/style/*", "/images/calendar.png", "/", "/images/*").permitAll()
                .antMatchers("/admin").hasRole("ADMIN")
                .antMatchers("/educator").hasRole("EDUCATEUR")
                .antMatchers("/player").hasRole("PLAYER")
                .antMatchers("/tutor").hasRole("TUTEUR")
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .loginPage("/login")

                .permitAll()

                .and()
                .logout()


                .permitAll();
    }

    @Bean
    @Override
    public UserDetailsService userDetailsService() {
        List<UserDetails> userDetailsList = new ArrayList<>();
        userDetailsList.add(User.withUsername("admin@gmail.com").password(passwordEncoder().encode("admin@123"))
                .roles("ADMIN").build());
        userDetailsList.add(User.withUsername("edu1@gmail.com").password(passwordEncoder().encode("edu1@123"))
                .roles("EDUCATEUR").build());
        userDetailsList.add(User.withUsername("edu2@gmail.com").password(passwordEncoder().encode("edu2@123"))
                .roles("EDUCATEUR").build());
        userDetailsList.add(User.withUsername("edu3@gmail.com").password(passwordEncoder().encode("edu3@123"))
                .roles("EDUCATEUR").build());
        userDetailsList.add(User.withUsername("tuto1@gmail.com").password(passwordEncoder().encode("tuto1@123"))
                .roles("TUTEUR").build());
        userDetailsList.add(User.withUsername("joueur1@gmail.com").password(passwordEncoder().encode("joueur1@123"))
                .roles("PLAYER").build());






        return new InMemoryUserDetailsManager(userDetailsList);
    }

}