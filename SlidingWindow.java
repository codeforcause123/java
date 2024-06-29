import java.util.*;

public class SlidingWindow {
    public static void main(String[] args) {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        List<List<Integer>> result = slidingWindow(nums, k);
        for (List<Integer> window : result) {
            System.out.println(window);
        }
    }

    public static List<List<Integer>> slidingWindow(int[] nums, int k) {
        List<List<Integer>> result = new ArrayList<>();
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < nums.length; i++) {
            // Remove elements not within the sliding window
            while (!deque.isEmpty() && deque.peek() < i - k + 1) {
                deque.poll();
            }

            // Add the current element's index
            deque.offer(i);

            // Add the current sliding window to the result list
            if (i >= k - 1) {
                List<Integer> window = new ArrayList<>();
                for (int j = i - k + 1; j <= i; j++) {
                    window.add(nums[j]);
                }
                result.add(window);
            }
        }
        return result;
    }
}
