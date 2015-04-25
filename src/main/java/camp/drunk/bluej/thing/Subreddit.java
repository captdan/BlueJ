package camp.drunk.bluej.thing;

import java.util.Arrays;

public class Subreddit extends Thing<Subreddit.Data> {
    public static class Data{
        Integer accountsActive;
        Integer commentScoreHideMins;
        String description;
        String descriptionHtml;
        String displayName;
        String headerImg; // URL
        Integer[] headerSize;
        String headerTitle;
        Boolean over18;
        String publicDescription;
        Boolean publicTraffic;
        Long subscribers;
        String submissionType; // { "any", "link", "self" }
        String submitLinkLabel;
        String submitTextLabel;
        String subredditType; // { "public", "private", "restricted", "gold_restricted", "archived" }
        String title;
        String url;
        Boolean userIsBanned;
        Boolean userIsContributor;
        Boolean userIsModerator;
        Boolean userIsSubscriber;

        @Override
        public String toString() {
            return "Data{" +
                   "accountsActive=" + accountsActive +
                   ", commentScoreHideMins=" + commentScoreHideMins +
                   ", description='" + description + '\'' +
                   ", descriptionHtml='" + descriptionHtml + '\'' +
                   ", displayName='" + displayName + '\'' +
                   ", headerImg='" + headerImg + '\'' +
                   ", headerSize=" + Arrays.toString(headerSize) +
                   ", headerTitle='" + headerTitle + '\'' +
                   ", over18=" + over18 +
                   ", publicDescription='" + publicDescription + '\'' +
                   ", publicTraffic=" + publicTraffic +
                   ", subscribers=" + subscribers +
                   ", submissionType='" + submissionType + '\'' +
                   ", submitLinkLabel='" + submitLinkLabel + '\'' +
                   ", submitTextLabel='" + submitTextLabel + '\'' +
                   ", subredditType='" + subredditType + '\'' +
                   ", title='" + title + '\'' +
                   ", url='" + url + '\'' +
                   ", userIsBanned=" + userIsBanned +
                   ", userIsContributor=" + userIsContributor +
                   ", userIsModerator=" + userIsModerator +
                   ", userIsSubscriber=" + userIsSubscriber +
                   '}';
        }
    }

    @Override
    public String toString() {
        return "Subreddit{} " + super.toString();
    }
}
