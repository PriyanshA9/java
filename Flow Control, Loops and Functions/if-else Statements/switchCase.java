import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int x =0 , y = 0;

            char move = sc.next().charAt(0);
            switch(move){
                case 'L':
                    x--;
                    break;
                case 'R':
                    x++;
                    break;
                case 'U':
                    y++;
                    break;
                case 'D':
                    y--;
                    break;
                default:
                    System.out.println("Invalid");
            }
            System.out.println(x);
            System.out.println(y);
        }
    }    
}
