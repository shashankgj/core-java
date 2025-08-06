class RecordsRunner
{
  public static void main(String args[])
  {
    Records record1 = new Records("City Records", 401);
    System.out.println(record1.getName());
    System.out.println(record1.getLibraryId());
    System.out.println("----------------");

    Records record2 = new Records("State Records", 402, "Hubli");
    System.out.println(record2.getName());
    System.out.println(record2.getLibraryId());
    System.out.println(record2.getLocation());
    System.out.println("----------------");

    Records record3 = new Records("Public Records", 403, "Mysore", 20000);
    System.out.println(record3.getName());
    System.out.println(record3.getLibraryId());
    System.out.println(record3.getLocation());
    System.out.println(record3.getNumberOfBooks());
    System.out.println("----------------");

    Records record4 = new Records("British Records", 404, "Bangalore", 50000, "Historic");
    System.out.println(record4.getName());
    System.out.println(record4.getLibraryId());
    System.out.println(record4.getLocation());
    System.out.println(record4.getNumberOfBooks());
    System.out.println(record4.getCategory());
    System.out.println("----------------");

    Records record5 = new Records("Digital Records", 405, "Chennai", 10000, "Digital");
    System.out.println(record5.getName());
    System.out.println(record5.getLibraryId());
    System.out.println(record5.getLocation());
    System.out.println(record5.getNumberOfBooks());
    System.out.println(record5.getCategory());
  }
}
