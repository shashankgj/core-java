class CorporationDirectorRunner {
    public static void main(String[] args) {
        Corporation corp1 = new Corporation("Reliance Corp", 1122334455L, "Mumbai");
        System.out.println("Printing corporation details:");
        System.out.println(corp1.getName());
        System.out.println(corp1.getHeadquarters());

        Director director = new Director("Mukesh Mehta", 150000.0f, "Mumbai");
        corp1.setDirector(director);

        Director fetchedDirector = corp1.getDirector();
        System.out.println("Printing director details:");
        System.out.println(fetchedDirector.getName());
        System.out.println(fetchedDirector.getLocation());
        System.out.println(fetchedDirector.getSalary());
    }
}
