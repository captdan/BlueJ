package camp.drunk.bluej;

import camp.drunk.bluej.http.SubredditService;
import org.apache.commons.io.IOUtils;
import retrofit.RestAdapter;
import retrofit.client.Response;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        final RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint("http://reddit.com")
                .build();

        final SubredditService subredditService = restAdapter.create(SubredditService.class);
        final Response response = subredditService.get("coffee", SubredditService.Sort.HOT,
                                                       null, null, 0, 2, null);

        try {
            System.out.println(IOUtils.toString(response.getBody().in()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
