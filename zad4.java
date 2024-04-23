//4) What is the result?
public class TestB extends TestA
{
public void start()
{
    System.out.println("4) What is the result?");
     System.out.println("public class TestB extends TestA\n{\npublic void start()\n{\nSystem.out.println(\"TestB\");\n}\npublic static void main(String[] args)\n{\n((TestA)new TestB()).start();\n}\n}\nODPOWIEDŹ:");
System.out.println("TestB");
System.out.println("Jest to przykład polimorfizmu w Javie, gdzie wywołanie metody dla obiektu klasy podrzędnej (w tym przypadku TestB) spowoduje wykonanie implementacji tej metody z klasy podrzędnej, jeśli została ona nadpisana.");
}
public static void main(String[] args)
{
((TestA)new TestB()).start();
}
}
class TestA
{
public void start()
{
System.out.println("TestA");
}
}
