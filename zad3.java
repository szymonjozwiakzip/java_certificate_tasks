//3)What is the result when this code is executed?
public class Numbers {
    public static void main(String[] args) {
        System.out.println("3)What is the result when this code is executed?\n");
        System.out.println("\npublic class Numbers{\npublic static void main( String[] argv ) { new Three(); }\n}\nclass One {\npublic One() { System.out.print(1); }\n}\nclass Two extends One {\npublic Two() { System.out.print(2); }\n}\nclass Three extends Two {\npublic Three() { System.out.print(3); }\n}\npublic class Numbers{\npublic static void main( String[] argv ) { new Three(); }\n}\nODPOWIEDŹ:");
        new Three();
    }
}
class One {
    public One() { System.out.print(1); }
}

class Two extends One {
    public Two() { System.out.print(2); }
}

class Three extends Two {
    public Three() { System.out.println(3); }
}
