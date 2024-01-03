import java.util.HashMap;
import java.util.Map;

public class Pairs {
    public static Map<String, String> pairs(String[] strings) {
        Map<String, String> result = new HashMap<>();

        for (String str : strings) {
            if (!str.isEmpty()) {
                result.put(str.substring(0, 1), str.substring(str.length() - 1));
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String[] arr1 = {"code", "bug"};
        System.out.println(pairs(arr1)); // Output: {"b": "g", "c": "e"}

        String[] arr2 = {"man", "moon", "main"};
        System.out.println(pairs(arr2)); // Output: {"m": "n"}

        String[] arr3 = {"man", "moon", "good", "night"};
        System.out.println(pairs(arr3)); // Output: {"g": "d", "m": "n", "n": "t"}
    }
}
