class Type
{
  public static void main(String args[])
   {
      addition();
      addition(10,20);
      substraction();
      substraction(200,100);
      multiplication();
      multiplication(10,20);
      division();
      division(200,20);
   }
public static void addition()
{
  System.out.println("without arguments");
  int a=500;
  int b=300;
  int c=a+b;
  System.out.println(c);

public static void addition(int a,int b)
{
  System.out.println("with arguments");
  int c=a+b;
  System.out.println(c);
}
public static void substraction()
{
  System.out.println("without arguments");
  int a=500;
  int b=300;
  int c=a-b;
  System.out.println(c);
}

public static void substraction(int a,int b)
{
  System.out.println("with arguments");
  int c=a-b;
  System.out.println(c);
}

public static void multiplication()
{
  System.out.println("without arguments");
  int a=500;
  int b=300;
  int c=a*b;
  System.out.println(c);
}

public static void multiplication(int a,int b)
{
  System.out.println("with arguments");
  int c=a*b;
  System.out.println(c);
}

public static void division()
{
  System.out.println("without arguments");
  double a=500;
  double b=150;
  double c= a/b;
  System.out.println(c);
}

public static void division(int a,int b)
{
  System.out.println("with arguments");
  int c=a/b;
  System.out.println(c);
}

}