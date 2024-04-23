//7)What all gets printed when the following program is compiled and run. Select the one correct answer.
public class test
{
public static void main(String args[])
{
int i=0, j=2;
do
{
i=++i;
j--;
}
while(j>0);
System.out.println("7)What all gets printed when the following program is compiled and run. Select the one correct answer.");
System.out.println("public class test\n{\npublic static void main(String args[])\n{\nint i=0, j=2;\ndo\n{\ni=++i;\nj--;\n}\nwhile(j>0);\nSystem.out.println(i);\n}\n}\nODPOWIEDŹ:");
System.out.println(i);
System.out.println("Dzieje się tak ponieważ pętla while wykonuje się dopóki j > 0, czyli dwa razy.")
}
}
