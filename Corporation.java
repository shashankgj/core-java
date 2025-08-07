class Corporation {
    private String name;
    private long licenseNumber;
    private String headquarters;
    private int staffCount;
    private Director director;

    public Corporation() {
    }

    public Corporation(String name, long licenseNumber) {
        System.out.println("Initializing name and license number");
        this.name = name;
        this.licenseNumber = licenseNumber;
    }

    public Corporation(String name, long licenseNumber, String headquarters) {
        this(name, licenseNumber);
        System.out.println("Initializing headquarters");
        this.headquarters = headquarters;
    }

    public Corporation(String name, long licenseNumber, String headquarters, int staffCount) {
        this(name, licenseNumber, headquarters);
        System.out.println("Initializing staff count");
        this.staffCount = staffCount;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public Director getDirector() {
        return director;
    }

    public String getName() {
        return name;
    }

    public long getLicenseNumber() {
        return licenseNumber;
    }

    public String getHeadquarters() {
        return headquarters;
    }

    public int getStaffCount() {
        return staffCount;
    }
}
