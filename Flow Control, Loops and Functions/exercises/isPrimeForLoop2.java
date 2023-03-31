import java.util.Scanner;

public class isPrimeForLoop2 {
    
    public static void isPrime(int n){
        int count=0;

        for (int i = 1; i <=n; i++){

            if (n%i==0){
                count ++;
            }
        }
        if (count==2){
            System.out.println("Yes");  
        }
            
        else{ 
            System.out.println("No");
        }
    }
    
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

            System.out.print("Enter a number : ");
            int n = sc.nextInt();

            isPrime(n);
        }
    }
}
