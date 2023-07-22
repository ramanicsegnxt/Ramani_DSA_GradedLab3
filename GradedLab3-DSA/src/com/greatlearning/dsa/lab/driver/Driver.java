package com.greatlearning.dsa.lab.driver;

import com.greatlearning.dsa.lab.question1.BalancingParentheses;
import com.greatlearning.dsa.lab.question2.BinarySearchTree;
import com.greatlearning.dsa.lab.question2.Node;
import com.greatlearning.dsa.lab.question2.PairSumBST;

import java.util.Arrays;
import java.util.Scanner;

public class Driver {
    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // driver code for first question
        BalancingParentheses balancingParentheses = new BalancingParentheses();
        String exp = balancingParentheses.getStringExpression(scanner);
        if (balancingParentheses.isBalanced(exp)) {
            System.out.println("The entered String has Balanced Brackets");
        } else {
            System.out.println("The entered Strings do not contain Balanced Brackets");
        }

        // driver code for second question
        BinarySearchTree bst = new BinarySearchTree();
        Node root = bst.constructBST(scanner);
        System.out.println("Enter Target sum:");
        int target = scanner.nextInt();
        PairSumBST pairSumBST = new PairSumBST();
        System.out.println(Arrays.toString(pairSumBST.pairSum(root, target)));
    }
}
