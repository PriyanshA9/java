import java.util.Scanner;

public class patternNo5 {
     public static void patterns(int n){
        int i = 1;
        
        while( i <= n) {

            int j = n;

            while(j >= 1) {
                
                System.out.print(i);
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
