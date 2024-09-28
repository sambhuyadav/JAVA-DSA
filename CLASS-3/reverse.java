import java.util.*;

public class reverse{
    public static void main(String[] args){
    
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int reversedNum = 0 ;


        while(N != 0){
            int ld = N % 10;
            reversedNum = reversedNum * 10 + ld ;
            N = N/10;
        }

        System.out.println(reversedNum);





   }
}