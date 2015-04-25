package camp.drunk.bluej.http;

import camp.drunk.bluej.thing.LinkListing;
import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.Query;
import retrofit.http.QueryMap;

import java.util.Map;

public interface SearchService {
    public static final class Sort {
        public static final String RELEVANCE = "relevance";
        public static final String NEW = "new";
        public static final String HOT = "hot";
        public static final String TOP = "top";
        public static final String COMMENTS = "comments";
    }

    @GET("/search")
    LinkListing all(@Query("q") final String query,
                    @QueryMap final Map<String, String> queryParams);

    @GET("/r/{subreddit}/search")
    LinkListing all(@Path("subreddit") final String subreddit,
                    @Query("q") final String query,
                    @QueryMap final Map<String, String>  queryParams);
}
