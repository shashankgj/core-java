class SchoolData
 {
    public static void main(String[] args) {
        int[] classes = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        float[] fees = {15000.5f, 16000.0f, 17000.3f, 18000.2f, 19000.1f, 20000.0f, 21000.9f, 22000.8f, 23000.7f, 24000.6f};
        double[] passPercent = {88.5, 90.2, 92.1, 85.6, 91.0, 89.3, 87.4, 93.2, 90.8, 88.9};
        char[] sections = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
        boolean[] isCBSE = {true, true, false, true, true, false, true, false, false, true};
        byte[] floors = {1, 2, 3, 1, 2, 3, 1, 2, 3, 4};
        short[] roomCounts = {20, 25, 30, 22, 28, 26, 24, 23, 27, 29};
        long[] schoolIds = {10101L, 10202L, 10303L, 10404L, 10505L, 10606L, 10707L, 10808L, 10909L, 11010L};
        String[] names = {"National", "Kendriya", "Vidyodaya", "Delhi Public", "Jain", "Bishop", "NPS", "Sophia", "Baldwin", "Oxford"};

        System.out.println("Int Array:");
        for (int i = 0; i < classes.length; i++) {
            System.out.println(classes[i]);
        }

        System.out.println("\nFloat Array:");
        for (int i = 0; i < fees.length; i++) {
            System.out.println(fees[i]);
        }

        System.out.println("\nDouble Array:");
        for (int i = 0; i < passPercent.length; i++) {
            System.out.println(passPercent[i]);
        }

        System.out.println("\nChar Array:");
        for (int i = 0; i < sections.length; i++) {
            System.out.println(sections[i]);
        }

        System.out.println("\nBoolean Array:");
        for (int i = 0; i < isCBSE.length; i++) {
            System.out.println(isCBSE[i]);
        }

        System.out.println("\nByte Array:");
        for (int i = 0; i < floors.length; i++) {
            System.out.println(floors[i]);
        }

        System.out.println("\nShort Array:");
        for (int i = 0; i < roomCounts.length; i++) {
            System.out.println(roomCounts[i]);
        }

        System.out.println("\nLong Array:");
        for (int i = 0; i < schoolIds.length; i++) {
            System.out.println(schoolIds[i]);
        }

        System.out.println("\nString Array (School Names):");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
