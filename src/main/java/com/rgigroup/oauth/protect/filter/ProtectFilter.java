package com.rgigroup.oauth.protect.filter;

import java.io.IOException;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.ext.Provider;

import com.rgigroup.oauth.protect.annotation.Protected;

@Provider
@Protected //use this, because annotation have namebinding.
public class ProtectFilter implements ContainerRequestFilter, ContainerResponseFilter {
	
	public void filter(ContainerRequestContext requestContext) throws IOException {
		System.out.println("Only protected resource are fitered with this class!!!");
	}

	public void filter(ContainerRequestContext requestContext, ContainerResponseContext responseContext)
			throws IOException {
		System.out.println("response Context:"+ requestContext.getUriInfo().getAbsolutePath().toString());
		
	}
}
