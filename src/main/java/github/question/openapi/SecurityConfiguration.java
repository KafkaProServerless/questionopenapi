package github.question.openapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import javax.servlet.*;

@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter implements Filter {

    @Autowired
    public SecurityConfiguration() {
        super(false);
    }

    @Override
    public void configure(HttpSecurity http) {
    }

    @Override
    public void init(FilterConfig filterConfig) {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) {
    }

    @Override
    public void destroy() {
    }

}
