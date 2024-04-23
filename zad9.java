//12)What is the result?
public static void test(String str)
{
int check = 4;
if (check = str.length())
{
System.out.print(str.charAt(check -= 1) +", ");
}
else
{
System.out.print(str.charAt(0) + ", ");
}
}
//and the invocation:
test("four");
test("tee");
test("to");
//Compilation fails