package camp.drunk.bluej;

import camp.drunk.bluej.http.ListingService;
import camp.drunk.bluej.http.SubredditService;
import camp.drunk.bluej.thing.LinkListing;
import com.google.common.collect.ImmutableMap;
import com.google.gson.GsonBuilder;
import retrofit.RestAdapter;
import retrofit.converter.GsonConverter;

import static camp.drunk.bluej.http.ListingService.Sort.HOT;
import static com.google.gson.FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES;

public class Main {
    public static void main(String[] args) {
        final RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint("http://reddit.com")
                .setConverter(new GsonConverter(new GsonBuilder()
                        .setFieldNamingPolicy(LOWER_CASE_WITH_UNDERSCORES)
                        .create()))
                .setRequestInterceptor(request -> request.addHeader("User-Agent", "BlueJ-Library"))
                .build();

        final ListingService listingService = restAdapter.create(ListingService.class);
        final LinkListing l = listingService
                .forSubreddit("coffee", HOT, ImmutableMap.of("count", "0", "limit", "2"));

        System.out.println(l.toString());

        final SubredditService ss = restAdapter.create(SubredditService.class);

        System.out.println(ss.about("science").toString());
        System.out.println(ss.getSubmitText("science"));
        System.out.println(ss.recommend("science,ama", ""));
        System.out.println(ss.byTopic("food"));
    }
}
