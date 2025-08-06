
class AirportsRunner
{
  public static void main(String args[])
  {
    Airports airport1 = new Airports("Kempegowda", 501);
    System.out.println(airport1.getName());
    System.out.println(airport1.getCode());
    System.out.println("----------------");

    Airports airport2 = new Airports("Rajiv Gandhi", 502, "Hyderabad");
    System.out.println(airport2.getName());
    System.out.println(airport2.getCode());
    System.out.println(airport2.getCity());
    System.out.println("----------------");

    Airports airport3 = new Airports("Indira Gandhi", 503, "Delhi", 3);
    System.out.println(airport3.getName());
    System.out.println(airport3.getCode());
    System.out.println(airport3.getCity());
    System.out.println(airport3.getTerminals());
    System.out.println("----------------");

    Airports airport4 = new Airports("Chhatrapati Shivaji", 504, "Mumbai", 4, "International");
    System.out.println(airport4.getName());
    System.out.println(airport4.getCode());
    System.out.println(airport4.getCity());
    System.out.println(airport4.getTerminals());
    System.out.println(airport4.getType());
    System.out.println("----------------");

    Airports airport5 = new Airports("Mangalore Airport", 505, "Mangalore", 2, "Domestic");
    System.out.println(airport5.getName());
    System.out.println(airport5.getCode());
    System.out.println(airport5.getCity());
    System.out.println(airport5.getTerminals());
    System.out.println(airport5.getType());
  }
}
