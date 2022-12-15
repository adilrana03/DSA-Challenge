/*  Flight crash Ended
Description

Capture.JPG

You are the pilot of a flight and the flight has crash landed into water.

All n people have already lined up in a row (for convenience let's label them all from left to right with positive integers from 1 to n) and await further instructions. However, one should evacuate them properly, in a strict order. Specifically:

The first people to leave the ship are old people. Then women and children (both groups have the same priority) leave the ship. After that all men are evacuated from the ship. The crew leaves the sinking ship last.

If we cannot determine exactly who should leave the flight first for any two members by the rules from the previous paragraph, then the one who stands to the left in the line leaves the flight first (or in other words, the one whose number in the line is less).

For each member we know his status, and also his name. All members have different names. Determine the order in which to evacuate everyone.


Input
Input Format
The first line contains an integer n, which is the number of people in the crew.

Then follow n lines.

The i-th of those lines contains two words — the name of the member who is i-th in line, and his status.

The status can have the following values: old for an old person, woman for a woman, child for a child, man for a man, crew for the crew.

Constraints
1 ≤ n ≤ 100

Output
Output Format
Print n lines. The i-th of them should contain the name of the member who must be the i-th one to leave the flight


Sample Input 1 

7
Ankush crew
Sachin man
Aditi woman
Pankaj old
Preeti old
Ansh child
Aarya woman
Sample Output 1

Pankaj
Preeti
Aditi
Ansh
Aarya
Sachin
Ankush */


//Enter code here
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        String s1[]=new String[n];
        String s2[]=new String[n];
        for(int i=0; i<n; i++){
            s1[i]=sc.next();
            s2[i]=sc.next();
        }
        solve(s1,s2,n);
    }
        
        public static void solve(String s1[], String s2[], int n){
            for(int i=0; i<n; i++){
                if(s2[i].equals("old")){
                     System.out.println(s1[i]+" ");
                }
        }
        for(int i=0; i<n; i++){
                if(s2[i].equals("woman") || s2[i].equals("child")){
                     System.out.println(s1[i]+" ");
                }
        }
        for(int i=0; i<n; i++){
                if(s2[i].equals("man")){
                     System.out.println(s1[i]+" ");
                }
        }
        for(int i=0; i<n; i++){
                if(s2[i].equals("crew")){
                     System.out.println(s1[i]+" ");
                }
        }
        }
}
                 
              

    