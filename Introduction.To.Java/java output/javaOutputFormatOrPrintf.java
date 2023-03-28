public class javaOutputFormatOrPrintf {
    public static void main(String[] args)
    { 
       int x = 100, y = 200;
       
       System.out.format("Value of x is %d\n", x);
       
       float z = (float)Math.PI;
       
       System.out.println(y);
       
       System.out.format("Value of PI = %.2f\n", z);//.2f means it will print upto 2 decimal values
       System.out.format("Value of PI = %5.2f\n", z);//5.2f means total 5 characters should be there ,if not fill with the spaces       System.out.format("Value of PI = %05.2f\n", z);
       
       System.out.printf("x = %d, y = %d", x, y);
       
    } 
}
