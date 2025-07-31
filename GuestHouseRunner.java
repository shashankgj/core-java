class GuestHouseRunner {
    public static void main(String[] args) {
        GuestHouse[] guestHouses = new GuestHouse[5];

        GuestHouse g1 = new GuestHouse();
        g1.setName("Nandini Guest House");
        g1.setAddress("Basaveshwaranagar");

        GuestHouse g2 = new GuestHouse();
        g2.setName("Sri Sai Residency");
        g2.setAddress("BTM Layout");

        GuestHouse g3 = new GuestHouse();
        g3.setName("Green Nest Stay");
        g3.setAddress("Koramangala");

        GuestHouse g4 = new GuestHouse();
        g4.setName("Anugraha Lodge");
        g4.setAddress("Indiranagar");

        GuestHouse g5 = new GuestHouse();
        g5.setName("Daffodil Residency");
        g5.setAddress("Whitefield");

        for (int i = 0; i < guestHouses.length; i++) {
            if (i == 0) guestHouses[i] = g1;
            else if (i == 1) guestHouses[i] = g2;
            else if (i == 2) guestHouses[i] = g3;
            else if (i == 3) guestHouses[i] = g4;
            else if (i == 4) guestHouses[i] = g5;
        }

        for (int i = 0; i < guestHouses.length; i++) {
            GuestHouse guestHouse = guestHouses[i];
            if (guestHouse != null) {
                System.out.println(guestHouse.getName());
                System.out.println(guestHouse.getAddress());
            }
        }
    }
}
