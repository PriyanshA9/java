import java.util.Scanner;

public class firstDigit {
    
    public static int firstdigit(int n) {

        double power = Math.log10(n);

        int p = (int)power;

        int a = (int)Math.pow(10,p);

        int x = n/a;

        return x;

    }
    
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

            System.out.print("Enter a number : ");
            int n = sc.nextInt();

            System.out.println("THE FIRST DIGIT OF " + n + " IS : " + firstdigit(n));
        }
    }
}
