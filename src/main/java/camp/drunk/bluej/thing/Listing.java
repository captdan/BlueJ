package camp.drunk.bluej.thing;

import java.util.List;

public class Listing<T extends Thing> {
    public Data<T> getData() {
        return data;
    }

    public String getKind() {
        return kind;
    }

    public static class Data<T extends Thing> {
        String before;
        String after;
        String modhash;
        String facets;
        List<T> children;

        @Override
        public String toString() {
            return "Data{" +
                   "before='" + before + '\'' +
                   ", after='" + after + '\'' +
                   ", modhash='" + modhash + '\'' +
                   ", children=" + children +
                   '}';
        }

        public String getBefore() {
            return before;
        }

        public String getAfter() {
            return after;
        }

        public String getModhash() {
            return modhash;
        }

        public List<T> getChildren() {
            return children;
        }
    }

    String kind;
    Data<T> data;

    @Override
    public String toString() {
        return "Listing{" +
               "kind='" + kind + '\'' +
               ", data=" + data +
               '}';
    }
}

