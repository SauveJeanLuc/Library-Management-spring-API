package edu.lib.testing;


import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;


@Component
public class TransactionFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
