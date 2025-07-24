class BookData 
{
    public static void main(String[] args) {
        int[] pageCounts = {120, 300, 250, 180, 400, 150, 220, 90, 310, 280};
        float[] ratings = {4.1f, 3.5f, 4.9f, 4.2f, 3.8f, 4.0f, 4.7f, 3.9f, 4.5f, 4.3f};
        double[] prices = {250.50, 300.75, 150.25, 500.90, 180.30, 230.00, 410.80, 360.45, 120.20, 330.10};
        char[] categories = {'F', 'N', 'C', 'S', 'F', 'N', 'C', 'S', 'F', 'N'};
        boolean[] availability = {true, true, false, true, false, true, true, false, true, true};
        byte[] editions = {1, 2, 3, 1, 2, 3, 1, 2, 3, 1};
        short[] bookIDs = {1010, 1011, 1012, 1013, 1014, 1015, 1016, 1017, 1018, 1019};
        long[] isbn = {9780451524935L, 9780439023528L, 9780140449136L, 9780061120084L, 9780307277671L,
                       9780141439600L, 9780199535569L, 9780679783275L, 9780140283334L, 9780307476463L};
        String[] authors = {"Kiran", "Meena", "Ajay", "Sneha", "Varun", "Neha", "Ramesh", "Divya", "Arun", "Pooja"};

        System.out.println("Int Array:");
        for (int i = 0; i < pageCounts.length; i++) {
            System.out.println(pageCounts[i]);
        }

        System.out.println("\nFloat Array:");
        for (int i = 0; i < ratings.length; i++) {
            System.out.println(ratings[i]);
        }

        System.out.println("\nDouble Array:");
        for (int i = 0; i < prices.length; i++) {
            System.out.println(prices[i]);
        }

        System.out.println("\nChar Array:");
        for (int i = 0; i < categories.length; i++) {
            System.out.println(categories[i]);
        }

        System.out.println("\nBoolean Array:");
        for (int i = 0; i < availability.length; i++) {
            System.out.println(availability[i]);
        }

        System.out.println("\nByte Array:");
        for (int i = 0; i < editions.length; i++) {
            System.out.println(editions[i]);
        }

        System.out.println("\nShort Array:");
        for (int i = 0; i < bookIDs.length; i++) {
            System.out.println(bookIDs[i]);
        }

        System.out.println("\nLong Array:");
        for (int i = 0; i < isbn.length; i++) {
            System.out.println(isbn[i]);
        }

        System.out.println("\nString Array:");
        for (int i = 0; i < authors.length; i++) {
            System.out.println(authors[i]);
        }
    }
}
