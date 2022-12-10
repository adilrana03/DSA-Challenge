// 7. Reverse Integer
// Medium
// 9.2K
// 11.2K
// Companies
// Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

// Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

// Example 1:

// Input: x = 123
// Output: 321
// Example 2:

// Input: x = -123
// Output: -321
// Example 3:

// Input: x = 120
// Output: 21


class Solution {
        public int reverse(int x) {
            // x=534;
            // now x become 53
            // now x become 5
            long rev= 0;
            while( x != 0){
                rev = (rev*10) + (x % 10);
                // rev= 0*10=0. + 534%10=4   ======rev=4;
                // rev= (4 * 10 = 40) + (53 % 10 = 3) = 43
                // rev= (43 * 10 = 430) + 5 =435
    
                x= x/10; 
                // To removing the last character from num
                // x=534/10=53;
                // x=53/10=5
    
                if( rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE)
                    return 0;
            }
            return (int) rev;
        }
    }