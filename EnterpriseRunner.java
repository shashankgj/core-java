class EnterpriseRunner
{
    public static void main(String args[])
    {
        Enterprise[] enterprises = new Enterprise[5];

        Enterprise e1 = new Enterprise();
        e1.setName("TechSpark Solutions");
        e1.setAddress("HSR Layout");
        enterprises[0] = e1;

        Enterprise e2 = new Enterprise();
        e2.setName("InnoWave Technologies");
        e2.setAddress("Koramangala");
        enterprises[1] = e2;

        Enterprise e3 = new Enterprise();
        e3.setName("NextGen Labs");
        e3.setAddress("Indiranagar");
        enterprises[2] = e3;

        Enterprise e4 = new Enterprise();
        e4.setName("CodeNest Pvt Ltd");
        e4.setAddress("BTM Layout");
        enterprises[3] = e4;

        Enterprise e5 = new Enterprise();
        e5.setName("SkyNet Systems");
        e5.setAddress("Electronic City");
        enterprises[4] = e5;

        for (int i = 0; i < enterprises.length; i++)
        {
            System.out.println("Enterprise " + (i + 1));
            Enterprise e = enterprises[i];
            System.out.println(e.getName());
            System.out.println(e.getAddress());
            System.out.println();
        }
    }
}
