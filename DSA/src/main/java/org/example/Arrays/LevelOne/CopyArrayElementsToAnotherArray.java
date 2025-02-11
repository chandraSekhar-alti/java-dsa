package org.example.Arrays.LevelOne;

import java.util.Arrays;

public class CopyArrayElementsToAnotherArray {
    public static void main(String[] args) {
        int[] inputArray = {1, 2, 3, 4, 5, 6};

        System.out.println("using classic method : " + Arrays.toString(usingLoop(inputArray)));
        System.out.println("using classic method : " + Arrays.toString(usingCloneMethod(inputArray)));
    }

    public static int[] usingLoop(int[] userArray) {
        int[] updatedArray = new int[userArray.length];
        for (int i = 0; i < userArray.length; i++) {
            updatedArray[i] = userArray[i];
        }
        return updatedArray;
    }

    public static int[] usingCloneMethod(int[ ] userArray){
        return userArray.clone();
    }

}
