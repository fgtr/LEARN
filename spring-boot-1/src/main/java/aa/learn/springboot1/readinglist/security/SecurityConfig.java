package aa.learn.springboot1.readinglist.security;

import aa.learn.springboot1.readinglist.repository.ReaderRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.password.StandardPasswordEncoder;

import javax.annotation.Resource;

/**
 * TODO1
 *
 * @CREATE AA @ 2018/10/05 3:30 PM
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Resource
    private ReaderRepository readerRepository;

    @Resource
    private PasswordEncoder passwordEncoder;

    @Bean
    public PasswordEncoder passwordEncoder() {
        //    PasswordEncoderFactories
        return new BCryptPasswordEncoder();
//        return PasswordEncoderFactories.createDelegatingPasswordEncoder();
    }

    @Override
    public void configure(WebSecurity web) {
        web.ignoring().antMatchers("/config/**", "/css/**", "/fonts/**", "/img/**", "/js/**");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // https://blog.csdn.net/SWPU_Lipan/article/details/80586054 2018-10-19 15:17:33
//        http.headers()
//                .and().authorizeRequests()
//                .antMatchers("/registry").permitAll()
//                .anyRequest().authenticated()
//                .and().formLogin().loginPage("/sign_in")
//                .loginProcessingUrl("/login").defaultSuccessUrl("/personal_center",true)
//                .failureUrl("/sign_in?error").permitAll()
//                .and().sessionManagement().invalidSessionUrl("/sign_in")
//                .and().rememberMe().tokenValiditySeconds(1209600)
//                .and().logout().logoutSuccessUrl("/sign_in").permitAll()
//                .and().csrf().disable();

        http.authorizeRequests()
                .antMatchers("/").access("hasRole('READER')")
                .antMatchers("/**").permitAll()
                .and()
//            .csrf().disable()
            .formLogin().loginPage("/reader/login")
                // security验证成功后，继续传递到post login的（/reader/login）处理 > 2018-10-19 14:46:46
                .successForwardUrl("/reader/login")
                .failureUrl("/reader/login?error=true");
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService((String username) -> {
                    UserDetails userDetails = readerRepository.findById(username).orElse(null);
                    if (userDetails == null) {
                        throw new UsernameNotFoundException("User '" + username + "' not found.");
                    }
                    return userDetails;
                }).passwordEncoder(passwordEncoder);
    }

}
