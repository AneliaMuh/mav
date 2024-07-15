import ru.netology.services.MonthsService;

public class Main {
    public static void main(String[] args) {
        MonthsService service = new MonthsService();
        int expected = 3;
        int actual = (int) service.calculate(10000, 3000, 20000);
        System.out.println(expected + " == ? == " + actual);
    }
}
