package com.greatlearning.dsa.lab.question2;

import java.util.Scanner;

public class BinarySearchTree {

    public Node insert(Node root, int data) {
        Node node = new Node(data);
        Node temp = root, parent = null;
        while (temp != null) {
            parent = temp;
            if (data < temp.data) {
                temp = temp.left;
            } else if (data > temp.data) {
                temp = temp.right;
            }
        }
        if (parent == null) {
            parent = node;
        } else if (data < parent.data) {
            parent.left = node;
        } else {
            parent.right = node;
        }
        return parent;
    }

    public Node constructBST(Scanner scanner) {
        Node root = null;
        System.out.println("Enter Number of Nodes:");
        int numberOfNodes = scanner.nextInt();
        for (int i = 0; i < numberOfNodes; i++) {
            int value = scanner.nextInt();
            if (root == null) {
                root = insert(root, value);
            } else {
                insert(root, value);
            }
        }
        return root;
    }
}
