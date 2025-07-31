class ClinicRunner {
    public static void main(String[] args) {
        Clinic[] clinics = new Clinic[5];

        Clinic c1 = new Clinic();
        c1.setName("Apollo Clinic");
        c1.setAddress("JP Nagar");

        Clinic c2 = new Clinic();
        c2.setName("Cloudnine Clinic");
        c2.setAddress("Jayanagar");

        Clinic c3 = new Clinic();
        c3.setName("Manipal Clinic");
        c3.setAddress("Indiranagar");

        Clinic c4 = new Clinic();
        c4.setName("Fortis Clinic");
        c4.setAddress("Bannerghatta Road");

        Clinic c5 = new Clinic();
        c5.setName("Sakra Clinic");
        c5.setAddress("Marathahalli");

        for (int i = 0; i < clinics.length; i++) {
            if (i == 0) clinics[i] = c1;
            else if (i == 1) clinics[i] = c2;
            else if (i == 2) clinics[i] = c3;
            else if (i == 3) clinics[i] = c4;
            else if (i == 4) clinics[i] = c5;
        }

        for (int i = 0; i < clinics.length; i++) {
            Clinic clinic = clinics[i];
            if (clinic != null) {
                System.out.println(clinic.getName());
                System.out.println(clinic.getAddress());
            }
        }
    }
}
