package camp.drunk.bluej.http;

import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;

import java.util.Map;

public interface LoginService {
    @FormUrlEncoded
    @POST("/api/login")
    Map<String, Object> login(@Field("api_type") final String apiType,
                              @Field("user") final String username,
                              @Field("passwd") final String password);
}
