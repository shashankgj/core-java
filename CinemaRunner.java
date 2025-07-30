class CinemaRunner
{
    public static void main(String args[])
    {
        Cinema[] cinemas = new Cinema[5];

        Cinema c1 = new Cinema();
        c1.setName("PVR Cinemas");
        c1.setAddress("Forum Mall");
        cinemas[0] = c1;

        Cinema c2 = new Cinema();
        c2.setName("INOX");
        c2.setAddress("Garuda Mall");
        cinemas[1] = c2;

        Cinema c3 = new Cinema();
        c3.setName("Cinepolis");
        c3.setAddress("Royal Meenakshi Mall");
        cinemas[2] = c3;

        Cinema c4 = new Cinema();
        c4.setName("Urvashi Theatre");
        c4.setAddress("Lalbagh Road");
        cinemas[3] = c4;

        Cinema c5 = new Cinema();
        c5.setName("Gopalan Cinemas");
        c5.setAddress("Banashankari");
        cinemas[4] = c5;

        for (int i = 0; i < cinemas.length; i++)
        {
            System.out.println("Cinema " + (i + 1));
            Cinema c = cinemas[i];
            System.out.println(c.getName());
            System.out.println(c.getAddress());
            System.out.println();
        }
    }
}
