package com.example.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class TwoSumTest {
//    private TwoSum twoSumUnderTest;

//    @BeforeEach
//    public void initTwoSum() {
//        twoSumUnderTest = new TwoSum();
//    }

    @Test
    void testTwoSumOfPositiveNumbers() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] expected = {0, 1};
        assertArrayEquals(expected, TwoSum.twoSum(nums, target));
    }

    @ParameterizedTest(name = "Test avec nums={0}, target={1}, attendu={2}")
    @CsvSource({
            "'1,2,3,4', 5, '0,3'",
            "'2,7,11,15', 9, '0,1'",
            "'3,2,4', 6, '1,2'",
            "'3,3', 6, '0,1'"
    })
    public void testTwoSum(String numsStr, int target, String expectedStr) {
        // Convertir les chaînes de caractères en tableaux d'entiers
        int[] nums = convertStringToIntArray(numsStr);
        int[] expected = convertStringToIntArray(expectedStr);

        // Appel de la méthode twoSum
        int[] result = TwoSum.twoSum(nums, target);

        // Vérification du résultat
        assertArrayEquals(expected, result);
    }

    // Méthode utilitaire pour convertir une chaîne de caractères en tableau d'entiers
    private int[] convertStringToIntArray(String str) {
        String[] items = str.split(",");
        int[] result = new int[items.length];
        for (int i = 0; i < items.length; i++) {
            result[i] = Integer.parseInt(items[i].trim());
        }
        return result;
    }
}