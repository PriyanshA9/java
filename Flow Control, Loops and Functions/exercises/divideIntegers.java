import java.util.Scanner;

public class divideIntegers {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            for(int i = 0 ; i < 5 ; i++){
            
                System.out.print("Enter x : ");    
                int x = sc.nextInt();
                
                System.out.print("Enter y : ");
                int y = sc.nextInt();
                
                if (y == 0) {
                
                    continue;
                
                }
                
                System.out.println(x/y);
                
                if(i != 4){
                    System.out.println("--------Next pair--------");
                }
            
            }
        }
    }
}
