//15)What is the result?
public class Main {
    public static void main(String[] args) {
        try {
            test();
            System.out.print("end ");
        } catch (Exception ex) {
            System.out.print("exception ");
        }
    }

    static void test() throws Error {
        if (true) throw new AssertionError();
        System.out.print("test ");
    }
}
//A Throwable is thrown by main