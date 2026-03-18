package com.pradeep.sorting;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {4,3,1,2,5};
        selectionSort sort = new selectionSort();
        sort.selection(arr);
        sort.display(arr);

    }
}
