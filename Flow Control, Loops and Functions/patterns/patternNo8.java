import java.util.Scanner;

public class patternNo8 {
     public static void patterns(int n){
        int i = 1;
        
        while( i <= n) {

            int j = 1;
            
            int  v = i;

            while(j <= i) {
                
                System.out.print(v);
                j++;
                v++;

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
