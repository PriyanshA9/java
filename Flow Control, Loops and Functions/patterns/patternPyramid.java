import java.util.Scanner;

public class patternPyramid {
     public static void patterns(int n){
        int i = 1;
        
        while( i <= n) {

            int k = 1;

            while( k <= n - i ) {

                System.out.print("  ");
                k++;

            }
            
            int j = 1;

            while(j <= (2 * i - 1)) {
                
                System.out.print("* ");
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
