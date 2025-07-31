class BridgeRunner {
    public static void main(String[] args) {
        Bridge[] bridges = new Bridge[5];

        Bridge b1 = new Bridge();
        b1.setName("Howrah Bridge");
        b1.setAddress("Kolkata");

        Bridge b2 = new Bridge();
        b2.setName("Bandra-Worli Sea Link");
        b2.setAddress("Mumbai");

        Bridge b3 = new Bridge();
        b3.setName("Vidyasagar Setu");
        b3.setAddress("Kolkata");

        Bridge b4 = new Bridge();
        b4.setName("Godavari Bridge");
        b4.setAddress("Rajahmundry");

        Bridge b5 = new Bridge();
        b5.setName("Yamuna Bridge");
        b5.setAddress("Delhi");

        for (int i = 0; i < bridges.length; i++) {
            if (i == 0) bridges[i] = b1;
            else if (i == 1) bridges[i] = b2;
            else if (i == 2) bridges[i] = b3;
            else if (i == 3) bridges[i] = b4;
            else if (i == 4) bridges[i] = b5;
        }

        for (int i = 0; i < bridges.length; i++) {
            Bridge bridge = bridges[i];
            if (bridge != null) {
                System.out.println(bridge.getName());
                System.out.println(bridge.getAddress());
            }
        }
    }
}
