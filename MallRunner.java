class MallRunner
{
    public static void main(String args[])
    {
        Mall[] malls = new Mall[5];

        Mall m1 = new Mall();
        m1.setName("Orion Mall");
        m1.setAddress("Rajajinagar");
        malls[0] = m1;

        Mall m2 = new Mall();
        m2.setName("Phoenix Marketcity");
        m2.setAddress("Whitefield");
        malls[1] = m2;

        Mall m3 = new Mall();
        m3.setName("Garuda Mall");
        m3.setAddress("Magrath Road");
        malls[2] = m3;

        Mall m4 = new Mall();
        m4.setName("Mantri Square");
        m4.setAddress("Malleshwaram");
        malls[3] = m4;

        Mall m5 = new Mall();
        m5.setName("Forum Mall");
        m5.setAddress("Koramangala");
        malls[4] = m5;

        for (int i = 0; i < malls.length; i++)
        {
            System.out.println("Mall " + (i + 1));
            Mall m = malls[i];
            System.out.println(m.getName());
            System.out.println(m.getAddress());
            System.out.println();
        }
    }
}
