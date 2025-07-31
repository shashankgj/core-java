class PostOfficeRunner {
    public static void main(String[] args) {
        PostOffice[] offices = new PostOffice[5];

        PostOffice p1 = new PostOffice();
        p1.setName("General Post Office");
        p1.setAddress("Bangalore");

        PostOffice p2 = new PostOffice();
        p2.setName("Jayanagar Post Office");
        p2.setAddress("Jayanagar");

        PostOffice p3 = new PostOffice();
        p3.setName("Koramangala Post Office");
        p3.setAddress("Koramangala");

        PostOffice p4 = new PostOffice();
        p4.setName("Indiranagar Post Office");
        p4.setAddress("Indiranagar");

        PostOffice p5 = new PostOffice();
        p5.setName("HSR Post Office");
        p5.setAddress("HSR Layout");

        for (int i = 0; i < offices.length; i++) {
            if (i == 0) offices[i] = p1;
            else if (i == 1) offices[i] = p2;
            else if (i == 2) offices[i] = p3;
            else if (i == 3) offices[i] = p4;
            else if (i == 4) offices[i] = p5;
        }

        for (int i = 0; i < offices.length; i++) {
            PostOffice office = offices[i];
            if (office != null) {
                System.out.println(office.getName());
                System.out.println(office.getAddress());
            }
        }
    }
}
