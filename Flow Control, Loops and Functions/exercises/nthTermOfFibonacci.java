import java.util.Scanner;

public class nthTermOfFibonacci {
    
    public static int nthFibonacciTerm(int n){
        
        int a = 0 , b = 1, ans = 0;;

        if(n == 0){
            return a;
        }
        else if(n == 1){
            return b;
        }
        else{
            System.out.println("----------SERIES OF FIBONACCI----------");
                System.out.print(a + " ");
                System.out.print(b+ " ");
            for(int i = 2 ; i <= n ; i++){
                ans = a + b;
                System.out.print(ans+ " ");
                a = b ;
                b = ans;
            }
            System.out.println("\n---------------------------------------");
        }
        return b;
    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

            System.out.print("Enter the nth term of fibonacci : ");
            int f = sc.nextInt();

            System.out.println("THE " + f + "th TERM OF FIBONACCI SERIES IS : " + nthFibonacciTerm(f));
            
        }
    }
}
