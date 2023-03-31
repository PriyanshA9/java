import java.util.Scanner;

public class patterNo2 {
     public static void patterns(int n){
        int i = 1;
        
        while( i <= n) {

            int j = n;

            while(j >= i) {
                
                System.out.print("*");
                j--;

            }

            System.out.println("");
            i++;

        }
    }
    
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

            System.out.print("Enter the number of rows : ");
            int n = sc.nextInt();

            patterns(n);

        }
    }
}
