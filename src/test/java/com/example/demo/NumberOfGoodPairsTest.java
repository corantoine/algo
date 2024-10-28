package com.example.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class NumberOfGoodPairsTest {

    @Test
    public void testNumberOfGoodPairs() {
         NumberOfGoodPairs numberOfGoodPairs = new NumberOfGoodPairs();

        int[] nums1 = { 1, 2, 3, 1, 1, 3};
        int expectedNums1 = 4;

        assertEquals(expectedNums1, numberOfGoodPairs.numIdenticalPairs(nums1));

        int[] nums2 = {1, 1, 1, 1};
        int expectedNums2 = 6;

        assertEquals(expectedNums2, numberOfGoodPairs.numIdenticalPairs(nums2));

        int[] nums3 = {1, 2, 3};
        int expectedNums3 = 0;
        assertEquals(expectedNums3, numberOfGoodPairs.numIdenticalPairs(nums3));
    }
}
