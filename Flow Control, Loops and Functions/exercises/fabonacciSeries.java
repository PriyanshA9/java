import java.util.Scanner;

public class fabonacciSeries {
    
    public static void fibonacci(int n) {

        if(n == 0) {
            System.out.println(0);
        }

        else if(n == 1) {
            System.out.println(1);
        }

        else{
            int a = 0 , b = 1;

            System.out.print(a + " ");
            System.out.print(b + " ");
            
            for(int i = 2 ; i < n ; i++){

                int temp = a + b;

                System.out.print(temp + " ");

                a = b ;
                
                b = temp;

            }

        }

    }
    
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

            System.out.print("Enter a the no of series : ");
            int a = sc.nextInt();

            fibonacci(a);
        }
    }
}
