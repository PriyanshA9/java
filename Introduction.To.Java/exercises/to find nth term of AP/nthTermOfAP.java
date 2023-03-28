import java.util.Scanner;
public class nthTermOfAP {
    
    public static int Nth_Term(int a , int d, int N){
         
        int n = a + (N-1)*d;

        return n;
    }
    
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)){
            
            System.out.print("Enter the First term : ");
            int a = sc.nextInt();
            
            System.out.print("Enter the progression term : ");
            int d = sc.nextInt();
            
            System.out.print("Enter the Nth term : ");
            int N = sc.nextInt();

            System.out.println("AP OF THE GIVEN EXPRESSION IS : " + Nth_Term(a,d,N));
        }       
    }
}
