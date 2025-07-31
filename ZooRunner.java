class ZooRunner {
    public static void main(String[] args) {
        Zoo[] zoos = new Zoo[5];

        Zoo z1 = new Zoo();
        z1.setName("Mysore Zoo");
        z1.setAddress("Mysuru");

        Zoo z2 = new Zoo();
        z2.setName("Bannerghatta Zoo");
        z2.setAddress("Bangalore");

        Zoo z3 = new Zoo();
        z3.setName("Arignar Anna Zoo");
        z3.setAddress("Chennai");

        Zoo z4 = new Zoo();
        z4.setName("Nehru Zoological Park");
        z4.setAddress("Hyderabad");

        Zoo z5 = new Zoo();
        z5.setName("Alipore Zoo");
        z5.setAddress("Kolkata");

        for (int i = 0; i < zoos.length; i++) {
            if (i == 0) zoos[i] = z1;
            else if (i == 1) zoos[i] = z2;
            else if (i == 2) zoos[i] = z3;
            else if (i == 3) zoos[i] = z4;
            else if (i == 4) zoos[i] = z5;
        }

        for (int i = 0; i < zoos.length; i++) {
            Zoo zoo = zoos[i];
            if (zoo != null) {
                System.out.println(zoo.getName());
                System.out.println(zoo.getAddress());
            }
        }
    }
}
