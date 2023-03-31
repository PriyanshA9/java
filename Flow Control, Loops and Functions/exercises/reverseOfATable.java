import java.util.Scanner;

public class reverseOfATable {
    public static void printTable (int n) 
	{
        int multiplier=10;
        while(multiplier>0)
        {
            //Your code here
            System.out.print(n*multiplier + " ");
            multiplier--;
        }
       System.out.println();
	}
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

            System.out.print("Enter a number : ");
            int a = sc.nextInt();

            printTable(a);
        }
    }
}
