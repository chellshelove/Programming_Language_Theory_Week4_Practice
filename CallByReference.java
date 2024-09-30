import java.util.ArrayList;

public class CallByReference {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        System.out.println("Before calling modifyList: " + colors);
        modifyList(colors);
        System.out.println("After calling modifyList: " + colors);
    }

    public static void modifyList(ArrayList<String> list) {
        list.add("Yellow");
        System.out.println("Inside modifyList: " + list);
    }
}