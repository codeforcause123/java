import java.io.*;
import java.util.*;

class Node {
    int val;
    Node left;
    Node right;

    Node(int data) {
        val = data;
        left = null;
        right = null;
    }
}

class Arraylist {
    public static void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.val + " ");
        inOrder(root.right);
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            arr.add(i);
        }

        System.out.println(arr);
        Node root = new Node(6);
        System.out.println(root.val);
        for (int i = 0; i < arr.size(); i++) {
            root.right = new Node(arr.get(i));
            root = root.right;
        }
        inOrder(root);
    }
}