package camp.drunk.bluej.thing;

public class Media {
    public static class OEmbed {
        String type;
        String title;
        String version;
        String providerName;
        String providerUrl;
        Integer height;
        Integer width;
        String html;
        String thumbnailUrl;
        Integer thumbnailHeight;
        Integer thumbnailWidth;

        @Override
        public String toString() {
            return "OEmbed{" +
                   "type='" + type + '\'' +
                   ", title='" + title + '\'' +
                   ", version='" + version + '\'' +
                   ", providerName='" + providerName + '\'' +
                   ", providerUrl='" + providerUrl + '\'' +
                   ", height=" + height +
                   ", width=" + width +
                   ", html='" + html + '\'' +
                   ", thumbnailUrl='" + thumbnailUrl + '\'' +
                   ", thumbnailHeight=" + thumbnailHeight +
                   ", thumbnailWidth=" + thumbnailWidth +
                   '}';
        }
    }

    String type;
    OEmbed oembed;

    @Override
    public String toString() {
        return "Media{" +
               "type='" + type + '\'' +
               ", oembed=" + oembed +
               '}';
    }
}
