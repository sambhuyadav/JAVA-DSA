import java.lang.*;
import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int initialnumber = N;
        int reverseNum = 0;

        while(N != 0){
            int ld = N % 10 ;
            reverseNum = reverseNum * 10 + ld;
            N=N/10;
        }

        if (initialnumber==reverseNum) {
            System.out.println("Palindrome.");
        }else{
            System.out.println("Not Palindrome.");
        }

       
        
    }
}