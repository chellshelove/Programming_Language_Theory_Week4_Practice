public class VisibilityRules {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        if (a > b) {
            int c = 30;
            int d = 40;
            System.out.println("Inside if: c = " + c + ", d = " + d);
        }

    }
}