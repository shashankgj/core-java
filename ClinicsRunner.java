
class ClinicsRunner
{
  public static void main(String args[])
  {
    Clinics clinic1 = new Clinics("Apollo Clinic", 301);
    System.out.println(clinic1.getName());
    System.out.println(clinic1.getCode());
    System.out.println("----------------");

    Clinics clinic2 = new Clinics("Fortis Clinic", 302, "Delhi");
    System.out.println(clinic2.getName());
    System.out.println(clinic2.getCode());
    System.out.println(clinic2.getLocation());
    System.out.println("----------------");

    Clinics clinic3 = new Clinics("Narayana Clinic", 303, "Bangalore", 25);
    System.out.println(clinic3.getName());
    System.out.println(clinic3.getCode());
    System.out.println(clinic3.getLocation());
    System.out.println(clinic3.getNumberOfDoctors());
    System.out.println("----------------");

    Clinics clinic4 = new Clinics("AIIMS Clinic", 304, "Bhopal", 40, "Government");
    System.out.println(clinic4.getName());
    System.out.println(clinic4.getCode());
    System.out.println(clinic4.getLocation());
    System.out.println(clinic4.getNumberOfDoctors());
    System.out.println(clinic4.getType());
    System.out.println("----------------");

    Clinics clinic5 = new Clinics("Manipal Clinic", 305, "Udupi", 30, "Private");
    System.out.println(clinic5.getName());
    System.out.println(clinic5.getCode());
    System.out.println(clinic5.getLocation());
    System.out.println(clinic5.getNumberOfDoctors());
    System.out.println(clinic5.getType());
  }
}
