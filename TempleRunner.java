class TempleRunner
{
    public static void main(String args[])
    {
        Temple[] temples = new Temple[5];

        Temple t1 = new Temple();
        t1.setName("ISKCON Temple");
        t1.setAddress("Rajajinagar");
        temples[0] = t1;

        Temple t2 = new Temple();
        t2.setName("Banashankari Temple");
        t2.setAddress("Banashankari");
        temples[1] = t2;

        Temple t3 = new Temple();
        t3.setName("Dodda Ganesha Temple");
        t3.setAddress("Basavanagudi");
        temples[2] = t3;

        Temple t4 = new Temple();
        t4.setName("Gavi Gangadhareshwara Temple");
        t4.setAddress("Gavipuram");
        temples[3] = t4;

        Temple t5 = new Temple();
        t5.setName("Bull Temple");
        t5.setAddress("Basavanagudi");
        temples[4] = t5;

        for (int i = 0; i < temples.length; i++)
        {
            System.out.println("Temple " + (i + 1));
            Temple t = temples[i];
            System.out.println(t.getName());
            System.out.println(t.getAddress());
            System.out.println();
        }
    }
}
