public class DynamicScope {
    static String topping;

    public static void pizza() {
        System.out.println("Pizza with " + topping);
    }

    public static void func1() {
        topping = "Mushroom";
        pizza();
    }

    public static void func2() {
        topping = "Onion";
        pizza();
    }

    public static void func3() {
        topping = "Capsicum";
        pizza();
    }

    public static void main(String[] args) {
        func1();
        func2();
        func3();
    }
}