class CopyingArray 
{
    public static void main(String args[])
    {
        int[] ages = new int[4];
        System.out.println("before copying to another");
        for (int i = 0; i < ages.length; i++)
        {
            ages[i] = 20 * i;
            System.out.println(ages[i]);
        }
        int[] copyAges = new int[ages.length];
        System.out.println(" after copying to another");
        for (int i = 0; i < ages.length; i++)
        {
            copyAges[i] = ages[i];
            System.out.println(copyAges[i]);
        }

        float[] salaries = new float[4];
        System.out.println("before copying to another");
        for (int i = 0; i < salaries.length; i++)
        {
            salaries[i] = 1000.5f * (i + 1);
            System.out.println(salaries[i]);
        }
        float[] copySalaries = new float[salaries.length];
        System.out.println("after copying to another");
        for (int i = 0; i < salaries.length; i++)
        {
            copySalaries[i] = salaries[i];
            System.out.println(copySalaries[i]);
        }

        double[] bonuses = new double[4];
        System.out.println("before copying to another");
        for (int i = 0; i < bonuses.length; i++)
        {
            bonuses[i] = 2500.75 * (i + 1);
            System.out.println(bonuses[i]);
        }
        double[] copyBonuses = new double[bonuses.length];
        System.out.println("after copying to another");
        for (int i = 0; i < bonuses.length; i++)
        {
            copyBonuses[i] = bonuses[i];
            System.out.println(copyBonuses[i]);
        }

        char[] grades = new char[4];
        System.out.println("before copying to another");
        for (int i = 0; i < grades.length; i++)
        {
            grades[i] = (char) ('A' + i);
            System.out.println(grades[i]);
        }
        char[] copyGrades = new char[grades.length];
        System.out.println("after copying to another");
        for (int i = 0; i < grades.length; i++)
        {
            copyGrades[i] = grades[i];
            System.out.println(copyGrades[i]);
        }

        boolean[] status = new boolean[4];
        System.out.println("before copying to another");
        for (int i = 0; i < status.length; i++)
        {
            status[i] = (i % 2 == 0);
            System.out.println(status[i]);
        }
        boolean[] copyStatus = new boolean[status.length];
        System.out.println("after copying to another");
        for (int i = 0; i < status.length; i++)
        {
            copyStatus[i] = status[i];
            System.out.println(copyStatus[i]);
        }

        byte[] levels = new byte[4];
        System.out.println("before copying to another");
        for (int i = 0; i < levels.length; i++)
        {
            levels[i] = (byte) (10 + i);
            System.out.println(levels[i]);
        }
        byte[] copyLevels = new byte[levels.length];
        System.out.println("after copying to another");
        for (int i = 0; i < levels.length; i++)
        {
            copyLevels[i] = levels[i];
            System.out.println(copyLevels[i]);
        }

        short[] codes = new short[4];
        System.out.println("before copying to another");
        for (int i = 0; i < codes.length; i++)
        {
            codes[i] = (short) (100 + i);
            System.out.println(codes[i]);
        }
        short[] copyCodes = new short[codes.length];
        System.out.println("after copying to another");
        for (int i = 0; i < codes.length; i++)
        {
            copyCodes[i] = codes[i];
            System.out.println(copyCodes[i]);
        }

        long[] phones = new long[4];
        System.out.println("before copying to another");
        for (int i = 0; i < phones.length; i++)
        {
            phones[i] = 9000000000L + i;
            System.out.println(phones[i]);
        }
        long[] copyPhones = new long[phones.length];
        System.out.println("after copying to another");
        for (int i = 0; i < phones.length; i++)
        {
            copyPhones[i] = phones[i];
            System.out.println(copyPhones[i]);
        }

        String[] names = new String[4];
        System.out.println("before copying to another");
        for (int i = 0; i < names.length; i++)
        {
            names[i] = "sam" + (i + 1);
            System.out.println(names[i]);
        }
        String[] copyNames = new String[names.length];
        System.out.println("after copying to another");
        for (int i = 0; i < names.length; i++)
        {
            copyNames[i] = names[i];
            System.out.println(copyNames[i]);
        }
    }
}
