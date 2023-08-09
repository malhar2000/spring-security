package com.malhar.springsecuritybackend.filter;

import jakarta.servlet.*;

import java.io.IOException;
import java.util.logging.Logger;

// here don't know the order in which the custom filter will be executed
public class AuthoritiesLoggingAtFilter implements Filter {

    private final Logger LOG =
            Logger.getLogger(AuthoritiesLoggingAtFilter.class.getName());

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        LOG.info("Authentication Validation is in progress");
        chain.doFilter(request, response);
    }

}
