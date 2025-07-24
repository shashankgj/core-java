 class DataTypesDemo 
{
    public static void main(String[] args) {
        int[] numberOfStudentsInBatch = {10, 15, 20, 25, 30, 35, 40, 45, 50, 55};
        float[] prices = {10.5f, 20.5f, 30.1f, 40.9f, 50.0f, 60.6f, 70.7f, 80.2f, 90.3f, 100.4f};
        double[] distances = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9, 10.1};
        char[] gradeLetters = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
        boolean[] isActive = {true, false, true, true, false, true, false, false, true, true};
        byte[] byteValues = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        short[] shortValues = {1000, 2000, 1500, 2500, 3000, 3500, 4000, 4500, 5000, 5500};
        long[] population = {10000L, 20000L, 30000L, 40000L, 50000L, 60000L, 70000L, 80000L, 90000L, 100000L};
        String[] names = {"Bharath", "Isha", "Rohan", "Priya", "Kiran", "Sneha", "Arjun", "Anjali", "Rahul", "Divya"};

        System.out.println("Int Array:");
        for (int i = 0; i < numberOfStudentsInBatch.length; i++) {
            System.out.println(numberOfStudentsInBatch[i]);
        }

        System.out.println("\nFloat Array:");
        for (int i = 0; i < prices.length; i++) {
            System.out.println(prices[i]);
        }

        System.out.println("\nDouble Array:");
        for (int i = 0; i < distances.length; i++) {
            System.out.println(distances[i]);
        }

        System.out.println("\nChar Array:");
        for (int i = 0; i < gradeLetters.length; i++) {
            System.out.println(gradeLetters[i]);
        }

        System.out.println("\nBoolean Array:");
        for (int i = 0; i < isActive.length; i++) {
            System.out.println(isActive[i]);
        }

        System.out.println("\nByte Array:");
        for (int i = 0; i < byteValues.length; i++) {
            System.out.println(byteValues[i]);
        }

        System.out.println("\nShort Array:");
        for (int i = 0; i < shortValues.length; i++) {
            System.out.println(shortValues[i]);
        }

        System.out.println("\nLong Array:");
        for (int i = 0; i < population.length; i++) {
            System.out.println(population[i]);
        }

        System.out.println("\nString Array (Indian Names):");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
