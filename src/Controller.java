import java.util.List;

public class Controller {
    private ServiceFlow сервис = new ServiceFlow();

    public void sort(List<Stream> потоки) {
        сервис.sort(потоки);
    }

}