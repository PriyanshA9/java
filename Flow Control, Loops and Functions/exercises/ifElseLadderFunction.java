import java.util.Scanner;

public class ifElseLadderFunction {
    
    static void isDivisibleByPrime (int n) 
	 {
        
        if(n % 11 == 0){
            System.out.print("Eleven");
        }
             
        else if(n % 3 == 0){
            System.out.print("Three");
        }
             
        else if(n % 2 == 0){
            System.out.print("Two");
        }
         
        else{
            System.out.print("-1");
        }
       
        System.out.println();
	}
    
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

            System.out.print("Enter a Number : ");
            int a = sc.nextInt();

            isDivisibleByPrime(a);
        }
    }
}
