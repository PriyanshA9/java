import java.io.*;

public class javaInputInteger {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Integer");
        int x = Integer.parseInt(br.readLine());
        System.out.println("You Entered "+ x);
    }    
}


