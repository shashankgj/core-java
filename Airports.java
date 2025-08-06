class Airports
{
  private String name;
  private int code;
  private String city;
  private int terminals;
  private String type;

  public Airports()
  {
  }

  public Airports(String name, int code)
  {
    System.out.println("Initializing name and code");
    this.name = name;
    this.code = code;
  }

  public Airports(String name, int code, String city)
  {
    this(name, code);
    System.out.println("Initializing city");
    this.city = city;
  }

  public Airports(String name, int code, String city, int terminals)
  {
    this(name, code, city);
    System.out.println("Initializing terminals");
    this.terminals = terminals;
  }

  public Airports(String name, int code, String city, int terminals, String type)
  {
    this(name, code, city, terminals);
    System.out.println("Initializing type");
    this.type = type;
  }

  public String getName() { return name; }
  public int getCode() { return code; }
  public String getCity() { return city; }
  public int getTerminals() { return terminals; }
  public String getType() { return type; }
}
