package com.example.demo;
// Enoncé de l'algo Number of good pairs :
// Lien algo : https://leetcode.com/problems/number-of-good-pairs/
//Given an array of integers nums, return the number of good pairs.
//
//A pair (i, j) is called good if nums[i] == nums[j] and i < j.
//
//Example 1:
//Input: nums = [1,2,3,1,1,3]
//Output: 4
//Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
//
//Example 2:
//Input: nums = [1,1,1,1]
//Output: 6
//Explanation: Each pair in the array are good.
//
//Example 3:
//Input: nums = [1,2,3]
//Output: 0

public class NumberOfGoodPairs {
    // Fonction numIdenticalPairs permettant de comparer les différentes données du tableau entre elles.
    public int numIdenticalPairs(int[] nums) {
        //On initialise une variable qui va servir de compteur à 0
        int numberOfGoodPairs = 0;
        //on fait une boucle extérieure qui ne bougera pas tant que la boucle intérieure n'aura pas fini
        for(int i = 0; i<nums.length; i++){
            //Boucle intérieure qui incrémentera la boucle extérieure quand elle sera terminée
            for(int j = i+1; j<nums.length; j++){
                if(nums[i] == nums[j]){
                    // Lorsqu'il y a des éléments identitques dans la boucle i et la boucle j, on ajoute 1 au compteur
                    numberOfGoodPairs ++;
                }
            }
        }
        return numberOfGoodPairs;
    }
}
