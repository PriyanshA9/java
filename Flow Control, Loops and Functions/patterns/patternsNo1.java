import java.util.Scanner;

public class patternsNo1 {
    
    public static void patterns(int n){
        int i = 1;
        
        while( i <= n) {

            int j = 1;

            while(j <= i) {
                
                System.out.print("*");
                j++;

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
