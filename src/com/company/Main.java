package com.company;
import java.util.Scanner;
public class Main {
    static Node create() {
        int data;
        Scanner sc = new Scanner(System.in);
        Node root=null;
        System.out.print("enter value:");
        data = sc.nextInt();
        if (data == -1)
            return null;
        root = new Node(data);
        System.out.print("enter the left of" + root.data);
        root.left = create();
        System.out.print("enter the right of"+root.data);
        root.right=create();
        return root;
    }
    static void inorder(Node root)//LNR
    {
        if(root==null)
            return;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    static void preorder(Node root)//NLR
    {
        if(root==null)
            return;
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    static void postorder(Node root)//LRN
    {
        if(root==null)
            return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }

    public static void main(String[] args) {
        Node root = create();
        preorder(root);
        System.out.println();
        postorder(root);
        System.out.println();
        inorder(root);
    }
}
class Node{
    Node right,left;
    int data;
    public Node(int data){
        this.data=data;
        left=null;
        right=null;
    }
}

