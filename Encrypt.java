package HomeworksTataStrive;
import java.util.Scanner;

import Solution;

class Solution {
    public String method(String input,byte k,byte r){
        char[] arr = input.toCharArray();

        for(int i=0;i<r;i++){
            for(int j=0;j<arr.length;j++){
                arr[j]+=k;
            }
        }
        return new String(arr);
    }
}


public class Encrypt {
    public static void main(String[] args) {
        System.out.println("Enter the string you want encrypt: ");
        Scanner sc = new Scanner(System.in);
        String t= sc.nextLine();
        
        byte k,r;
        System.out.println("Enter no of times to rotatate : ");
        k=sc.nextByte();
        System.out.println("Enter the no of rounds : ");
        r=sc.nextByte();
        Solution s1 = new Solution();
        String ans = s1.method(t, k, r);
        System.out.println(ans);
        sc.close();

    }
}
