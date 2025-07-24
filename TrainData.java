class TrainData 
{
    public static void main(String[] args) {
        int[] trainNumbers = {12001, 12002, 12627, 12628, 12301, 12302, 11013, 11014, 12533, 12534};
        float[] speeds = {80.5f, 75.0f, 90.5f, 85.4f, 88.3f, 92.0f, 89.6f, 86.7f, 78.8f, 91.9f};
        double[] distances = {210.5, 1500.0, 2000.3, 350.7, 800.2, 600.5, 1234.6, 980.0, 450.9, 999.3};
        char[] classes = {'S', 'A', 'B', 'C', 'G', 'S', 'A', 'B', 'S', 'C'};
        boolean[] isExpress = {true, true, false, true, false, true, true, false, true, false};
        byte[] coaches = {10, 12, 14, 16, 18, 10, 11, 13, 15, 17};
        short[] platformNos = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        long[] ticketNumbers = {10000001L, 10000002L, 10000003L, 10000004L, 10000005L, 10000006L, 10000007L, 10000008L, 10000009L, 10000010L};
        String[] names = {"Rajdhani", "Shatabdi", "Duronto", "Garib Rath", "Jan Shatabdi", "Intercity", "Deccan", "Netravati", "Vivek", "Vande Bharat"};

        System.out.println("Int Array:");
        for (int i = 0; i < trainNumbers.length; i++) {
            System.out.println(trainNumbers[i]);
        }

        System.out.println("\nFloat Array:");
        for (int i = 0; i < speeds.length; i++) {
            System.out.println(speeds[i]);
        }

        System.out.println("\nDouble Array:");
        for (int i = 0; i < distances.length; i++) {
            System.out.println(distances[i]);
        }

        System.out.println("\nChar Array:");
        for (int i = 0; i < classes.length; i++) {
            System.out.println(classes[i]);
        }

        System.out.println("\nBoolean Array:");
        for (int i = 0; i < isExpress.length; i++) {
            System.out.println(isExpress[i]);
        }

        System.out.println("\nByte Array:");
        for (int i = 0; i < coaches.length; i++) {
            System.out.println(coaches[i]);
        }

        System.out.println("\nShort Array:");
        for (int i = 0; i < platformNos.length; i++) {
            System.out.println(platformNos[i]);
        }

        System.out.println("\nLong Array:");
        for (int i = 0; i < ticketNumbers.length; i++) {
            System.out.println(ticketNumbers[i]);
        }

        System.out.println("\nString Array (Train Names):");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
