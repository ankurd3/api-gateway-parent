package com.tech.common;

import lombok.Getter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;

/**
 * Config JWT.
 * Only one property 'gen.security.secret' is mandatory.
 *
 * @author Ankur Dutta 2016/09/16
 */
@Getter
@ToString
public class JwtAuthenticationConfig {

    @Value("${gen.security.url:/login}")
    private String url;

    @Value("${gen.security.header:Authorization}")
    private String header;

    @Value("${gen.security.prefix:Bearer}")
    private String prefix;

    @Value("${gen.security.expiration:#{24*60*60}}")
    private int expiration; // default 24 hours

    @Value("${gen.security.secret}")
    private String secret;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getHeader() {
		return header;
	}

	public void setHeader(String header) {
		this.header = header;
	}

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public int getExpiration() {
		return expiration;
	}

	public void setExpiration(int expiration) {
		this.expiration = expiration;
	}

	public String getSecret() {
		return secret;
	}

	public void setSecret(String secret) {
		this.secret = secret;
	}
    
}
