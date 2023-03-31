import java.util.Scanner;

public class typeOfInteger {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            
            System.out.print("Enter a number : ");
            int n = sc.nextInt();

            if(n < 0){
                System.out.println("Negative ");
                
                if(n % 2 == 0){
                    System.out.println("Even");
                }
                else{
                    System.out.println("Odd");
                }
            }
            else if(n > 0){
                System.out.println("Positive odd");
                
                if( n % 2 == 0){
                    System.out.println("Even");
                }
                else{
                    System.out.println("Odd");
                }
            }
            else{
                System.out.println("Zero");
            }
        }
    }    
}
