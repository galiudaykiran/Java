package org.example.DSA.Arrays;

//Given an array where each number represents the height of a building, find how much rainwater can be trapped between the buildings.
//Easy calculation
//
//For each position:
//
//Water = minimum(left tallest, right tallest) - current height
//
//For example, if:
//
//left tallest  = 2
//right tallest = 3
//current height = 0
//
//Then:
//
//Water = min(2,3) - 0
//        = 2

//So that position holds 2 units of water.



public class Trapping_Rain_Water_BruteForce {

    public static void main(String[] args) {

        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};

        System.out.println(trap(height));

    }

    public static int trap(int[] height) {

        int totalWater = 0;

        for (int i = 0; i < height.length; i++) {

            int leftMax = 0;
            int rightMax = 0;

            // Find tallest building on left
            for (int j = 0; j <= i; j++) {
                leftMax = Math.max(leftMax, height[j]);
            }

            // Find tallest building on right
            for (int j = i; j < height.length; j++) {
                rightMax = Math.max(rightMax, height[j]);
            }

            int water = Math.min(leftMax, rightMax) - height[i];

            if (water > 0) {
                totalWater += water;
            }
        }

        return totalWater;
    }
}
