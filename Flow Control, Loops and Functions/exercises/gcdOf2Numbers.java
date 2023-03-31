import java.util.Scanner;

public class gcdOf2Numbers{
    
    public static void GCD(int x , int y) {

        int a = x , b = y;
        while(x != y) {

            if(x > y) {

                x -= y;

            }
            else{

                y -= x;

            }
        }
        System.out.println("THE GCD OF " + a + " AND " + b + " IS : " + x);
    }
    
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

            System.out.print("Enter a number : ");
            int n = sc.nextInt();
            
            System.out.print("Enter a number : ");
            int m = sc.nextInt();

            GCD(n, m);

        }
    }
}