class FinanceOfficeRunner {
    public static void main(String[] args) {
        FinanceOffice[] offices = new FinanceOffice[5];

        FinanceOffice f1 = new FinanceOffice();
        f1.setName("SBI Finance Office");
        f1.setAddress("MG Road");

        FinanceOffice f2 = new FinanceOffice();
        f2.setName("Canara Finance Zone");
        f2.setAddress("Rajajinagar");

        FinanceOffice f3 = new FinanceOffice();
        f3.setName("ICICI Corporate Office");
        f3.setAddress("Jayanagar");

        FinanceOffice f4 = new FinanceOffice();
        f4.setName("HDFC Financial Center");
        f4.setAddress("Koramangala");

        FinanceOffice f5 = new FinanceOffice();
        f5.setName("Axis Investment Branch");
        f5.setAddress("Indiranagar");

        for (int i = 0; i < offices.length; i++) {
            if (i == 0) offices[i] = f1;
            else if (i == 1) offices[i] = f2;
            else if (i == 2) offices[i] = f3;
            else if (i == 3) offices[i] = f4;
            else if (i == 4) offices[i] = f5;
        }

        for (int i = 0; i < offices.length; i++) {
            FinanceOffice office = offices[i];
            if (office != null) {
                System.out.println(office.getName());
                System.out.println(office.getAddress());
            }
        }
    }
}
