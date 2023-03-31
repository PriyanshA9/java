import java.util.Scanner;

public class leapYear {
    
    public static void leapyear(int n){
        if(n % 4 == 0 && n % 100 != 0 || n % 400 == 0){
            System.out.println(n + " IS LEAP YEAR");
        }
        else{
            System.out.println(n + " IS NOT A LEAP YEAR");
        }
        
    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            
            System.out.print("Enter a year : ");
            int n = sc.nextInt();

            leapyear(n);
        }
    }
}
