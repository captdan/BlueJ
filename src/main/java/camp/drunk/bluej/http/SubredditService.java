package camp.drunk.bluej.http;

import camp.drunk.bluej.thing.Subreddit;
import camp.drunk.bluej.thing.subreddit.SubmitText;
import camp.drunk.bluej.thing.subreddit.SubredditListing;
import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.Query;
import retrofit.http.QueryMap;

import java.util.List;
import java.util.Map;

public interface SubredditService {
    @GET("/r/{subreddit}/about.json")
    Subreddit about(@Path("subreddit") final String subreddit);

    @GET("/api/recommend/sr/{srnames}.json")
    List<Map<String, String>> recommend(@Path("srnames") final String srnames,
                           @Query("omit") final String omit);

    @GET("/r/{subreddit}/api/submit_text.json")
    SubmitText getSubmitText(@Path("subreddit") final String subreddit);

    @GET("/api/subreddits_by_topic.json")
    List<Map<String, String>> byTopic(@Query("query") final String query);

    @GET("/subreddits/search")
    SubredditListing search(@Query("q") final String query,
                            @QueryMap final Map<String, String> listingParams);

    @GET("/subreddits/{where}")
    SubredditListing all(@Query("where") final String where);
}
