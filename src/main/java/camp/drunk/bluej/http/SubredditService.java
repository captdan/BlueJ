package camp.drunk.bluej.http;

import camp.drunk.bluej.thing.Subreddit;
import camp.drunk.bluej.thing.subreddit.SubmitText;
import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.Query;

import java.util.List;

public interface SubredditService {
    @GET("/r/{subreddit}/about.json")
    Subreddit about(@Path("subreddit") final String subreddit);

    @GET("/api/recommend/sr/{srnames}.json")
    List<String> recommend(@Path("srnames") final String srnames,
                           @Query("omit") final String omit);

    @GET("/r/{subreddit}/api/submit_text.json")
    SubmitText getSubmitText(@Path("subreddit") final String subreddit);

    @GET("/api/subreddits_by_topic.json")
    List<String> byTopic(@Query("query") final String query);
}
