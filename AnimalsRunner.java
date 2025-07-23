class AnimalsRunner
 {
  public static void main(String args[])
   {
    Animals animals = new Animals();
    System.out.println(animals.getName());
    animals.setName("cow"); 
    String name=animals.getName();
    System.out.println(name);
   }
  }
