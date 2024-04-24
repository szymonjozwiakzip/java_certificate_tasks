public class Main {
    static void test() throws RuntimeException {
        try {
            System.out.println("What is the result? ");
            System.out.println("static void test() throws RuntimeException\n{\ntry\n{\nSystem.out.print(\"test \");\nthrow new RuntimeException();\n}\ncatch (Exception ex)\n{\nSystem.out.print(\"exception \");\n}\n}\npublic static void main(String[] args)\n{\ntry\n{\ntest();\n}\ncatch (RuntimeException ex)\n{\nSystem.out.print(\"runtime \");\n}\nSystem.out.print(\"end \");\n}");
            System.out.print("test ");
            throw new RuntimeException();
        } catch (Exception ex) {
            System.out.print("exception ");
        }
    }

    public static void main(String[] args) {
        try {
            test();
        } catch (RuntimeException ex) {
            System.out.print("runtime ");
        }
        System.out.print("end \n");
        System.out.print("Najpierw wywołujemy test, robimy try, w którym wypisuje test, występuje throw RuntimeException, który jest catchowany w test i wypisuje się exception. Następnie kończymy main wypisujac end");
    }
}
