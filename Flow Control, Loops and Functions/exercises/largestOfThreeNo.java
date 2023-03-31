import java.util.Scanner;

public class largestOfThreeNo {
    
    public static void largestNo(int a , int b , int c){
        if(a > b  && a > c){
            System.out.println(a + " IS THE LARGEST");
        }
        else if(b > a && b > c){
            System.out.println(b + " IS THE LARGEST");
        }
        else{
            System.out.println(c + " IS THE LARGEST");
        }
    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            
            System.out.print("Enter a : ");
            int a = sc.nextInt();
            
            System.out.print("Enter b : ");
            int b = sc.nextInt();
            
            System.out.print("Enter c : ");
            int c = sc.nextInt();

            largestNo(a, b, c);
        }
    }
}
