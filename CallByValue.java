public class CallByValue {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        System.out.println("Before calling swap: x = " + x + ", y = " + y);
        swap(x, y);
        System.out.println("After calling swap: x = " + x + ", y = " + y);
    }

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Inside swap: a = " + a + ", b = " + b);
    }
}