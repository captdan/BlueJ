package camp.drunk.bluej.http;

import retrofit.client.Response;
import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.Query;

public interface SubredditService {
    public static final class Sort {
        public static final String HOT = "hot";
        public static final String NEW = "new";
        public static final String RANDOM = "random";
        public static final String TOP = "top";
        public static final String CONTROVERSIAL = "controversial";
    }

    @GET("/r/{subreddit}/{sort}.json")
    public Response get(@Path("subreddit") final String subreddit,
                       @Path("sort") final String sort,
                       @Query("after") final String after,
                       @Query("before") final String before,
                       @Query("count") final Integer count,
                       @Query("limit") final Integer limit,
                       @Query("show") final String show);
}