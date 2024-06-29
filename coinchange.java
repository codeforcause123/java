import java.util.*;
import java.io.*;

public class coinchange {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int arr[] = {1,2,5,10,50,100};
      int note_count=0;
      for(int i=5;i>=0;i--)
      {
        if(arr[i]<=n)
        {
          note_count += n/arr[i];
          n %= arr[i];
        }
      }
      System.out.println(note_count);
  }
}