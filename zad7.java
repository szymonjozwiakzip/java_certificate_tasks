public class Task {
    public static void main(String[] args) {
        Integer i = new Integer(1) + new Integer(2);
        switch(i) {
            case 3: {
                System.out.println("10)What is the result?");
                System.out.println("public static void main(String[] args) {\nInteger i = new Integer(1) + new Integer(2);\nswitch(i) {\ncase 3: System.out.println(\"three\"); break;\ndefault: System.out.println(\"other\"); break;\n}\n}");
                System.out.println("three");
                break;
            }
            default:
                System.out.println("other");
                break;
        }
    }
}
