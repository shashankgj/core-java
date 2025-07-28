class RestaurantRunner {
    public static void main(String[] args) {
        String[] chefNames = Restaurant.getChefNames();
        for (int i = 0; i < chefNames.length; i++) {
            System.out.println(chefNames[i]);
        }

        int[] tableNumbers = Restaurant.getTableNumbers();
        for (int i = 0; i < tableNumbers.length; i++) {
            System.out.println(tableNumbers[i]);
        }

        float[] dishRatings = Restaurant.getDishRatings();
        for (int i = 0; i < dishRatings.length; i++) {
            System.out.println(dishRatings[i]);
        }

        double[] billAmounts = Restaurant.getBillAmounts();
        for (int i = 0; i < billAmounts.length; i++) {
            System.out.println(billAmounts[i]);
        }

        char[] categories = Restaurant.getCategories();
        for (int i = 0; i < categories.length; i++) {
            System.out.println(categories[i]);
        }

        boolean[] isTableAvailable = Restaurant.getIsTableAvailable();
        for (int i = 0; i < isTableAvailable.length; i++) {
            System.out.println(isTableAvailable[i]);
        }

        long[] orderIds = Restaurant.getOrderIds();
        for (int i = 0; i < orderIds.length; i++) {
            System.out.println(orderIds[i]);
        }

        short[] kitchenSections = Restaurant.getKitchenSections();
        for (int i = 0; i < kitchenSections.length; i++) {
            System.out.println(kitchenSections[i]);
        }

        byte[] waitersShift = Restaurant.getWaitersShift();
        for (int i = 0; i < waitersShift.length; i++) {
            System.out.println(waitersShift[i]);
        }
    }
}
