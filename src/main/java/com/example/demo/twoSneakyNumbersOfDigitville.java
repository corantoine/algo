package com.example.demo;

import java.util.Arrays;

public class twoSneakyNumbersOfDigitville {
    public int[] getSneakyNumbers(int[] nums) {
        int[] twoNums = new int[2];
        int a = 0;
        for(int i = 0; i< nums.length; i++){
            for(int j = i +1; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    // mettre les nombres en double dans un autre tableau
                    //Affecte la valeur de nums[i] à l'index 0 de twoNums[]
                    twoNums[a]= nums[i];
                    a++;
                }
            }
        }
        return twoNums;
    }
}
