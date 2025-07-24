class CityData 
{
    public static void main(String[] args) {
        short[] areaCodes = {11, 22, 33, 44, 55, 66, 77, 88, 99, 100};
        float[] temperatures = {30.5f, 32.1f, 35.2f, 28.3f, 31.4f, 29.5f, 33.6f, 34.7f, 27.8f, 36.9f};
        double[] altitudes = {210.5, 320.6, 150.3, 560.7, 430.2, 670.9, 720.4, 800.1, 900.8, 1000.5};
        char[] cityCodes = {'B', 'D', 'H', 'M', 'C', 'N', 'S', 'P', 'A', 'K'};
        boolean[] isMetro = {true, true, false, true, false, true, false, false, true, true};
        byte[] zones = {1, 3, 5, 2, 4, 6, 7, 9, 8, 10};
        int[] pinCodes = {560001, 110001, 400001, 700001, 600001, 380001, 500001, 800001, 302001, 751001};
        long[] populations = {8000000L, 12000000L, 5000000L, 3000000L, 9000000L, 1500000L, 700000L, 2000000L, 4500000L, 6000000L};
        String[] names = {"Bengaluru", "Delhi", "Hyderabad", "Mumbai", "Chennai", "Ahmedabad", "Pune", "Patna", "Jaipur", "Bhubaneswar"};

        System.out.println("Short Array:");
        for (int i = 0; i < areaCodes.length; i++) {
            System.out.println(areaCodes[i]);
        }

        System.out.println("\nFloat Array:");
        for (int i = 0; i < temperatures.length; i++) {
            System.out.println(temperatures[i]);
        }

        System.out.println("\nDouble Array:");
        for (int i = 0; i < altitudes.length; i++) {
            System.out.println(altitudes[i]);
        }

        System.out.println("\nChar Array:");
        for (int i = 0; i < cityCodes.length; i++) {
            System.out.println(cityCodes[i]);
        }

        System.out.println("\nBoolean Array:");
        for (int i = 0; i < isMetro.length; i++) {
            System.out.println(isMetro[i]);
        }

        System.out.println("\nByte Array:");
        for (int i = 0; i < zones.length; i++) {
            System.out.println(zones[i]);
        }

        System.out.println("\nInt Array:");
        for (int i = 0; i < pinCodes.length; i++) {
            System.out.println(pinCodes[i]);
        }

        System.out.println("\nLong Array:");
        for (int i = 0; i < populations.length; i++) {
            System.out.println(populations[i]);
        }

        System.out.println("\nString Array (Indian City Names):");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
