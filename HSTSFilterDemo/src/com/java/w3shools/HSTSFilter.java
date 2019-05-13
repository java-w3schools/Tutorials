package com.java.w3shools;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HSTSFilter implements Filter {
	private static final String HEADER_NAME = "Strict-Transport-Security";
	private static final String MAX_AGE_DIRECTIVE = "max-age=%s";
	private static final String INCLUDE_SUB_DOMAINS_DIRECTIVE = "includeSubDomains";

	private static final Logger logger = LoggerFactory.getLogger(HSTSFilter.class);

	private int maxAgeSeconds = 0;
	private boolean includeSubDomains = false;

	private String directives;

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		logger.debug("request.isSecure() :: " + request.isSecure());
		System.out.println("request.isSecure() :: " + request.isSecure());

		if (request.isSecure() && response instanceof HttpServletResponse) {
			HttpServletResponse res = (HttpServletResponse) response;

			res.addHeader(HEADER_NAME, this.directives);
			res.addHeader("x-frame-options", "DENY");
		}
		chain.doFilter(request, response);
	}

	public void init(FilterConfig filterConfig) throws ServletException {
		maxAgeSeconds = Integer.parseInt(filterConfig.getInitParameter("maxAgeSeconds"));
		includeSubDomains = "true".equals(filterConfig.getInitParameter("includeSubDomains"));

		if (this.maxAgeSeconds <= 0) {
			throw new ServletException("Invalid maxAgeSeconds value :: " + maxAgeSeconds);
		}
		this.directives = String.format(MAX_AGE_DIRECTIVE, this.maxAgeSeconds);
		if (this.includeSubDomains) {
			this.directives += (" ; " + INCLUDE_SUB_DOMAINS_DIRECTIVE);
		}
	}

	@Override
	public void destroy() {
	}

}
