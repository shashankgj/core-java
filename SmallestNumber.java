class SmallestNumber
{
 public static void main(String args[])
  {
   int a=12;
   int b=15;
   int c=10;
  
   if(a<b && a<c)
    {
       System.out.println("smallest of 3 numbers "+a);
    }
   else if(b<a && b<c)
    {
       System.out.println("smallest of 3 numbers "+b);
    }
   else
    {
       System.out.println("smallest of 3 numbers "+c);
    }
  }
}