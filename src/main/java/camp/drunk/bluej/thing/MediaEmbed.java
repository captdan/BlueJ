package camp.drunk.bluej.thing;

public class MediaEmbed {
    String content;
    Integer height;
    Integer width;
    Boolean scrolling;

    @Override
    public String toString() {
        return "MediaEmbed{" +
               "content='" + content + '\'' +
               ", height=" + height +
               ", width=" + width +
               ", scrolling=" + scrolling +
               '}';
    }
}
