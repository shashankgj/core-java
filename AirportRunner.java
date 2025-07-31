class AirportRunner {
    public static void main(String[] args) {
        Airport[] airports = new Airport[5];

        Airport a1 = new Airport();
        a1.setName("Kempegowda International Airport");
        a1.setAddress("Bangalore");

        Airport a2 = new Airport();
        a2.setName("Chhatrapati Shivaji Airport");
        a2.setAddress("Mumbai");

        Airport a3 = new Airport();
        a3.setName("Indira Gandhi Airport");
        a3.setAddress("Delhi");

        Airport a4 = new Airport();
        a4.setName("Rajiv Gandhi Airport");
        a4.setAddress("Hyderabad");

        Airport a5 = new Airport();
        a5.setName("Netaji Subhas Airport");
        a5.setAddress("Kolkata");

        for (int i = 0; i < airports.length; i++) {
            if (i == 0) airports[i] = a1;
            else if (i == 1) airports[i] = a2;
            else if (i == 2) airports[i] = a3;
            else if (i == 3) airports[i] = a4;
            else if (i == 4) airports[i] = a5;
        }

        for (int i = 0; i < airports.length; i++) {
            Airport airport = airports[i];
            if (airport != null) {
                System.out.println(airport.getName());
                System.out.println(airport.getAddress());
            }
        }
    }
}
