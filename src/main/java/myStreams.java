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

    public static String generateFizzBuzz () {
        return null;
    }

    public static String getMyFizzBuzz(int number) {
        String result =  Optional.of(number)
                .map(n -> (n % 3 == 0 ? myFizzBuzzMap.get(3) : "") + (n % 5 == 0 ? myFizzBuzzMap.get(5) : ""))
                .get();

        return result.isEmpty() ? Integer.toString(number) : result;
    }

}
