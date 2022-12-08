// Equilibrium Element Ended
// Description

// Given an array A of N positive numbers. The task is to find the position where equilibrium first occurs in the array. Equilibrium position in an array is a position such that the sum of elements before it is equal to the sum of elements after it.


// Input
// Input Format

// First line contains an integer N denoting the size of the array.

// Then in the next line are N space separated values of the array A.

// N <= 1000

// Ai <= 10000


// Output
// In a new line print the position at which the elements are at equilibrium if no equilibrium point exists print -1.


// Sample Input 1 

// 5
// 3 3 5 5 1
// Sample Output 1

// 3

import java.util.*;
 class Main{
     public static int equilibrium(int arr[], int n){
        int i, j;
        int leftsum;
        int rightsum;
        for (i = 0; i < n; i++) {
            leftsum = 0; 
            for (j = 0; j < i; j++){
                 leftsum += arr[j];
                //  leftsum= 3+3+5+5+1;= 3,6,11,16,17
            }

 
            rightsum = 0;
            for (j = i + 1; j < n; j++){
                rightsum += arr[j];
                // rightSum=3+5+5+1=14,11,6;
                // So 6 will be the point where leftsum as well as rightsum will have the Equal Value;
            }
            if (leftsum == rightsum)
                return i+1;
        }
        return -1;
    }


    // Input Taking Part //
     public static void main(String[] args){
         Scanner sc = new Scanner (System.in);
         int n= sc.nextInt();
         int arr[]= new int[n];
         for(int i=0; i<n; i++){
             arr[i]= sc.nextInt();
         }
        System.out.println(equilibrium(arr, n));
    }
}