
class CafeteriasRunner
{
  public static void main(String args[])
  {
    Cafeterias cafe1 = new Cafeterias("Paradise Cafe", 601);
    System.out.println(cafe1.getName());
    System.out.println(cafe1.getRegNumber());
    System.out.println("----------------");

    Cafeterias cafe2 = new Cafeterias("Nandhana Cafe", 602, "Bangalore");
    System.out.println(cafe2.getName());
    System.out.println(cafe2.getRegNumber());
    System.out.println(cafe2.getLocation());
    System.out.println("----------------");

    Cafeterias cafe3 = new Cafeterias("Meghana Cafe", 603, "Hyderabad", 120);
    System.out.println(cafe3.getName());
    System.out.println(cafe3.getRegNumber());
    System.out.println(cafe3.getLocation());
    System.out.println(cafe3.getSeatingCapacity());
    System.out.println("----------------");

    Cafeterias cafe4 = new Cafeterias("BBQ Cafe", 604, "Chennai", 150, "Buffet");
    System.out.println(cafe4.getName());
    System.out.println(cafe4.getRegNumber());
    System.out.println(cafe4.getLocation());
    System.out.println(cafe4.getSeatingCapacity());
    System.out.println(cafe4.getCuisine());
    System.out.println("----------------");

    Cafeterias cafe5 = new Cafeterias("Empire Cafe", 605, "Mysore", 80, "South Indian");
    System.out.println(cafe5.getName());
    System.out.println(cafe5.getRegNumber());
    System.out.println(cafe5.getLocation());
    System.out.println(cafe5.getSeatingCapacity());
    System.out.println(cafe5.getCuisine());
  }
}
