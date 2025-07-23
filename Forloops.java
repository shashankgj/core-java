class Forloops
{
 public static void main(String args[])
  {
   System.out.println("FOR LOOP ");
   for (int i=0;i<=100;i++)
      {
        if(i%2 == 0)
        {
          System.out.println("EVEN NUMBERS: "+i);
        }
        else if(i%2 == 1)
        {
          System.out.println("ODD NUMBERS: "+i);
        }
        if(i%3 == 0)
        {
          System.out.println("DIVISIBLE BY 3 "+i);
        }
        if(i%5 == 0)
        {
          System.out.println("DIVISIBLE BY 5 "+i);
        }
        else
        {
          System.out.println("natural numbers");

        }

      }
   }
 }
