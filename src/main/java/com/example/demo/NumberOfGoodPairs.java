package com.example.demo;

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
