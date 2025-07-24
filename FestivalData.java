class FestivalData
 {
    public static void main(String[] args) {
        int[] days = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        float[] budgets = {1000.5f, 2000.0f, 1500.2f, 1200.3f, 1800.4f, 2500.6f, 3000.0f, 2700.8f, 2300.1f, 2900.9f};
        double[] attendance = {5000.0, 10000.0, 15000.0, 20000.0, 12000.0, 17000.0, 8000.0, 9000.0, 16000.0, 14000.0};
        char[] levels = {'A', 'B', 'C', 'A', 'B', 'C', 'A', 'B', 'A', 'C'};
        boolean[] isNational = {true, true, false, true, false, true, false, true, true, false};
        byte[] stalls = {10, 20, 15, 12, 18, 25, 22, 30, 16, 19};
        short[] volunteers = {100, 200, 150, 120, 180, 170, 130, 140, 110, 160};
        long[] ids = {50001L, 50002L, 50003L, 50004L, 50005L, 50006L, 50007L, 50008L, 50009L, 50010L};
        String[] names = {"Diwali", "Holi", "Pongal", "Onam", "Eid", "Christmas", "Bihu", "Navratri", "Raksha Bandhan", "Ganesh Chaturthi"};

        System.out.println("Int Array:");
        for (int i = 0; i < days.length; i++) {
            System.out.println(days[i]);
        }

        System.out.println("\nFloat Array:");
        for (int i = 0; i < budgets.length; i++) {
            System.out.println(budgets[i]);
        }

        System.out.println("\nDouble Array:");
        for (int i = 0; i < attendance.length; i++) {
            System.out.println(attendance[i]);
        }

        System.out.println("\nChar Array:");
        for (int i = 0; i < levels.length; i++) {
            System.out.println(levels[i]);
        }

        System.out.println("\nBoolean Array:");
        for (int i = 0; i < isNational.length; i++) {
            System.out.println(isNational[i]);
        }

        System.out.println("\nByte Array:");
        for (int i = 0; i < stalls.length; i++) {
            System.out.println(stalls[i]);
        }

        System.out.println("\nShort Array:");
        for (int i = 0; i < volunteers.length; i++) {
            System.out.println(volunteers[i]);
        }

        System.out.println("\nLong Array:");
        for (int i = 0; i < ids.length; i++) {
            System.out.println(ids[i]);
        }

        System.out.println("\nString Array (Festival Names):");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
