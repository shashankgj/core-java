class CafeteriaRunner
{
    public static void main(String args[])
    {
        Cafeteria[] cafeterias = new Cafeteria[5];

        Cafeteria c1 = new Cafeteria();
        c1.setName("Cafe Delight");
        c1.setAddress("Koramangala");
        cafeterias[0] = c1;

        Cafeteria c2 = new Cafeteria();
        c2.setName("Urban Brew");
        c2.setAddress("Church Street");
        cafeterias[1] = c2;

        Cafeteria c3 = new Cafeteria();
        c3.setName("Bean Town");
        c3.setAddress("Indiranagar");
        cafeterias[2] = c3;

        Cafeteria c4 = new Cafeteria();
        c4.setName("The Daily Cup");
        c4.setAddress("JP Nagar");
        cafeterias[3] = c4;

        Cafeteria c5 = new Cafeteria();
        c5.setName("Café Mosaic");
        c5.setAddress("Marathahalli");
        cafeterias[4] = c5;

        for (int i = 0; i < cafeterias.length; i++)
        {
            System.out.println("Cafeteria " + (i + 1));
            Cafeteria c = cafeterias[i];
            System.out.println(c.getName());
            System.out.println(c.getAddress());
            System.out.println();
        }
    }
}
