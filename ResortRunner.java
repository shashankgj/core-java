class ResortRunner
{
    public static void main(String args[])
    {
        Resort[] resorts = new Resort[5];

        Resort r1 = new Resort();
        r1.setName("Palm Meadows Resort");
        r1.setAddress("Whitefield");
        resorts[0] = r1;

        Resort r2 = new Resort();
        r2.setName("Our Native Village");
        r2.setAddress("Hesaraghatta");
        resorts[1] = r2;

        Resort r3 = new Resort();
        r3.setName("Golden Palms Resort");
        r3.setAddress("Tumkur Road");
        resorts[2] = r3;

        Resort r4 = new Resort();
        r4.setName("Eagle Ridge Resort");
        r4.setAddress("Begur");
        resorts[3] = r4;

        Resort r5 = new Resort();
        r5.setName("Guhantara Cave Resort");
        r5.setAddress("Kanakapura Road");
        resorts[4] = r5;

        for (int i = 0; i < resorts.length; i++)
        {
            System.out.println("Resort " + (i + 1));
            Resort r = resorts[i];
            System.out.println(r.getName());
            System.out.println(r.getAddress());
            System.out.println();
        }
    }
}
