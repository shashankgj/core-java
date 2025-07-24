class HospitalData 
{
    public static void main(String[] args) {
        int[] bedCounts = {50, 75, 100, 120, 60, 90, 110, 85, 95, 70};
        float[] charges = {250.5f, 300.0f, 450.3f, 390.7f, 500.8f, 420.6f, 380.9f, 470.1f, 310.2f, 299.9f};
        double[] oxygenLevels = {95.1, 96.2, 97.0, 98.3, 94.5, 96.6, 97.7, 98.8, 95.9, 93.4};
        char[] ratings = {'A', 'B', 'A', 'C', 'B', 'A', 'C', 'A', 'B', 'A'};
        boolean[] isGovt = {true, false, true, true, false, true, false, false, true, true};
        byte[] floors = {1, 2, 3, 4, 5, 1, 2, 3, 4, 5};
        short[] wardCodes = {101, 102, 103, 104, 105, 106, 107, 108, 109, 110};
        long[] registrations = {10001L, 10002L, 10003L, 10004L, 10005L, 10006L, 10007L, 10008L, 10009L, 10010L};
        String[] names = {"Apollo", "Fortis", "AIIMS", "Narayana", "Max", "KIMS", "Manipal", "Global", "Rainbow", "Columbia"};

        System.out.println("Int Array:");
        for (int i = 0; i < bedCounts.length; i++) {
            System.out.println(bedCounts[i]);
        }

        System.out.println("\nFloat Array:");
        for (int i = 0; i < charges.length; i++) {
            System.out.println(charges[i]);
        }

        System.out.println("\nDouble Array:");
        for (int i = 0; i < oxygenLevels.length; i++) {
            System.out.println(oxygenLevels[i]);
        }

        System.out.println("\nChar Array:");
        for (int i = 0; i < ratings.length; i++) {
            System.out.println(ratings[i]);
        }

        System.out.println("\nBoolean Array:");
        for (int i = 0; i < isGovt.length; i++) {
            System.out.println(isGovt[i]);
        }

        System.out.println("\nByte Array:");
        for (int i = 0; i < floors.length; i++) {
            System.out.println(floors[i]);
        }

        System.out.println("\nShort Array:");
        for (int i = 0; i < wardCodes.length; i++) {
            System.out.println(wardCodes[i]);
        }

        System.out.println("\nLong Array:");
        for (int i = 0; i < registrations.length; i++) {
            System.out.println(registrations[i]);
        }

        System.out.println("\nString Array (Hospital Names):");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
