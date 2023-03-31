import java.util.Scanner;

public class tableDifference{
    
    public static void tablediff(int n1 , int n2){
        int x;
        if(n1 > n2){
            x = n1 - n2;
        }
        else{
            x = n2 - n1;
        }
        for(int i = 1 ; i <= 10 ; i++){
            System.out.print(x*i + " ");
        }    
    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

            System.out.print("Enter a number : ");
            int a = sc.nextInt();
            
            System.out.print("Enter a number : ");
            int b = sc.nextInt();

            tablediff(a,b);
        }
    }
}