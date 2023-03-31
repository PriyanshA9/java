import java.util.Scanner;

public class isPrime {
    
    public static boolean prime(int n){

        boolean isPrime = true;

        if(n <= 1){
            isPrime = false;
        }
        
        for(int i = 2 ; i < n ; i++){

            if(n % i == 0){
                isPrime = false;
            }
        }

        return isPrime;

    }
    
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

            System.out.print("Enter a number : ");
            int a = sc.nextInt();

            boolean x = prime(a);
            
            if(x){
                System.out.println(a + " IS A PRIME NUMBER");
            }
            
            else{
                System.out.println(a + " IS A NON-PRIME NUMBER");
            }
        }
    }
}
