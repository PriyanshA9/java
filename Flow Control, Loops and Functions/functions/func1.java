public class func1 {
    
    public static void fun(){

        System.out.println("Inside Fun()");

    }
    
    public static void main(String[] args) {
        System.out.println("Before call");

        fun();

        fun();

        System.out.println("After call");
    }    
}
