class Records
{
  private String name;
  private int libraryId;
  private String location;
  private int numberOfBooks;
  private String category;

  public Records()
  {
  }

  public Records(String name, int libraryId)
  {
    System.out.println("Initializing name and libraryId");
    this.name = name;
    this.libraryId = libraryId;
  }

  public Records(String name, int libraryId, String location)
  {
    this(name, libraryId);
    System.out.println("Initializing location");
    this.location = location;
  }

  public Records(String name, int libraryId, String location, int numberOfBooks)
  {
    this(name, libraryId, location);
    System.out.println("Initializing number of books");
    this.numberOfBooks = numberOfBooks;
  }

  public Records(String name, int libraryId, String location, int numberOfBooks, String category)
  {
    this(name, libraryId, location, numberOfBooks);
    System.out.println("Initializing category");
    this.category = category;
  }

  public String getName() { return name; }
  public int getLibraryId() { return libraryId; }
  public String getLocation() { return location; }
  public int getNumberOfBooks() { return numberOfBooks; }
  public String getCategory() { return category; }
}

