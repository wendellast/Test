import java.util.ArrayList;
import java.util.List;

public class List2 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(9);

        for (Integer number : numbers) {
            System.out.println(number);
        }

    }
}
