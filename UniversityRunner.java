class UniversityRunner
{
  public static void main(String args[])
  {
    University uni1 = new University("IIT Bombay", 1001);
    System.out.println(uni1.getName());
    System.out.println(uni1.getCode());
    System.out.println("----------------");

    University uni2 = new University("NIT Trichy", 1002, "Tamil Nadu");
    System.out.println(uni2.getName());
    System.out.println(uni2.getCode());
    System.out.println(uni2.getLocation());
    System.out.println("----------------");

    University uni3 = new University("BITS Pilani", 1003, "Rajasthan", 8000);
    System.out.println(uni3.getName());
    System.out.println(uni3.getCode());
    System.out.println(uni3.getLocation());
    System.out.println(uni3.getNumberOfStudents());
    System.out.println("----------------");

    University uni4 = new University("JNU", 1004, "Delhi", 12000, "UGC");
    System.out.println(uni4.getName());
    System.out.println(uni4.getCode());
    System.out.println(uni4.getLocation());
    System.out.println(uni4.getNumberOfStudents());
    System.out.println(uni4.getAffiliation());
    System.out.println("----------------");

    University uni5 = new University("Amrita Vishwa Vidyapeetham", 1005, "Coimbatore", 10000, "Private");
    System.out.println(uni5.getName());
    System.out.println(uni5.getCode());
    System.out.println(uni5.getLocation());
    System.out.println(uni5.getNumberOfStudents());
    System.out.println(uni5.getAffiliation());
  }
}
