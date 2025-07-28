class Company {
    static int[] employeeIds = {101, 102, 103};
    static float[] appraisalScores = {9.2f, 7.8f, 8.3f};
    static double[] salaries = {50000.75, 60000.00, 75000.25};
    static char[] grades = {'A', 'B', 'A'};
    static boolean[] isPermanent = {true, false, true};
    static long[] contactNumbers = {9876543210L, 9988776655L, 9123456789L};
    static short[] departmentCodes = {11, 12, 13};
    static byte[] shiftCodes = {1, 2, 1};
    static String[] employeeNames = {"Ajay", "Bhavna", "Chirag"};

    public static int[] getEmployeeIds() {
        return employeeIds;
    }

    public static float[] getAppraisalScores() {
        return appraisalScores;
    }

    public static double[] getSalaries() {
        return salaries;
    }

    public static char[] getGrades() {
        return grades;
    }

    public static boolean[] getIsPermanent() {
        return isPermanent;
    }

    public static long[] getContactNumbers() {
        return contactNumbers;
    }

    public static short[] getDepartmentCodes() {
        return departmentCodes;
    }

    public static byte[] getShiftCodes() {
        return shiftCodes;
    }

    public static String[] getEmployeeNames() {
        return employeeNames;
    }
}
