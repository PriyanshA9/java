import java.util.Scanner;

public class divisorsOfANumber {
    
    public static void divisorOfNo(int n) {

        int i;
        
        for(i = 1 ; i <= n ; i++){

            if(n % i == 0) {

                System.out.print(i + " ");

            }

        }

    }
    
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)){

            System.err.print("Enter a number : ");
            int n = sc.nextInt();

            divisorOfNo(n);
        }
    }
}
