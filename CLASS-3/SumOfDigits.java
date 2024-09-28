import java.util.*;

 class sum {    
    public static void main(String[] args) { 

        Scanner sc = new Scanner(System.in); 
        int T = sc.nextInt(); 
        


        

        for(int i = 0; i<T; i++){
            int N = sc.nextInt();
            int sum = 0 ;
            while (N != 0) {
                int ld = N % 10;
                sum = sum + ld;
                N = N / 10;
            }
    
            System.out.println(sum);
        }
        }
    }




// import java.util.*;

// public class SumOfDigits {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

        
//         int T = scanner.nextInt();

   
//         for (int i = 0; i < T; i++) {
//             int N = scanner.nextInt();
//             System.out.println(sumofAlldigits(N));
//         }

//         scanner.close();
//     }

   
//     public static int sumofAlldigits(int n) {
//         int sum = 0;
//         while (n > 0) {
//             sum += n % 10;
//             n /= 10;
//         }
//         return sum;
//     }
// }
