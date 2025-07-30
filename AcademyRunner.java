class AcademyRunner
{
    public static void main(String args[])
    {
        Academy[] academies = new Academy[5];

        Academy a1 = new Academy();
        a1.setName("Vidya Academy");
        a1.setAddress("Rajajinagar");
        academies[0] = a1;

        Academy a2 = new Academy();
        a2.setName("Achievers Academy");
        a2.setAddress("BTM Layout");
        academies[1] = a2;

        Academy a3 = new Academy();
        a3.setName("Bright Minds Academy");
        a3.setAddress("Banashankari");
        academies[2] = a3;

        Academy a4 = new Academy();
        a4.setName("Success Point Academy");
        a4.setAddress("Hebbal");
        academies[3] = a4;

        Academy a5 = new Academy();
        a5.setName("National Talent Academy");
        a5.setAddress("Jayanagar");
        academies[4] = a5;

        for (int i = 0; i < academies.length; i++)
        {
            System.out.println("Academy " + (i + 1));
            Academy a = academies[i];
            System.out.println(a.getName());
            System.out.println(a.getAddress());
            System.out.println();
        }
    }
}
