import java.io.*;
import java.util.*;

class set {
    public static void main(String[] args) {
        HashMap<String, HashSet<Integer>> map = new HashMap<String, HashSet<Integer>>();
        HashSet<Integer> set = new HashSet<Integer>();
        set.add(1);
        set.add(1);
        set.add(1);
        map.put("1", set);
        System.out.println(map);
    }
}