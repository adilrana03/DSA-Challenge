/*
 Three Max, Three Min Please -0:24:26
Description

Given an array of N integers, print the 3 distinct maximum and 3 distinct minimum elements of the array.


Input
Input Format

First line contains N

Second line contains N space separated integers which are elements of the array.

Constraints

0<=N<=100 (Please note that N can be 0 as well)

The values present in the array can be negative as well.




Output
In the first line, print the least 3 values (sorted) present in the array.

In the second line, print the top 3 values (sorted) present in the array.

In case there are not 3 min value, print "Not Possible" (without quotes).

In case there are not 3 max value, print "Not Possible" (without quotes).

So, according to the above statements, if both are not possible, you have to print "Not Possible" twice (once for each)

In the array, if you found out only 2 distinct min and 2 distinct max elements then also printNot Possibletwice [ one for minimum and other for maximum]


Sample Input 1 

8
1 2 3 4 2 1 6 5
Sample Output 1

1 2 3
4 5 6
 */

 import java.util.*;
class Main{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr[]=new int[n];
for(int z=0; z<n; z++){
arr[z]=sc.nextInt();
}
Arrays.sort(arr);
HashMap <Integer, Integer> hm=new HashMap<>();
ArrayList<Integer> list= new ArrayList<>();
for(int i=0; i<n; i++)
{
int key = arr[i];
if(hm.containsKey(key))
{
int count=hm.get(key);
count++;
hm.put(key, count);
}else
{
hm.put(key, 1);
list.add(key);
}
}
if(list.size()<3)
{
System.out.println("Not Possible");
System.out.print("Not Possible");
}
else
for(int i=0; i<3; i++)
{

System.out.print(list.get(i)+" ");
}
System.out.println();

for(int j=list.size()-3; j<list.size(); j++)
{
System.out.print(list.get(j)+" ");
}
}
}