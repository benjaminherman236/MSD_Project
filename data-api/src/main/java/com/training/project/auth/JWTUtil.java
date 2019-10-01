package com.training.project.auth;
public interface JWTUtil {
	public String getScopes(String jwt_token) ;
	public boolean verifyToken(String jwt_token);
}
