package org.example.Arrays;

import java.util.Arrays;

public class SortingArray {
    public static void main(String[] args) {
        int[] arr = {1, 6, 8, 2, 4};
        int[] updatedArray = sortingArray(arr);
        System.out.println("updated array is : "+Arrays.toString(updatedArray));

    }

    public static int[] sortingArray(int[] userArray) {

        for (int i = 0; i < userArray.length; i++) {
            for (int j = 0; j < userArray.length; j++) {
                if (userArray[i]< userArray[j]){
                    int temp = userArray[i];
                    userArray[i] = userArray[j];
                    userArray[j] = temp;
                }
            }
        }
        return userArray;
    }
}
