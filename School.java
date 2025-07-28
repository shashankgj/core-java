class School
 {
    static int[] studentCounts = {100, 120, 150, 200};
    static float[] avgGrades = {8.5f, 7.2f, 9.1f};
    static double[] fees = {25000.50, 30000.75, 27500.25};
    static char[] sections = {'A', 'B', 'C'};
    static boolean[] isSectionActive = {true, false, true};
    static long[] staffIds = {101001L, 101002L, 101003L};
    static short[] labRoomNumbers = {201, 202, 203};
    static byte[] morningBatches = {1, 2, 3};
    static String[] teacherNames = {"Meena", "Ravi", "Kiran"};

    public static int[] getStudentCounts()
    {
        return studentCounts;
    }

    public static float[] getAvgGrades() 
    {
        return avgGrades;
    }

    public static double[] getFees()
    {
        return fees;
    }

    public static char[] getSections() 
    {
        return sections;
    }

    public static boolean[] getIsSectionActive() 
    {
        return isSectionActive;
    }

    public static long[] getStaffIds() 
    {
        return staffIds;
    }

    public static short[] getLabRoomNumbers() 
    {
        return labRoomNumbers;
    }

    public static byte[] getMorningBatches() 
    {
        return morningBatches;
    }

    public static String[] getTeacherNames() 
    {
        return teacherNames;
    }
}
