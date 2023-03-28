import java.util.Scanner;

public class booleanAlgebra {
    static void logicOp(boolean a, boolean b){
        /*output (a&&b), (a||b), and ((!a)&&(!b))separated by spaces*/
        System.out.printf("%b"+" "+"%b"+" "+"%b",a&&b,a||b,(!a && !b));
        // int x = 100 ;
        // double y = 100.1;
        // boolean z = (x==y);
        // System.out.println(z);
    }   
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            boolean a = sc.nextBoolean();
            boolean b = sc.nextBoolean();

            logicOp(a,b);
        }
    } 
}
