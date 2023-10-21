import java.util.Comparator;

public class StreamComparator implements Comparator<Stream> {

    @Override
    public int compare(Stream p1, Stream p2) {
        return Integer.compare(p1.getNumberOfGroups(), p2.getNumberOfGroups());
    }
}