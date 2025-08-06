class University
{
  private String name;
  private int code;
  private String location;
  private int numberOfStudents;
  private String affiliation;

  public University()
  {
  }

  public University(String name, int code)
  {
    System.out.println("Initializing name and code");
    this.name = name;
    this.code = code;
  }

  public University(String name, int code, String location)
  {
    this(name, code);
    System.out.println("Initializing location");
    this.location = location;
  }

  public University(String name, int code, String location, int numberOfStudents)
  {
    this(name, code, location);
    System.out.println("Initializing number of students");
    this.numberOfStudents = numberOfStudents;
  }

  public University(String name, int code, String location, int numberOfStudents, String affiliation)
  {
    this(name, code, location, numberOfStudents);
    System.out.println("Initializing affiliation");
    this.affiliation = affiliation;
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

  public int getNumberOfStudents()
  {
    return numberOfStudents;
  }

  public String getAffiliation()
  {
    return affiliation;
  }
}
