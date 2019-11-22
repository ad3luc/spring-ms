package com.dexm.ms.api;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import lombok.extern.slf4j.Slf4j;

/**
 * For Swagger specific requests (/v2/api-docs) this filter is going to remove
 * an eventual X-Forwarded-Prefix header (added by Spring) to avoid it to be used
 * during Swagger basePath calculation (see XForwardPrefixPathAdjuster used by
 * HostNameProvider used by Swagger2Controller to set the basePath in the response)
 */
@Slf4j
public class RemoveXForwardedForSwagger extends ZuulFilter {

	@Override
	public String filterType() {
		return "route";
	}

	@Override
	public int filterOrder() {
		return 10;
	}

	@Override
	public boolean shouldFilter() {
		return RequestContext.getCurrentContext().getRequest().getRequestURI().contains("/v2/api-docs");
	}

	@Override
	public Object run() throws ZuulException {
		RequestContext.getCurrentContext().getZuulRequestHeaders().remove("x-forwarded-prefix");
		return null;
	}
}
