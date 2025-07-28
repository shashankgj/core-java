class Restaurant {
    static int[] tableNumbers = {1, 2, 3, 4};
    static float[] dishRatings = {4.5f, 3.8f, 4.2f};
    static double[] billAmounts = {450.75, 780.50, 630.25};
    static char[] categories = {'V', 'N', 'D'}; // V=Veg, N=Non-Veg, D=Drinks
    static boolean[] isTableAvailable = {true, false, true};
    static long[] orderIds = {1001L, 1002L, 1003L};
    static short[] kitchenSections = {1, 2, 3};
    static byte[] waitersShift = {1, 2, 1};
    static String[] chefNames = {"Hari", "Sunil", "Radha"};

    public static int[] getTableNumbers() {
        return tableNumbers;
    }

    public static float[] getDishRatings() {
        return dishRatings;
    }

    public static double[] getBillAmounts() {
        return billAmounts;
    }

    public static char[] getCategories() {
        return categories;
    }

    public static boolean[] getIsTableAvailable() {
        return isTableAvailable;
    }

    public static long[] getOrderIds() {
        return orderIds;
    }

    public static short[] getKitchenSections() {
        return kitchenSections;
    }

    public static byte[] getWaitersShift() {
        return waitersShift;
    }

    public static String[] getChefNames() {
        return chefNames;
    }
}
