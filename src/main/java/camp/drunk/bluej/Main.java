package camp.drunk.bluej;

import camp.drunk.bluej.http.ListingService;
import camp.drunk.bluej.http.SubredditService;
import camp.drunk.bluej.thing.LinkListing;
import com.google.common.base.Strings;
import com.google.common.collect.ImmutableMap;
import com.google.gson.GsonBuilder;
import retrofit.RestAdapter;
import retrofit.converter.GsonConverter;

import static camp.drunk.bluej.http.ListingService.Sort.HOT;
import static com.google.gson.FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES;

public class Main {
    static String auth;

    public static void main(String[] args) {
        final RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint("http://reddit.com")
                .setConverter(new GsonConverter(new GsonBuilder()
                        .setFieldNamingPolicy(LOWER_CASE_WITH_UNDERSCORES)
                        .create()))
                .setRequestInterceptor(request -> {
                    request.addHeader("User-Agent", "BlueJ-Library");
                    if(!Strings.isNullOrEmpty(auth)) {
                        request.addHeader("X-Aut");
                    }
                })
                .build();

        final ListingService listingService = restAdapter.create(ListingService.class);
        final LinkListing l = listingService
                .forSubreddit("coffee", HOT, ImmutableMap.of("count", "0", "limit", "2"));

        System.out.println(l.toString());

        final SubredditService ss = restAdapter.create(SubredditService.class);

        System.out.println("about science\n\n");
        System.out.println(ss.about("science"));

        System.out.println("submittext science\n\n");
        System.out.println(ss.getSubmitText("science"));

        System.out.println("recommend science\n\n");
        System.out.println(ss.recommend("science,ama", ""));

        System.out.println("by topic science\n\n");
        System.out.println(ss.byTopic("food"));
    }
}
