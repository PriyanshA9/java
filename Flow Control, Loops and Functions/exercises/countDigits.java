import java.util.Scanner;
public class countDigits {
    
    public static void countdigits(int n) {
        int c = 0;

        int temp = n;

        while(temp != 0) {
            
            if(temp % 10 != 0) {
                c++;
            }

            temp = temp / 10;

        }

        System.out.println("THE NUMBER OF DIGITS IN " + n + " IS : " + c);
    
    }
    
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            
            System.out.print("Enter the number : ");
            int n = sc.nextInt();

            countdigits(n);

        }
    }
}
