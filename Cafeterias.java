class Cafeterias
{
  private String name;
  private int regNumber;
  private String location;
  private int seatingCapacity;
  private String cuisine;

  public Cafeterias()
  {
  }

  public Cafeterias(String name, int regNumber)
  {
    System.out.println("Initializing name and regNumber");
    this.name = name;
    this.regNumber = regNumber;
  }

  public Cafeterias(String name, int regNumber, String location)
  {
    this(name, regNumber);
    System.out.println("Initializing location");
    this.location = location;
  }

  public Cafeterias(String name, int regNumber, String location, int seatingCapacity)
  {
    this(name, regNumber, location);
    System.out.println("Initializing seating capacity");
    this.seatingCapacity = seatingCapacity;
  }

  public Cafeterias(String name, int regNumber, String location, int seatingCapacity, String cuisine)
  {
    this(name, regNumber, location, seatingCapacity);
    System.out.println("Initializing cuisine");
    this.cuisine = cuisine;
  }

  public String getName() { return name; }
  public int getRegNumber() { return regNumber; }
  public String getLocation() { return location; }
  public int getSeatingCapacity() { return seatingCapacity; }
  public String getCuisine() { return cuisine; }
}
