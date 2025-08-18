class CountDigit
{
 public static void main(String args[])
 {
  int num=123;
  int count=0;
  int quotient=num;
  while(quotient>0)
  {
   quotient=quotient/10;
   count=count+1;
  }
  System.out.println("count of number "+count);
}
}