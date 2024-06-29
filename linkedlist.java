import java.io.*;
import java.util.*;

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

class DLL{
    
}
class linkedlist{
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        Node start = new Node(arr[0]);
        for(int i=1; i<arr.length;i++){
            Node temp = new Node(arr[i]);
            start.next = temp;
            start = start.next;
        }

    }
}