package com.example.demo;// Enoncé de l'algo Two Sum:
//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//You can return the answer in any order.
//
//Example 1:
//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
//
//Example 2:
//Input: nums = [3,2,4], target = 6
//Output: [1,2]
//
//Example 3:
//Input: nums = [3,3], target = 6
//Output: [0,1]

// Classe utilitaire
public final class TwoSum {
    private TwoSum() {
        // Ne fait rien
    }

    //Méthode pour trouver 2 indices dans un tableau dont les valeurs additionnées donnent le résultat "target"
    public static int[] twoSum(int[] nums, int target){
        //On boucle sur chaque élément du tableau nums
        for (int i = 0; i < nums.length; i++) {
            // On boucle sur chaque élément suivant l'élément i
            for (int j = i+1; j < nums.length ; j++) {
                // On vérifie si la somme des éléments aux indices "i" et "j" est égale à "target"
                if(nums[i] + nums[j] == target){
                    // Si oui : retourne un tableau contenant les indices "i" et "j"
                   return new int[]{i, j};
                }
            }
        }
        //Si aucune paire n'est trouvée : retourne un tableau vide
    return new int[]{};
    }
}
