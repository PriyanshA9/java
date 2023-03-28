public class floatPoint {
    static void printInFormat(float a, float b){
        float result = a/b;
        
        
        // Your code here to print upto 3 decimal places
        System.out.print(result + " ");

        System.out.format("%.3f",result);
    }
    public static void main(String[] args) {
        float x = 5.43f;
        float y = 2.653f;
        printInFormat(x,y);
    }
}
