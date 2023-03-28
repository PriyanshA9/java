import java.util.Scanner;

public class sumOfNterms {
    
    public static int Sum_Of_Nterms(int N){
        int n = (N * (N+1))/2;

        return n;
    }
    
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

            System.out.print("Enter the Nth term : ");
            int N = sc.nextInt();

            System.out.println(Sum_Of_Nterms(N));
        }
    }
}
