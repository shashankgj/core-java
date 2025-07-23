class TrainsRunner
 {
  static 
  {
   System.out.println("static block in TrainsRunner");
  }

  public static void main(String args[])
  {
   //System.out.println(Trains.length);
   Trains trains= new Trains();
   System.out.println(Trains.length);
   trains.setName("Rajadani");
   System.out.println(trains.getName());
   System.out.println(Trains.length);
   System.out.println(trains.getCost());


   System.out.println("------------------------");
   Trains trains1=new Trains();
   System.out.println(trains1.length);
   System.out.println(trains1.getName());

   trains.length=300;
   System.out.println(trains.length);
   System.out.println(trains1.length);


  }
 }