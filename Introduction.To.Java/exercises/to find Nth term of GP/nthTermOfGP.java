import java.util.Scanner;
public class nthTermOfGP {
    public static int Nth_Term_GP(int a , int r , int N){

        int n = a*(int)(Math.pow(r, N-1));

        return n;
    }    
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter First Term : ");
            int a = sc.nextInt();
            
            System.out.print("Enter Common Ratio : ");
            int r = sc.nextInt();
            
            System.out.print("Enter Nth Term : ");
            int N = sc.nextInt();

            System.out.println("GP OF THIS EXPRESSION IS : " + Nth_Term_GP(a,r,N));
        }
    }
}
