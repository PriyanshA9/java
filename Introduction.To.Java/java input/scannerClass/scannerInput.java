import java.util.Scanner;
public class scannerInput{
    public static void main(String[] args) {
        try(Scanner b = new Scanner(System.in)){
            String s = b.nextLine();
            System.out.println(s);
            int x = b.nextInt();
            System.out.println(x);
            float f = b.nextFloat();
            System.out.println(f);
        }
    }
}