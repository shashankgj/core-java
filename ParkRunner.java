class ParkRunner
{
    public static void main(String args[])
    {
        Park[] parks = new Park[5];

        Park p1 = new Park();
        p1.setName("Lalbagh");
        p1.setAddress("Jayanagar");
        parks[0] = p1;

        Park p2 = new Park();
        p2.setName("Cubbon Park");
        p2.setAddress("Kasturba Road");
        parks[1] = p2;

        Park p3 = new Park();
        p3.setName("JP Park");
        p3.setAddress("Mathikere");
        parks[2] = p3;

        Park p4 = new Park();
        p4.setName("Hebbal Lake Park");
        p4.setAddress("Hebbal");
        parks[3] = p4;

        Park p5 = new Park();
        p5.setName("Banerghatta Butterfly Park");
        p5.setAddress("Bannerghatta");
        parks[4] = p5;

        for (int i = 0; i < parks.length; i++)
        {
            System.out.println("Park " + (i + 1));
            Park p = parks[i];
            System.out.println(p.getName());
            System.out.println(p.getAddress());
            System.out.println();
        }
    }
}
