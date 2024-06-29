import java.io.*;
import java.util.*;
import java.lang.Math.*;
public class TileGame{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int n = sc.nextInt();
        int ans = (int) Math.pow(l*(int)Math.sqrt(n),2);
        System.out.println(ans);
    }
}