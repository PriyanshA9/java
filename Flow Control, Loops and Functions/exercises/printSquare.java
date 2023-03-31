import java.util.Scanner;

public class printSquare {
    
    public static void printsquare(int s){

        int i = 1;

        while(i <= s) {

            int j = 1 ;
            
            while(j <= s) {
                if(i == 1 || i == s || j == 1 || j == s){
                    System.out.print("* ");
                    j++;
                }    
                else{
                    System.out.print("  ");
                    j++;
                }
                
            }
            System.out.println("");
            i++;
        }
        
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

            System.out.print("Enter a number : ");
            int a = sc.nextInt();

            printsquare(a);
        }
    }
}
