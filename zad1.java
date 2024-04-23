//1)What gets printed on the standard output when the class below is compiled and executed. Select the one correct answer.

public class ShortCkt {
    public static void main(String args[]) {
        int i = 0;
        boolean t = true;
        boolean f = false, b;
        b = (t | ((i++) == 0));
        b = (f | ((i+=2) > 0));
        System.out.println("1)What gets printed on the standard output when the class below is compiled and executed. Select the one correct answer.");
        System.out.println("public class ShortCkt\n{\npublic static void main(String args[])\n{\nint i = 0;\nboolean t = true;\nboolean f = false, b;\nb = (t | ((i++) == 0));\nb = (f | ((i+=2) > 0));\nSystem.out.println(i);\n}\nODPOWIEDŹ:");
        System.out.println(i);
        System.out.println("Wartosc i wynosi 3. W pierwszym wyrażeniu b = (t | ((i++) == 0)), operator | wykonuje operację logicznego OR, więc drugie wyrażenie nie jest ewaluowane ze względu na krótkie obliczenia (short-circuit evaluation). Jednakże operator | powoduje ewaluację wyrażenia i++, zwiększając wartość i o 1, więc po pierwszym wyrażeniu wartość i wynosi 1. W drugim wyrażeniu b = (f | ((i+=2) > 0)), operator | ponownie wykonuje operację logicznego OR, ale tym razem pierwsze wyrażenie jest fałszywe, więc następuje ewaluacja drugiego wyrażenia. Wyrażenie i+=2 zwiększa wartość i o 2, więc po drugim wyrażeniu wartość i wynosi 3. ");
    }
}
