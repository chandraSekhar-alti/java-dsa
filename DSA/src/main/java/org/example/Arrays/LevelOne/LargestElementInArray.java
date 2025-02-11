package org.example.Arrays.LevelOne;

import java.util.ArrayList;
import java.util.Arrays;

public class LargestElementInArray {
    public static void main(String[] args) {
        int[] inputArray = {1, 2, 5, 3, 8};
        LargestElementInArray obj = new LargestElementInArray();
        int largestNumber = obj.sortingArrayUsingClassicForLoop(inputArray);
        System.out.println("largestNumber using sortingArrayUsingClassicForLoop method : " + largestNumber);

        int largestNumber2 = obj.sortingArrayUsingArraysMethod(inputArray);
        System.out.println("largestNumber  using sortingArrayUsingArraysMethod method : " + largestNumber2);

        int largestNumber3 = obj.sortingUsingStreams(inputArray);
        System.out.println("largestNumber  using sortingUsingStreams method : " + largestNumber3);


        int largestNumber4 = obj.usingLogic(inputArray);
        System.out.println("largestNumber  using usingLogic method : " + largestNumber4);

    }

    public int sortingArrayUsingClassicForLoop(int[] userArray) {
        // here we are sorting the array and then getting the last number which is the largest element
        for (int i = 0; i < userArray.length; i++) {
            for (int j = i + 1; j < userArray.length; j++) {
                if (userArray[i] > userArray[j]) {
                    int temp = userArray[i];
                    userArray[i] = userArray[j];
                    userArray[j] = temp;
                }
            }
        }
        return userArray[userArray.length - 1];

    }

    public int sortingArrayUsingArraysMethod(int[] userArray) {
        Arrays.sort(userArray);
        return userArray[userArray.length - 1];
    }

    public int sortingUsingStreams(int[] userArray) {
        return Arrays.stream(userArray).max().getAsInt();
    }

    public int usingLogic(int[] userArray) {
        int max = userArray[0];
        for (int i = 0; i < userArray.length; i++) {
            if (userArray[i] > max) {
                max = userArray[i];
            }
        }
        return max;
    }
}
