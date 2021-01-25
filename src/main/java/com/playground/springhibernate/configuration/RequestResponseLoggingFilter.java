package com.playground.springhibernate.configuration;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class RequestResponseLoggingFilter implements Filter {

    protected final Log logger = LogFactory.getLog(getClass());

    @Override
    public void doFilter(ServletRequest request,
                         ServletResponse response,
                         FilterChain chain) throws IOException, ServletException {
        var req = (HttpServletRequest) request;
        var res = (HttpServletResponse) response;

        logger.info("Logging Request " + req.getMethod() + " : " + req.getRequestURI());

        chain.doFilter(request, response);
        logger.info("Logging Response : " + res.getStatus());
    }
}
