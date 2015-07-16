import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by Ssavanu on 7/15/2015.
 */
public class myStreams {

    private static Map<Integer, String> myFizzBuzzMap = new HashMap<Integer, String>();
    static {
        myFizzBuzzMap.put(3, "Fizz");
        myFizzBuzzMap.put(5, "Buzz");
    }

    public static List generateFizzBuzz (int number1, int number2) {
        List< String > myList = new ArrayList<>();

        return IntStream.rangeClosed(number1, number2)
                .mapToObj(i -> generateFizzBuzz(i))
                .collect(Collectors.toList());
    }

    public static String generateFizzBuzz (int n) {
        String result = (n % 3 == 0 ? "Fizz" : "") + (n % 5 == 0 ? "Buzz" : "");
        return result.isEmpty() ? Integer.toString(n) : result;
    }

    public static String generateFizzBuzz () {
        return null;
    }
}
