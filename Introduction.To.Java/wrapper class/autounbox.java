public class autounbox{
    public static void main(String[] args) {
        int x1 = 10;
        Integer x2 = x1; // Interger is a wrapper class auto boxing
        int x3 = x2; // auto unboxing
        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);
    }
}