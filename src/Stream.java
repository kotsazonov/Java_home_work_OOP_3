
import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudyGroup> {
    private List<StudyGroup> groups;

    public Stream(List<StudyGroup> группы) {
        this.groups = группы;
    }

    @Override
    public Iterator<StudyGroup> iterator() {
        return groups.iterator();
    }

    public int getNumberOfGroups() {
        return groups.size();
    }
}