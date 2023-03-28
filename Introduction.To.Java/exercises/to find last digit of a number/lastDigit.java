import java.util.Scanner;
public class lastDigit {

    public static int lastdigit(int N){
        int x = Math.abs(N);
        
        int n = x % 10;

        return n;
    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

            System.out.print("Enter a number : ");
            int N = sc.nextInt();

            System.out.println("THE LAST DIGIT OF A NUMBER : " + lastdigit(N));
        }
    }    
}
