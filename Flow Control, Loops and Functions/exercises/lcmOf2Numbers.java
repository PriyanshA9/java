import java.util.Scanner;

public class lcmOf2Numbers {
    
    public static void LCM(int x , int y) {

        int a = Math.max(x,y);
        
        int b  = x * y;

        int ans = x;

        for(int i = a ; i <= b ; i++) {

            if(i % x == 0 && i % y == 0) {

                ans = i;
                break;

            }

        }

        System.out.println("THE LCM OF " + x + " AND " + y + " IS : " + ans);

    }
    
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

            System.out.print("Enter a number : ");
            int n = sc.nextInt();

            System.out.print("Enter another number : ");
            int m = sc.nextInt();

            LCM(n,m);

        }
    }    
}
