import java.io.*;
import java.util.*;
class ArraySum{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        
        for(int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }
        int length = arr.length;
        System.out.println(length);
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        System.out.println(sum);
        scanner.close();
    }
}