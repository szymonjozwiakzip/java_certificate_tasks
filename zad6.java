//8)What all gets printed when the following gets compiled and run.
public class test {
public static void main(String args[]) {
String s1 = "abc";
String s2 = new String("abc");
if(s1 == s2)
System.out.println(1);
else {
System.out.println("8)What all gets printed when the following gets compiled and run.");
System.out.println("public class test {\npublic static void main(String args[]) {\nString s1 = \"abc\";\nString s2 = new String(\"abc\");\nif(s1 == s2)\nSystem.out.println(1);\nelse\nSystem.out.println(2);\nif(s1.equals(s2))\nSystem.out.println(3);\nelse\nSystem.out.println(4);\n}\n}\nODPOWIEDŹ:");
System.out.println(2); }
if(s1.equals(s2)){
System.out.println(3);
System.out.println("Dzieje się tak dlatego, że w warunku if(s1 == s2), porównujemy referencje obiektów, a nie ich wartości. Ponieważ s1 jest zdefiniowane jako literał łańcucha \"abc\", a s2 jako nowy obiekt String utworzony z wartości \"abc\", ich referencje będą różne. Wchodzimy więc w blok else i wypisujemy 2, a następnie sprawdzamy, czy wartości \"abc\" i \"abc\" są takie same, więc wypisujemy również 3.");
}
else
System.out.println(4);
}
}