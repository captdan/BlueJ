package camp.drunk.bluej.thing;

public class Link extends Thing<Link.Data> {
    public static class Data implements Votable, Created {
        String author;
        String authorFlairCssClass;
        String authorFlairText;
        Boolean clicked;
        String domain;
        Boolean hidden;
        Boolean isSelf;
        String linkFlairCssClass;
        String linkFlairText;
        Media media;
        MediaEmbed mediaEmbed;
        Integer numComments;
        Boolean over18;
        String permalink;
        Boolean saved;
        Integer score;
        String selftext;
        String selftextHtml;
        String subreddit;
        String subredditId;
        String thumbnail;
        String title;
        String url;
        /**
         * This can be false if not edited or a long value of the date if edited
         */
        String edited;
        String distinguished;
        Boolean stickied;
        Integer ups;
        Integer downs;
        Boolean likes;
        Long created;
        Long createdUtc;

        @Override
        public Integer ups() {
            return ups;
        }

        @Override
        public Integer downs() {
            return downs;
        }

        @Override
        public Boolean likes() {
            return likes;
        }

        @Override
        public Long created() {
            return created;
        }

        @Override
        public Long createdUtc() {
            return createdUtc;
        }

        @Override
        public String toString() {
            return "Data{" +
                   "author='" + author + '\'' +
                   ", authorFlairCssClass='" + authorFlairCssClass + '\'' +
                   ", authorFlairText='" + authorFlairText + '\'' +
                   ", clicked=" + clicked +
                   ", domain='" + domain + '\'' +
                   ", hidden=" + hidden +
                   ", isSelf=" + isSelf +
                   ", likes=" + likes +
                   ", linkFlairCssClass='" + linkFlairCssClass + '\'' +
                   ", linkFlairText='" + linkFlairText + '\'' +
                   ", media=" + media +
                   ", mediaEmbed=" + mediaEmbed +
                   ", numComments=" + numComments +
                   ", over18=" + over18 +
                   ", permalink='" + permalink + '\'' +
                   ", saved=" + saved +
                   ", score=" + score +
                   ", selftext='" + selftext + '\'' +
                   ", selftextHtml='" + selftextHtml + '\'' +
                   ", subreddit='" + subreddit + '\'' +
                   ", subredditId='" + subredditId + '\'' +
                   ", thumbnail='" + thumbnail + '\'' +
                   ", title='" + title + '\'' +
                   ", url='" + url + '\'' +
                   ", edited=" + edited +
                   ", distinguished='" + distinguished + '\'' +
                   ", stickied=" + stickied +
                   '}';
        }

        public String getAuthor() {
            return author;
        }

        public String getAuthorFlairCssClass() {
            return authorFlairCssClass;
        }

        public String getAuthorFlairText() {
            return authorFlairText;
        }

        public Boolean getClicked() {
            return clicked;
        }

        public String getDomain() {
            return domain;
        }

        public Boolean getHidden() {
            return hidden;
        }

        public Boolean getIsSelf() {
            return isSelf;
        }

        public String getLinkFlairCssClass() {
            return linkFlairCssClass;
        }

        public String getLinkFlairText() {
            return linkFlairText;
        }

        public Media getMedia() {
            return media;
        }

        public MediaEmbed getMediaEmbed() {
            return mediaEmbed;
        }

        public Integer getNumComments() {
            return numComments;
        }

        public Boolean getOver18() {
            return over18;
        }

        public String getPermalink() {
            return permalink;
        }

        public Boolean getSaved() {
            return saved;
        }

        public Integer getScore() {
            return score;
        }

        public String getSelftext() {
            return selftext;
        }

        public String getSelftextHtml() {
            return selftextHtml;
        }

        public String getSubreddit() {
            return subreddit;
        }

        public String getSubredditId() {
            return subredditId;
        }

        public String getThumbnail() {
            return thumbnail;
        }

        public String getTitle() {
            return title;
        }

        public String getUrl() {
            return url;
        }

        public String getEdited() {
            return edited;
        }

        public String getDistinguished() {
            return distinguished;
        }

        public Boolean getStickied() {
            return stickied;
        }

        public Integer getUps() {
            return ups;
        }

        public Integer getDowns() {
            return downs;
        }

        public Boolean getLikes() {
            return likes;
        }

        public Long getCreated() {
            return created;
        }

        public Long getCreatedUtc() {
            return createdUtc;
        }
    }

    @Override
    public String toString() {
        return "Link{} " + super.toString();
    }
}
