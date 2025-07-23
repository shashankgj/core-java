public class Strdata {
{
  static String name="MT 15";
  static String company="Yamaha";
  static float price=217000;
  static String colour="Black";
  static float milage=45;
 public static void main(String args[])
   {
   String Name=nameofBike();
   String Company=nameofCompany();
   float Price=priceofBike();
   String Colour=colourofBike();
   float Milage=milageofBike();

   System.out.println(Name);
   System.out.println(Company);
   System.out.println(Price);
   System.out.println(Colour);
   System.out.println(Milage);

    
   }  

 public static String nameofBike()
  {
    return name;
  }

public static String nameofCompany()
  {
    return company;
  }

public static String priceofBike()
  {
    return price;
  }

public static String colourofBike()
  {
    return colour;
  }

public static String milageofBike()
  {
    return milage;
  }
}

 
}
