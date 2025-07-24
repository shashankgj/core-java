class EmployeeData 
{
    public static void main(String[] args) {
        int[] employeeIds = {101, 102, 103, 104, 105, 106, 107, 108, 109, 110};
        float[] salaries = {25000.5f, 30000.5f, 35000.1f, 40000.9f, 45000.0f, 50000.6f, 55000.7f, 60000.2f, 65000.3f, 70000.4f};
        double[] incentives = {500.1, 600.2, 700.3, 800.4, 900.5, 1000.6, 1100.7, 1200.8, 1300.9, 1400.1};
        char[] grades = {'A', 'B', 'A', 'C', 'B', 'A', 'D', 'E', 'A', 'C'};
        boolean[] isPermanent = {true, false, true, true, false, true, false, false, true, true};
        byte[] levels = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        short[] deptCodes = {100, 200, 150, 250, 300, 350, 400, 450, 500, 550};
        long[] pfNumbers = {1234567890L, 2234567890L, 3234567890L, 4234567890L, 5234567890L, 6234567890L, 7234567890L, 8234567890L, 9234567890L, 1023456789L};
        String[] names = {"Vikram", "Radhika", "Anil", "Sangeeta", "Manoj", "Deepa", "Rajeev", "Sunita", "Ajay", "Kavita"};

        System.out.println("Int Array:");
        for (int i = 0; i < employeeIds.length; i++) {
            System.out.println(employeeIds[i]);
        }

        System.out.println("\nFloat Array:");
        for (int i = 0; i < salaries.length; i++) {
            System.out.println(salaries[i]);
        }

        System.out.println("\nDouble Array:");
        for (int i = 0; i < incentives.length; i++) {
            System.out.println(incentives[i]);
        }

        System.out.println("\nChar Array:");
        for (int i = 0; i < grades.length; i++) {
            System.out.println(grades[i]);
        }

        System.out.println("\nBoolean Array:");
        for (int i = 0; i < isPermanent.length; i++) {
            System.out.println(isPermanent[i]);
        }

        System.out.println("\nByte Array:");
        for (int i = 0; i < levels.length; i++) {
            System.out.println(levels[i]);
        }

        System.out.println("\nShort Array:");
        for (int i = 0; i < deptCodes.length; i++) {
            System.out.println(deptCodes[i]);
        }

        System.out.println("\nLong Array:");
        for (int i = 0; i < pfNumbers.length; i++) {
            System.out.println(pfNumbers[i]);
        }

        System.out.println("\nString Array (Indian Names):");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
