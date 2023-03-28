public class swap {
    
    public static void swapNumber(int a , int b){
        int temp;
        temp = a;
        a = b;
        b = temp;
        
        System.out.println("Vaue of a : "+a);
        System.out.println("Vaue of b : "+b);
        
    }
    
    public static void main(String[] args) {
        
        int a = 10, b = 20 ;
        
        System.out.println("Vaue of a : "+a);
        System.out.println("Vaue of b : "+b);
        
        swapNumber(a, b);
    }
}