class Bank {
    static int[] branchCodes = {101, 102, 103};
    static float[] interestRates = {3.5f, 4.0f, 4.5f};
    static double[] loanAmounts = {250000.50, 300000.75, 150000.00};
    static char[] ratingGrades = {'A', 'B', 'C'};
    static boolean[] isActiveBranches = {true, true, false};
    static long[] accountNumbers = {1234567890L, 9876543210L, 1122334455L};
    static short[] floorNumbers = {1, 2, 3};
    static byte[] atmCodes = {1, 2, 3};
    static String[] managerNames = {"Suresh", "Rita", "Anil"};

    public static int[] getBranchCodes() {
        return branchCodes;
    }

    public static float[] getInterestRates() {
        return interestRates;
    }

    public static double[] getLoanAmounts() {
        return loanAmounts;
    }

    public static char[] getRatingGrades() {
        return ratingGrades;
    }

    public static boolean[] getIsActiveBranches() {
        return isActiveBranches;
    }

    public static long[] getAccountNumbers() {
        return accountNumbers;
    }

    public static short[] getFloorNumbers() {
        return floorNumbers;
    }

    public static byte[] getAtmCodes() {
        return atmCodes;
    }

    public static String[] getManagerNames() {
        return managerNames;
    }
}
