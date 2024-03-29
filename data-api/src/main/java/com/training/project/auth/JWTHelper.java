package com.training.project.auth;

import java.util.Date;
import java.util.Map;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;

public class JWTHelper implements JWTUtil {

		@Override
		public boolean verifyToken(String token) {

			try {
			    Algorithm algorithm = Algorithm.HMAC256("secret");
			    JWTVerifier verifier = JWT.require(algorithm)
			        .withIssuer("me@me.com")
			        .build(); 
			    DecodedJWT jwt = verifier.verify(token);
			    return true;
			} catch (JWTVerificationException exception){
				return false;
			}		
			
		}

		public Map<String, Claim> getClaims(String token) {
			try {
			    Algorithm algorithm = Algorithm.HMAC256("secret");
			    JWTVerifier verifier = JWT.require(algorithm)
			        .withIssuer("me@me.com")
			        .build(); //Reusable verifier instance
			    DecodedJWT jwt = verifier.verify(token);
			    return jwt.getClaims();
			} catch (JWTVerificationException exception){
				return null;
			}
		}
		
		@Override
		public String getScopes(String token) {
			try {
			    Algorithm algorithm = Algorithm.HMAC256("secret");
			    JWTVerifier verifier = JWT.require(algorithm)
			        .withIssuer("me@me.com")
			        .build(); //Reusable verifier instance
			    DecodedJWT jwt = verifier.verify(token);
			    System.out.println(jwt.getClaim("scopes"));
			    
			    return jwt.getClaim("scopes").asString();
			} catch (JWTVerificationException exception){
				return null;
			}
		}
	}
