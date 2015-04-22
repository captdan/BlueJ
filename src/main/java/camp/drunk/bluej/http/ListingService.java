package camp.drunk.bluej.http;

import camp.drunk.bluej.thing.LinkListing;
import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.Query;
import retrofit.http.QueryMap;

import java.util.Map;

public interface ListingService {
    public static final class Sort {
        public static final String HOT = "hot";
        public static final String NEW = "new";
        public static final String RANDOM = "random";
        public static final String TOP = "top";
        public static final String CONTROVERSIAL = "controversial";
    }

    @GET("/by_id/{names}")
    LinkListing byId(@Path("names") final String names);

    @GET("/comments/{article}")
    LinkListing commentsFor(@Path("article") final String article);

    @GET("/duplicates/{article}")
    LinkListing duplicateOf(@Path("article") final String article,
                            @Query("after") final String after,
                            @Query("before") final String before,
                            @Query("count") final Integer count,
                            @Query("limit") final Integer limit,
                            @Query("show") final String show);

    @GET("/r/{subreddit}/{sort}.json")
    LinkListing forSubreddit(@Path("subreddit") final String subreddit,
                             @Path("sort") final String sort,
                             @QueryMap Map<String, Object> listingParams);
                             /*
                             @Query("after") final String after,
                             @Query("before") final String before,
                             @Query("count") final Integer count,
                             @Query("limit") final Integer limit,
                             @Query("show") final String show);*/

    @GET("/related/{article}")
    LinkListing relatedTo(@Path("article") final String article,
                          @Query("after") final String after,
                          @Query("before") final String before,
                          @Query("count") final Integer count,
                          @Query("limit") final Integer limit,
                          @Query("show") final String show);
}