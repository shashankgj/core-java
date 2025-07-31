class HotelRoomRunner {
    public static void main(String[] args) {
        HotelRoom[] rooms = new HotelRoom[5];

        HotelRoom r1 = new HotelRoom();
        r1.setName("Taj Suite");
        r1.setAddress("MG Road");

        HotelRoom r2 = new HotelRoom();
        r2.setName("Oberoi Luxury");
        r2.setAddress("Residency Road");

        HotelRoom r3 = new HotelRoom();
        r3.setName("ITC Gardenia");
        r3.setAddress("Richmond Road");

        HotelRoom r4 = new HotelRoom();
        r4.setName("The Park Premier");
        r4.setAddress("MG Road");

        HotelRoom r5 = new HotelRoom();
        r5.setName("JW Marriott Room");
        r5.setAddress("Vittal Mallya Road");

        for (int i = 0; i < rooms.length; i++) {
            if (i == 0) rooms[i] = r1;
            else if (i == 1) rooms[i] = r2;
            else if (i == 2) rooms[i] = r3;
            else if (i == 3) rooms[i] = r4;
            else if (i == 4) rooms[i] = r5;
        }

        for (int i = 0; i < rooms.length; i++) {
            HotelRoom room = rooms[i];
            if (room != null) {
                System.out.println(room.getName());
                System.out.println(room.getAddress());
            }
        }
    }
}
