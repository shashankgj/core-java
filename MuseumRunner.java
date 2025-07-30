class MuseumRunner
{
    public static void main(String args[])
    {
        Museum[] museums = new Museum[5];

        Museum m1 = new Museum();
        m1.setName("Visvesvaraya Museum");
        m1.setAddress("Cubbon Park");
        museums[0] = m1;

        Museum m2 = new Museum();
        m2.setName("HAL Aerospace Museum");
        m2.setAddress("Old Airport Road");
        museums[1] = m2;

        Museum m3 = new Museum();
        m3.setName("Government Museum");
        m3.setAddress("Kasturba Road");
        museums[2] = m3;

        Museum m4 = new Museum();
        m4.setName("Natural History Museum");
        m4.setAddress("Shivajinagar");
        museums[3] = m4;

        Museum m5 = new Museum();
        m5.setName("Folk Art Museum");
        m5.setAddress("Jayanagar");
        museums[4] = m5;

        for (int i = 0; i < museums.length; i++)
        {
            System.out.println("Museum " + (i + 1));
            Museum m = museums[i];
            System.out.println(m.getName());
            System.out.println(m.getAddress());
            System.out.println();
        }
    }
}
