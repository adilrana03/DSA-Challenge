import java.util.*;
class Main
{
    public static void main(String[] args){
        int n=4;
        char arr[][]= {{R,R,R,R},
            {L,L,L,L},
            {U,U,U,U},
            {D,D,D,D}};
        Answer(arr,n-1);
        }
    
public static void Answer(char arr[][],int s)
    {
    HashMap<Integer,Integer>hm=new HashMap<>();
    int i=0,j=0,count=0,f=0;
    while((i>=0 && j>=0)&&(i<=s && j<=s))
    {
        if(arr[i][j]=='R') {
            j++;
            count++;
            hm.put(i,j);
        }
        else if(arr[i][j]=='L') {
            count++;
            j--;
            hm.put(i,j);
            
        }
        else if(arr[i][j]=='U') {
            count++;
            i--;
        hm.put(i,j);    
        }
        else if(arr[i][j]=='D') {
            count++;
            i++;
        hm.put(i,j);  
        }
        if(hm.containsKey(i)) {
            if(hm.get(i)==j) {
                f++;
                if(f>s+1) {
                    count=0;
                    break;
                }
            }
        }
    }
    System.out.println(count);
} 
}