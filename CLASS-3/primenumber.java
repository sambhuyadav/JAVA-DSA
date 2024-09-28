import java.util.*;

public class primenumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        

        for(int i = 1; i <= T; i++){
            int N = sc.nextInt();
            int EN = N;
            int reversedNum = 0;
            while (N != 0) {
            int ld = N % 10 ;
            reversedNum = reversedNum * 10 + ld;
            N=N/10;
           }
           
           System.out.println((reversedNum % 10)+" "+(EN % 10));
           
        }

    }
}