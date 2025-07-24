class MobileData 
{
    public static void main(String[] args) {
        int[] modelNumbers = {101, 102, 103, 104, 105, 106, 107, 108, 109, 110};
        float[] prices = {12999.5f, 14999.0f, 9999.9f, 18999.1f, 20999.4f, 22999.6f, 25999.0f, 27999.2f, 14999.8f, 11999.3f};
        double[] batteryCapacity = {4000.0, 4500.0, 5000.0, 6000.0, 5500.0, 4700.0, 5200.0, 5800.0, 4900.0, 4300.0};
        char[] grades = {'A', 'B', 'A', 'C', 'B', 'A', 'C', 'A', 'B', 'A'};
        boolean[] is5G = {true, false, false, true, true, false, true, true, false, true};
        byte[] warranty = {1, 2, 1, 2, 1, 1, 2, 2, 1, 2};
        short[] screenSize = {61, 65, 64, 68, 62, 63, 66, 67, 60, 69};
        long[] serialNumbers = {1010001L, 1010002L, 1010003L, 1010004L, 1010005L, 1010006L, 1010007L, 1010008L, 1010009L, 1010010L};
        String[] names = {"Realme", "Samsung", "Redmi", "Poco", "Vivo", "Oppo", "Lava", "Micromax", "Nokia", "Infinix"};

        System.out.println("Int Array:");
        for (int i = 0; i < modelNumbers.length; i++) {
            System.out.println(modelNumbers[i]);
        }

        System.out.println("\nFloat Array:");
        for (int i = 0; i < prices.length; i++) {
            System.out.println(prices[i]);
        }

        System.out.println("\nDouble Array:");
        for (int i = 0; i < batteryCapacity.length; i++) {
            System.out.println(batteryCapacity[i]);
        }

        System.out.println("\nChar Array:");
        for (int i = 0; i < grades.length; i++) {
            System.out.println(grades[i]);
        }

        System.out.println("\nBoolean Array:");
        for (int i = 0; i < is5G.length; i++) {
            System.out.println(is5G[i]);
        }

        System.out.println("\nByte Array:");
        for (int i = 0; i < warranty.length; i++) {
            System.out.println(warranty[i]);
        }

        System.out.println("\nShort Array:");
        for (int i = 0; i < screenSize.length; i++) {
            System.out.println(screenSize[i]);
        }

        System.out.println("\nLong Array:");
        for (int i = 0; i < serialNumbers.length; i++) {
            System.out.println(serialNumbers[i]);
        }

        System.out.println("\nString Array (Mobile Brand Names):");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
