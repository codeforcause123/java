import java.util.*;
import java.util.stream.Collectors;

class array {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        
        System.out.println(list);
    }
}
