package me.samarthya;

import java.util.Arrays;

/**
 * given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.
 */
class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int smallestInt = 1;
        if(A.length == 0) return smallestInt;
        // Sort
        Arrays.sort(A);

        // If the first element is greater than 1
        if(A[0] > 1) return smallestInt;

        //If the last element is less than 1
        if(A[ A.length - 1] <= 0 ) return smallestInt;

        //Iterate through the array and process
        for(int i = 0; i < A.length; i++){
            if(A[i] == smallestInt){
                smallestInt++;}
        }

        return smallestInt;
    }

    public static void main(String[] args) {
	// write your code here
        int[][] a = new int[][] {
                {1, 3, 3, 4},
                {-1, 1},
                {-1, 2},
                {-1, 2, 3},
                {1,2,3},
                {2, 3, 4},
                {1, 2, 3, 4, 5},

        };

        for (int i=0; i< a.length; i++ ) {
            System.out.printf(" Smallest Int: %d\n", new Solution().solution(a[i]));
        }
    }
}
