/*
 Decompress the String -0:26:39
Description

Given a string of lowercase characters and integers, decompress the string under the following rules:

- If an integer is encountered, the character just before it gets added to a final string as many times as the number

For instance, if the string is "a3b2" => the output should be "aaabb" because *a* is followed by 3, and *b* is followed by 2

Write a program that decompresses the string based on rules above


Input
Input Format

Input contains one string

Constraints

Length of string <= 100


Output
Output the decompressed string


Sample Input 1 

a3b2
Sample Output 1

aaabb
 */

 public static void decompressTheString(String a){
      //write your code here
      int n=a.length();
      String ans="";
      
      for(int i=0; i<n; i+=2)
      {
          char ch=a.charAt(i);
          int num=a.charAt(i+1)-'0';
          while(num -- >0)
          {
              ans=ans+ch;
              // num--;
          }
      }
      System.out.println(ans);
    }
  