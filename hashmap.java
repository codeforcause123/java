import java.io.*;
import java.util.*;

class hashmap {
    public static void main(String[] args) {
        HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 1 };
        for (int ele : arr) {
            h.put(ele, h.getOrDefault(ele, 0) + 1);
        }
        HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
        String s = "aayush raj";
        for (Character c : s.toCharArray()) {
            map1.put(c,map1.getOrDefault(c, 0)+1);
        }
        System.out.println(map1);
    }
}