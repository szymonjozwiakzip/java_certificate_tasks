//11)Which exception or error should be thrown by the virtual machine?

public class ClassA {
    public void count(int i) {
        count(++i);
    }

    public static void main(String[] args) {
        ClassA a = new ClassA();
        a.count(3);
    }
}
//StackOverflowError