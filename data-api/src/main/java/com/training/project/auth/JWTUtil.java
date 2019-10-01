package com.training.project.auth;

public interface JWTUtil {
	public boolean verifyToken(String jwt_token);
	public String getScopes(String jwt_token) ;
}