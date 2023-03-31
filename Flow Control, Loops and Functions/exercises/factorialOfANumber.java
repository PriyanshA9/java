import java.util.Scanner;

public class factorialOfANumber {
    
    public static int factorialofanumber(int n){

        int fact = 1;
        
        while(n > 0){

            fact = fact * n;

            n--;

        }

        return fact;

    }
    
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

            System.out.print("Enter a number for its Factorial : ");
            int n = sc.nextInt();

            System.out.println("FACTORIAL OF " + n + " IS : " + factorialofanumber(n));
            ;

        }
    }
}
