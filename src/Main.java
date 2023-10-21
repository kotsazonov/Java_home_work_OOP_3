import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // 1. Инициализировать группы
        StudyGroup groupA = new StudyGroup("GroupA");
        StudyGroup groupB = new StudyGroup("GroupB");
        StudyGroup groupC = new StudyGroup("GroupC");

        // 2. Инициализировать потоки
        Stream stream1 = new Stream(new ArrayList<>(Arrays.asList(groupA, groupB)));
        Stream stream2 = new Stream(new ArrayList<>(Arrays.asList(groupA)));
        Stream stream3 = new Stream(new ArrayList<>(Arrays.asList(groupA, groupB, groupC)));

        List<Stream> streams = new ArrayList<>(Arrays.asList(stream1, stream2, stream3));

        // 3. Сортировать потоки
        Controller controller = new Controller();
        controller.sort(streams);

        // 4. Вывести отсортированные потоки на экран
        for (Stream stream : streams) {
            System.out.println("Stream with " + stream.getNumberOfGroups() + " groups.");
        }
    }
}