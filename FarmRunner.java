class FarmRunner {
    public static void main(String[] args) {
        Farm[] farms = new Farm[5];

        Farm farm1 = new Farm();
        farm1.setName("Green Field Farm");
        farm1.setAddress("Hassan");

        Farm farm2 = new Farm();
        farm2.setName("Sunrise Farm");
        farm2.setAddress("Mandya");

        Farm farm3 = new Farm();
        farm3.setName("Organic Harvest");
        farm3.setAddress("Chikkaballapur");

        Farm farm4 = new Farm();
        farm4.setName("Nature Farm");
        farm4.setAddress("Tumkur");

        Farm farm5 = new Farm();
        farm5.setName("Eco Fresh Farm");
        farm5.setAddress("Kolar");

        for (int i = 0; i < farms.length; i++) {
            if (i == 0) farms[i] = farm1;
            else if (i == 1) farms[i] = farm2;
            else if (i == 2) farms[i] = farm3;
            else if (i == 3) farms[i] = farm4;
            else if (i == 4) farms[i] = farm5;
        }

        for (int i = 0; i < farms.length; i++) {
            Farm farm = farms[i];
            if (farm != null) {
                System.out.println(farm.getName());
                System.out.println(farm.getAddress());
            }
        }
    }
}
