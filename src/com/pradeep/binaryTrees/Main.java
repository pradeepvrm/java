package com.pradeep.binaryTrees;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        BinaryTree tree = new BinaryTree();
//        tree.populate(scanner);
//        tree.display();

        BST tree = new BST();
        int[] nums = {1, 4, 10, 1, 9, 0, 3, 2, 7};
        tree.populate(nums);
        tree.display();
    }
}
