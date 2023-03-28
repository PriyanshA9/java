import java.util.Scanner;

public class logical {
    public static void main(String[] args) {
        
        String user = "geek" , pwd = "GEEK";
        
        try(Scanner sc = new Scanner(System.in)){
        
            //FOR LOGICAL AND (&&)
            
            String iu = sc.next();
            
            String ip = sc.next();
            
            if(user.equals(iu) && pwd.equals(ip)){
                System.out.println("Welcome");
            }
            else{
                System.out.println("Try Again");
            }
            
            //FOR LOGICAL OR (||)
            
            String pr = sc.next();
            
            String po = sc.next();
            
            if(user.equals(pr) || pwd.equals(po)){
                System.out.println("Welcome");
            }
            else{
                System.out.println("Try Again");
            }

            //FOR LOGICAL NOT (!)
            
            if(!((user.equals(pr) || pwd.equals(po)))){
                System.out.println("Welcome");
            }
            else{
                System.out.println("Try Again");
            }

            //CONCEPT OF SHORT CIRCUITING

            String e = sc.next();
            
            if(e != null && e.length() < 100){
                System.out.println("VALID");
            }
            else{
                System.out.println("INVALID");
            }

        }
    }    
}
