import java.util.Scanner;
public class daysBeforeNdays {
    
    public static void daysBeforeNDays(int d , int n){
        int x = n % 7;
        int ans = d - x;
        if(ans >= 0){
            System.out.print(ans);
        }
        else{
            System.out.print(ans + 7);
        }
    }
    
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the Day's Index : ");
            int d = sc.nextInt();
            
            System.out.print("Enter the Day you want to go before it : ");
            int n = sc.nextInt();

            daysBeforeNDays(d, n);
        }
    }
}
