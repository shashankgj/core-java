class Clinics
{
  private String name;
  private int code;
  private String location;
  private int numberOfDoctors;
  private String type;

  public Clinics()
  {
  }

  public Clinics(String name, int code)
  {
    System.out.println("Initializing name and code");
    this.name = name;
    this.code = code;
  }

  public Clinics(String name, int code, String location)
  {
    this(name, code);
    System.out.println("Initializing location");
    this.location = location;
  }

  public Clinics(String name, int code, String location, int numberOfDoctors)
  {
    this(name, code, location);
    System.out.println("Initializing number of doctors");
    this.numberOfDoctors = numberOfDoctors;
  }

  public Clinics(String name, int code, String location, int numberOfDoctors, String type)
  {
    this(name, code, location, numberOfDoctors);
    System.out.println("Initializing type");
    this.type = type;
  }

  public String getName()
  {
    return name;
  }

  public int getCode()
  {
    return code;
  }

  public String getLocation()
  {
    return location;
  }

  public int getNumberOfDoctors()
  {
    return numberOfDoctors;
  }

  public String getType()
  {
    return type;
  }
}
