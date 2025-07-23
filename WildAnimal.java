class WildAnimal
{
  private String name;
  private int age;

  public WildAnimal()
  {
    System.out.println("No argument constructor/default constructor");
    this.name="Lion";
    this.age=22;
  }

  public void setName(String name)
  {
   this.name=name;     
  }
  public String getName()
  {
   return name;
  }

  public void setAge(int age)
  {
   this.age=age;
  }

  public int getAge()
  {
   return age;
  }
 }
