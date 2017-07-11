package com.rgigroup.oauth.protect.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.ws.rs.NameBinding;

@NameBinding
@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Protected {
	/**
	 * OAUTH Server Authorization.
	 * Set complete uri ex. http://localhost:8080
	 * @return
	 */
    String oauthServer() default "http://localhost:8080";
}
