class NameRunner
 {
  public static void main(String args[])
   {
    Name name = new Name();
    System.out.println(name.getFName());
    name.setFName("abc"); 
    String fName=name.getFName();
    }
}