//13)How many String objects will be created when this method is invoked?
public class MyClass {
    public static String makinStrings() {
        String s = "Fred";
        s = s + "47";
        s = s.substring(2, 5);
        s = s.toUpperCase();
        return s.toString();
    }

    public static void main(String[] args) {
        System.out.println(makinStrings());
        System.out.println("5 napisów");
    }
}
