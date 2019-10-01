public interface JWTDataUtil {
	public String getScopes(String jwt_token) ;
	public Token createToken(String scopes) ;
}
