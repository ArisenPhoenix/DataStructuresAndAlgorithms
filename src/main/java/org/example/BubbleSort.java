package org.example;
import java.util.ArrayList;

public class BubbleSort {
    String[][] bubbleSort(String[][] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            //next, go to the next-to-last element
            for (int j = 0; j < n-i-1; j++) {
                int comparison = arr[j][1].compareToIgnoreCase(arr[j+1][1]);
                if (comparison > 0) {
                    String[] temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
}
