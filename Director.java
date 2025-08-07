class Director 
{
    private String name;
    private float salary;
    private String location;

    public Director(String name, float salary, String location) {
        this.name = name;
        this.salary = salary;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public float getSalary() {
        return salary;
    }

    public String getLocation() {
        return location;
    }
}
