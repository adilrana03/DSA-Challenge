Triplet Sum Ended
Description

Given an array of integers, find if there exists two numbers in the array whose sum is equal to a third number c, which is also present in the array.

i.e. a + b = c

If there exist any such triplet in the array output 1 else output 0.



Note: a,b,c all need to be at different indices, i.e. you cannot use any element twice


Input
The first line of input will contain an integer T, denoting the number of test cases

The first line of each test case will contain an integer N, denoting the length of the array

The next line will contain N array elements.



Constraints:
1<= T <= 10

1<= N <= 10^3

1<= array[i] <= 10^6


Output
For each test case , output 0 or 1 in a new line


Sample Input 1 

1
5
1 3 2 4 5
Sample Output 1

1
Hint

In Sample 1:

T = 1, N = 5

1 + 3 = 4 which is also present in the array , So output is 1







//Enter code here
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n= sc.nextInt();
            int arr[]= new int[n];
            for(int i=0; i<n; i++){
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
          int count=0;
          for(int i=0; i<n; i++)
          {
           int l=0;
           int r=n-1;
           while(l<r)
           {
            if(arr[l]+arr[r]==arr[i]){
               count++;
               break;
           }else if(arr[l]+arr[r]>arr[i]){
               r--;
           }else{
               l++;
           }
           }
          }
            if(count>0){
                System.out.println("1");
            }else{
                System.out.println("0");
            }
        }
    }
}



