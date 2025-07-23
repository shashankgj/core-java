class Statloc
{
  static int a;
  static float b=21;
  static String name="xyz";
  static char s='R';
  static double value=2.064546;
  
  public static void main(String args[])
   {
     int a=99;
     float b=18;
     String name="QRS";
     char s='A';
     double value=8.76856;
     Statloc.integer();
     System.out.println(a);
     Statloc.floating();   
     System.out.println(b);
     Statloc.strings();
     System.out.println(name);
     Statloc.characters();
     System.out.println(s);
     Statloc.decimals();
     System.out.println(value);
   }
 
  public static void integer()
   {
     System.out.println("Integer varlue: "+a);
   } 
  public static void floating()
   {
     System.out.println("Floting value: "+b);
   } 
  public static void strings()
   {
     System.out.println("String value: "+name);
   } 
  public static void characters()
   {
     System.out.println("Character value: "+s);
   } 
  public static void decimals()
   {
     System.out.println("Double value: "+value);
   } 
}

  