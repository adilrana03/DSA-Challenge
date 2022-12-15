/* 169. Majority Element
Easy
13K
417
Companies
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.



Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2 . */


class Solution {
        public int majorityElement(int[] nums) {
            int maj=nums.length/2;
            int n= nums.length;
            for(int i : nums){
                int count=0;
                for(int j : nums){
              if(i==j){
                count++; 
              }  
            }
            if(count>maj){
                return i;
            }
            }
            return 0;  
        }
    }