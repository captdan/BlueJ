package camp.drunk.bluej.http;

import camp.drunk.bluej.thing.LinkListing;
import retrofit.http.GET;
import retrofit.http.Path;
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

    @GET("/by_id/{names}.json")
    LinkListing byId(@Path("names") final String names);

    @GET("/comments/{article}.json")
    LinkListing commentsFor(@Path("article") final String article);

    @GET("/r/{subreddit}/comments/{article}.json")
    LinkListing commentsFor(@Path("subreddit") final String subreddit,
                            @Path("article") final String  article);

    @GET("/duplicates/{article}.json")
    LinkListing duplicatesOf(@Path("article") final String article,
                            @QueryMap Map<String, String> listingParams);

    /**
     *
     * @param sort
     * @param listingParams supports param "t" if sort is "top" or "controversial"
     *                      "t" can be one of (hour, week, day, month, year, all)
     *                      if sort is "random" listingParams are not supported
     * @return
     */
    @GET("/{sort}.json")
    LinkListing forAll(@Path("sort") final String sort,
                       @QueryMap Map<String, String> listingParams);

    @GET("/r/{subreddit}/{sort}.json")
    LinkListing forSubreddit(@Path("subreddit") final String subreddit,
                             @Path("sort") final String sort,
                             @QueryMap Map<String, String> listingParams);

    @GET("/related/{article}.json")
    LinkListing relatedTo(@Path("article") final String article,
                          @QueryMap Map<String, String> listingParams);
}