import java.util.Scanner;
public class inputOutput {
    // Function to take input using Scanner class
    static void IOFunction(){
        try(Scanner sc = new Scanner(System.in)){
                
                // Your code here
                int a = sc.nextInt();
                System.out.println(a);
                
                
                float b = sc.nextFloat();
                System.out.println(b);
                
                long c = sc.nextLong();
                System.out.println(c);
                
                
                byte d = sc.nextByte();
                System.out.println(d);
                
                // sc.nextLine();

                // String s = sc.nextLine();
                // System.out.println(s);

                String s = sc.next();
                System.out.print(s);

                s = sc.nextLine();
                System.out.println(s);
            }
    }
    public static void main(String[] args) {
        IOFunction();
    }
}
