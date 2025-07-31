class FactoryRunner {
    public static void main(String[] args) {
        Factory[] factories = new Factory[5];

        Factory f1 = new Factory();
        f1.setName("Tata Steel Factory");
        f1.setAddress("Jamshedpur");

        Factory f2 = new Factory();
        f2.setName("Kirloskar Factory");
        f2.setAddress("Hubli");

        Factory f3 = new Factory();
        f3.setName("Bharat Forge");
        f3.setAddress("Pune");

        Factory f4 = new Factory();
        f4.setName("TVS Motors Factory");
        f4.setAddress("Hosur");

        Factory f5 = new Factory();
        f5.setName("Ashok Leyland Factory");
        f5.setAddress("Chennai");

        for (int i = 0; i < factories.length; i++) {
            if (i == 0) factories[i] = f1;
            else if (i == 1) factories[i] = f2;
            else if (i == 2) factories[i] = f3;
            else if (i == 3) factories[i] = f4;
            else if (i == 4) factories[i] = f5;
        }

        for (int i = 0; i < factories.length; i++) {
            Factory factory = factories[i];
            if (factory != null) {
                System.out.println(factory.getName());
                System.out.println(factory.getAddress());
            }
        }
    }
}
