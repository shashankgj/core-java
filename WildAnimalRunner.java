class WildAnimalRunner
 {
  public static void main(String args[])
   {
    WildAnimal wildAnimal = new WildAnimal();
    System.out.println(wildAnimal.getName());
    System.out.println(wildAnimal.getAge());
    wildAnimal.setName("Tiger"); 
    String name=wildAnimal.getName();
    System.out.println(name);
    wildAnimal.setAge(33); 
    int age=wildAnimal.getAge();
    System.out.println(age);

   }
  }
