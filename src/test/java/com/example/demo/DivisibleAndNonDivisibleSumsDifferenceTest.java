package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class DivisibleAndNonDivisibleSumsDifferenceTest {


    @Test
    void testDivisibleAndNonDivisibleSumsDifferenceTest(){
        DivisibleAndNonDivisibleSumsDifference divisibleAndNonDivisibleSumsDifference = new DivisibleAndNonDivisibleSumsDifference();
        int n = 10;
        int m = 3;
        int result = 19;

        Assertions.assertEquals(result, divisibleAndNonDivisibleSumsDifference.differenceOfSums(n,m));

        int n1 = 5;
        int m1 = 6;
        int result1 = 15;

        // L'ordre a de l'importance, il faut passer les variables dans le même ordre que dans le code
        Assertions.assertEquals(result1, divisibleAndNonDivisibleSumsDifference.differenceOfSums(n1,m1));

        int n2 = 5;
        int m2 = 1;
        int result2 = -15;

        Assertions.assertEquals(result2, divisibleAndNonDivisibleSumsDifference.differenceOfSums(n2, m2));
    }
}
