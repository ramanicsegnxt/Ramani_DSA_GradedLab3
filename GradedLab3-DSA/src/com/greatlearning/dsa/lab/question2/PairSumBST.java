package com.greatlearning.dsa.lab.question2;

import java.util.HashSet;
import java.util.Stack;

public class PairSumBST {
    public int[] pairSum(Node root, int target) {
        HashSet<Integer> set = new HashSet<>();
        Stack<Node> stack = new Stack<>();
        while (true) {
            if (root != null) {
                stack.push(root);
                root = root.left;
            } else {
                if (stack.isEmpty()) {
                    break;
                }
                root = stack.pop();
                int val = target - root.data;
                if (set.contains(val)) {
                    return new int[]{val, root.data};
                }
                set.add(root.data);
                root = root.right;
            }
        }
        return new int[]{-1, -1};
    }
}
