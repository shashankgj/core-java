public class AnimalRunner 
{
   static 
    {
        System.out.println("static block in AnimalRunner");
    }

    public static void main(String[] args) {
        Animal a1 = new Animal();
        a1.setname("Elephant");
        a1.sethabitat("Forest");
        a1.setlegs(4);
        System.out.println(a1.getname());
        System.out.println(a1.gethabitat());
        System.out.println(a1.getlegs());
        System.out.println(Animal.lifespan);

        Animal a2 = new Animal();
        a2.setname("Shark");
        a2.sethabitat("Ocean");
        a2.setlegs(0);
        System.out.println(a2.getname());
        System.out.println(a2.gethabitat());
        System.out.println(a2.getlegs());
        System.out.println(Animal.lifespan);

        Animal a3 = new Animal();
        a3.setname("Kangaroo");
        a3.sethabitat("Grassland");
        a3.setlegs(2);
        System.out.println(a3.getname());
        System.out.println(a3.gethabitat());
        System.out.println(a3.getlegs());
        System.out.println(Animal.lifespan);

        Animal a4 = new Animal();
        a4.setname("Penguin");
        a4.sethabitat("Polar");
        a4.setlegs(2);
        System.out.println(a4.getname());
        System.out.println(a4.gethabitat());
        System.out.println(a4.getlegs());
        System.out.println(Animal.lifespan);

        Animal a5 = new Animal();
        a5.setname("Crocodile");
        a5.sethabitat("Swamp");
        a5.setlegs(4);
        System.out.println(a5.getname());
        System.out.println(a5.gethabitat());
        System.out.println(a5.getlegs());
        System.out.println(Animal.lifespan);

        Animal a6 = new Animal();
        a6.setname("Eagle");
        a6.sethabitat("Mountains");
        a6.setlegs(2);
        System.out.println(a6.getname());
        System.out.println(a6.gethabitat());
        System.out.println(a6.getlegs());
        System.out.println(Animal.lifespan);

        Animal a7 = new Animal();
        a7.setname("Snake");
        a7.sethabitat("Desert");
        a7.setlegs(0);
        System.out.println(a7.getname());
        System.out.println(a7.gethabitat());
        System.out.println(a7.getlegs());
        System.out.println(Animal.lifespan);

        Animal a8 = new Animal();
        a8.setname("Frog");
        a8.sethabitat("Pond");
        a8.setlegs(4);
        System.out.println(a8.getname());
        System.out.println(a8.gethabitat());
        System.out.println(a8.getlegs());
        System.out.println(Animal.lifespan);

        Animal a9 = new Animal();
        a9.setname("Dog");
        a9.sethabitat("Domestic");
        a9.setlegs(4);
        System.out.println(a9.getname());
        System.out.println(a9.gethabitat());
        System.out.println(a9.getlegs());
        System.out.println(Animal.lifespan);

        Animal a10 = new Animal();
        a10.setname("Octopus");
        a10.sethabitat("Sea");
        a10.setlegs(8);
        System.out.println(a10.getname());
        System.out.println(a10.gethabitat());
        System.out.println(a10.getlegs());
        System.out.println(a10.lifespan);
    }
}
