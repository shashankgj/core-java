class ProductData 
{
    public static void main(String[] args) {
        int[] productIds = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        float[] weights = {0.5f, 1.0f, 1.5f, 2.0f, 0.75f, 1.25f, 1.75f, 2.25f, 2.5f, 3.0f};
        double[] prices = {10.5, 20.0, 30.25, 40.75, 15.99, 22.89, 35.50, 48.60, 50.10, 60.90};
        char[] quality = {'A', 'B', 'A', 'B', 'C', 'A', 'B', 'C', 'A', 'B'};
        boolean[] isAvailable = {true, false, true, true, false, true, false, true, true, false};
        byte[] ratings = {5, 4, 3, 4, 5, 5, 3, 4, 2, 1};
        short[] barcodes = {1111, 2222, 3333, 4444, 5555, 6666, 7777, 8888, 9999, 1000};
        long[] stockNumbers = {5001L, 5002L, 5003L, 5004L, 5005L, 5006L, 5007L, 5008L, 5009L, 5010L};
        String[] names = {"Dalda", "Colgate", "Parle-G", "Maggi", "Amul", "Tata Salt", "Aashirvaad", "Clinic Plus", "Bournvita", "Boost"};

        System.out.println("Int Array:");
        for (int i = 0; i < productIds.length; i++) {
            System.out.println(productIds[i]);
        }

        System.out.println("\nFloat Array:");
        for (int i = 0; i < weights.length; i++) {
            System.out.println(weights[i]);
        }

        System.out.println("\nDouble Array:");
        for (int i = 0; i < prices.length; i++) {
            System.out.println(prices[i]);
        }

        System.out.println("\nChar Array:");
        for (int i = 0; i < quality.length; i++) {
            System.out.println(quality[i]);
        }

        System.out.println("\nBoolean Array:");
        for (int i = 0; i < isAvailable.length; i++) {
            System.out.println(isAvailable[i]);
        }

        System.out.println("\nByte Array:");
        for (int i = 0; i < ratings.length; i++) {
            System.out.println(ratings[i]);
        }

        System.out.println("\nShort Array:");
        for (int i = 0; i < barcodes.length; i++) {
            System.out.println(barcodes[i]);
        }

        System.out.println("\nLong Array:");
        for (int i = 0; i < stockNumbers.length; i++) {
            System.out.println(stockNumbers[i]);
        }

        System.out.println("\nString Array (Product Names):");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
