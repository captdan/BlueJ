package camp.drunk.bluej.thing;

public class Thing<T> {
    String id;
    String name;
    String kind;
    T data;

    @Override
    public String toString() {
        return "Thing{" +
               "id='" + id + '\'' +
               ", name='" + name + '\'' +
               ", kind='" + kind + '\'' +
               ", data=" + data +
               '}';
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getKind() {
        return kind;
    }

    public T getData() {
        return data;
    }
}
