public class nonPrimitive {
    int x;
    int y;    
}
class Test{
    public static void main(String[] args) {
        nonPrimitive p1 = new nonPrimitive();
        p1.x = 30;
        p1.y = 40;
        System.out.println(p1.x);/*p1 is reference to the class non_primitive 
        data members x and y*/ 
        System.out.println(p1.y);
    }
}
