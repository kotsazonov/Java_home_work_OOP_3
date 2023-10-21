import java.util.Collections;
import java.util.List;

public class ServiceFlow {

    public void sort(List<Stream> потоки) {
        Collections.sort(потоки, new StreamComparator());
    }
}