import java.util.*;
public class categories {
  public static void main(String[] args) {
    Set set = new HashSet < > ();
    Set temp = null;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of elements in the array: ");
    int num = sc.nextInt();
    int categories = num;
    int arr[] = new int[num];
    System.out.println("Enter the elements of the arrays: ");
    for (int i = 0; i < num; i++) {
      arr[i] = sc.nextInt();
    }
    for (int i = 0; i < num - 1; i++) {
      temp = new HashSet < > ();
      temp.add(arr[i]);
      for (int j = i + 1; j < num; j++) {
        temp.add(arr[j]);
        categories += temp.size();
      }
      temp.clear();
    }
    System.out.println("The number of distinct categories in your array is: " + categories);
  }
}