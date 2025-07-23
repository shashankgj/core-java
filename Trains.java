class Trains
{
 private String name;
 private int cost;
 private int speed;

 public static int length;
 static
 {
  System.out.println("static block in trains");
  length=100;
 }

 {
  System.out.println("non static block in trains");
  length=200;
 }

 public void setName(String tarinsName)
 {
  name=tarinsName;
 }
 public void setCost(int trainsCost)
 {
  cost=trainsCost;
 }
 public void setSpeed(int trainsSpeed)
 {
  speed=trainsSpeed;
 }
 

 public String getName()
 {
  return name;
 }
 public int getCost()
 {
  return cost;
 }
 public int getSpeed()
 {
  return speed;
 }
 
}