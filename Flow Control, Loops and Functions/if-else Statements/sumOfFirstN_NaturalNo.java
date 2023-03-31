import java.util.Scanner;
public class sumOfFirstN_NaturalNo {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            
            System.out.print("Enter a Natural Number : ");
            int n = sc.nextInt();
            
            if(n <= 0){
                System.out.println("Number should not be Negative or zero");
                return;
            }
            int N = (n * (n+1))/2;
            System.out.println("THE SUM OF FIRST " + n + " NATURAL NUMBERS IS : " + N);
        }
    }    
}
