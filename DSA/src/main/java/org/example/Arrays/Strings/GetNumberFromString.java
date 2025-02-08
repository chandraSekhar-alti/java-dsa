package org.example.Arrays.Strings;

public class GetNumberFromString {
    public static void main(String[] args) {
        String s1 = "He12ll45o8";
        int total = 0;

        for (int i = 0; i < s1.length(); i++) {
            char temp = s1.charAt(i);
            if (Character.isDigit(temp)) {
                total = Character.getNumericValue(temp) + total;
            }
        }

        System.out.println("total is : " + total);
    }
}
