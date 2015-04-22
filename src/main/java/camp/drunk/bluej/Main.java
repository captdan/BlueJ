package camp.drunk.bluej;

import camp.drunk.bluej.http.ListingService;
import camp.drunk.bluej.thing.LinkListing;
import com.google.common.collect.ImmutableMap;
import retrofit.RequestInterceptor;
import retrofit.RestAdapter;

import static camp.drunk.bluej.http.ListingService.Sort.HOT;

public class Main {
    public static void main(String[] args) {
        final RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint("http://reddit.com")
                .setRequestInterceptor(new RequestInterceptor() {
                    @Override
                    public void intercept(final RequestFacade request) {
                        request.addHeader("User-Agent", "BlueJ-Library");
                    }
                })
                .build();

        final ListingService listingService = restAdapter.create(ListingService.class);
        final LinkListing l = listingService
                .forSubreddit("coffee", HOT, ImmutableMap.of("count", "0", "limit", "2"));

        System.out.println(l.toString());

        final LinkListing ll = listingService.relatedTo(l.getData().getChildren().get(0).getName
                (), null, null, 0, 2, null);

        System.out.println(ll.toString());
    }
}
