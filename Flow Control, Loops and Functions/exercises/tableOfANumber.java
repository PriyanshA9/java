import java.util.Scanner;

public class tableOfANumber {
    
    public static void tableofnumber(int n , int m) {
         
        for(int i = 1 ; i <= m ; i++) {

            System.out.println(n + " X " + i + " = " + n*i);

        }
    }
    
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)){
            
            System.out.print("Enter the Number for its table : ");
            int n = sc.nextInt();
            
            System.out.print("Upto which number you want the table : ");
            int m = sc.nextInt();
            
            tableofnumber(n,m);

        }
    }
}
