//2) What gets displayed on the screen when the following program is compiled and run. Select the one correct answer.
public class test
{
public static void main(String args[])
{
boolean x = true;
int a;
if(x) a = x ? 1: 2;
else a = x ? 3: 4;
System.out.println("2) What gets displayed on the screen when the following program is compiled and run. Select the one correct answer.");
System.out.println("public class test\n{\npublic static void main(String args[])\n{\nboolean x = true;\nint a;\nif(x) a = x ? 1: 2;\nelse a = x ? 3: 4;\nSystem.out.println(a);\n}\n}\nODPOWIEDŹ:");
System.out.println(a);
System.out.println("Wartosc a wynosi 1, ponieważ ze względu na to, że a jest zdefiniowane, a x przyjmuje wartość true - wchodzimy więc w pierwszego ifa i wartość true");
}
}