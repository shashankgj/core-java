class StadiumRunner
{
    public static void main(String args[])
    {
        Stadium[] stadiums = new Stadium[5];

        Stadium s1 = new Stadium();
        s1.setName("Chinnaswamy Stadium");
        s1.setAddress("Cubbon Road");
        stadiums[0] = s1;

        Stadium s2 = new Stadium();
        s2.setName("Kanteerava Stadium");
        s2.setAddress("Sampangirama Nagar");
        stadiums[1] = s2;

        Stadium s3 = new Stadium();
        s3.setName("BBMP Stadium");
        s3.setAddress("Kormangala");
        stadiums[2] = s3;

        Stadium s4 = new Stadium();
        s4.setName("Padukone-Dravid Centre");
        s4.setAddress("JP Nagar");
        stadiums[3] = s4;

        Stadium s5 = new Stadium();
        s5.setName("Namma Stadium");
        s5.setAddress("Yelahanka");
        stadiums[4] = s5;

        for (int i = 0; i < stadiums.length; i++)
        {
            System.out.println("Stadium " + (i + 1));
            Stadium s = stadiums[i];
            System.out.println(s.getName());
            System.out.println(s.getAddress());
            System.out.println();
        }
    }
}
