import java.util.*;

class Priority {
    public static void main(String[] args) {
        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>(Collections.reverseOrder());
        int array[] = { 1, 2, 67, 34 };
        Integer arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(arr));
        System.out.println(list);
        for (Integer i = 0; i < list.size(); i++) {
            pQueue.add(list.get(i));
        }
        System.out.println(pQueue.peek());
        System.out.println(pQueue.poll());
        System.out.println(pQueue.peek());
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        while (pQueue.size() > 0) {
            System.out.println(pQueue.poll());
        }
        int[] intArray = pQueue.stream().mapToInt(Integer::intValue).toArray();
        for (int i : intArray) {
            System.out.print(i + " ");
        }
    }
}