public class Animal {
    private String name;
    private String habitat;
    private int legs;

    public static int lifespan;

    static {
        System.out.println("static block in Animal");
        lifespan = 10;
    }

    {
        System.out.println("non static block in Animal");
        lifespan = 15;
    }

    public void setname(String animalName) {
        name = animalName;
    }

    public void sethabitat(String animalHabitat) {
        habitat = animalHabitat;
    }

    public void setlegs(int animalLegs) {
        legs = animalLegs;
    }

    public String getname() {
        return name;
    }

    public String gethabitat() {
        return habitat;
    }

    public int getlegs() {
        return legs;
    }
}
