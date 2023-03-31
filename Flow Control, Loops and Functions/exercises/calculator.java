import java.util.Scanner;

public class calculator {
    
    public static void calc(int a , int b ,int s){
        
        switch(s){
            case 1:
                int c = a + b;
                System.out.println("THE SUM OF TWO NUMBERS IS : " + c);
                break;
            
            case 2:
                int d = a - b;
                System.out.println("THE SUBTRACTION OF TWO NUMBERS IS : " + d);
                break;
            
            case 3:
                int e = a * b;
                System.out.println("THE MULTIPLICATION OF TWO NUMBERS IS : " + e);
                break;
            
            default:
                System.out.println("Ivalid choice");
        }
        
    }
    
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a number : ");
            int a = sc.nextInt();

            System.out.print("Enter another number : ");
            int b = sc.nextInt();

            System.out.print("1.add\n2.sub\n3.multiply\nEnter the method : ");
            int s = sc.nextInt();
            
            calc(a, b, s);

            sc.close();
        }
}

