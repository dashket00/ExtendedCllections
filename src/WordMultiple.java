import java.util.HashMap;
import java.util.Map;

public class WordMultiple {
    public static Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Boolean> result = new HashMap<>();
        Map<String, Integer> countMap = new HashMap<>();

        for (String str : strings) {
            countMap.put(str, countMap.getOrDefault(str, 0) + 1);
        }

        for (String key : countMap.keySet()) {
            result.put(key, countMap.get(key) >= 2);
        }

        return result;
    }

    public static void main(String[] args) {
        String[] arr1 = {"a", "b", "a", "c", "b"};
        System.out.println(wordMultiple(arr1));

        String[] arr2 = {"c", "b", "a"};
        System.out.println(wordMultiple(arr2));

        String[] arr3 = {"c", "c", "c", "c"};
        System.out.println(wordMultiple(arr3));
    }
}
