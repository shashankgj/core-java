class Tablet 
{
   String name;
   float price;
   int storage;
   String features;
   float size;

   public static void main(String args[])
   {
      Tablet tablet = new Tablet();
      tablet.name = "Samsung";
      tablet.price = 30212.1f;
      System.out.println(tablet.name);
      tablet.setName("iPad");
      System.out.println(tablet.name);
      System.out.println(tablet.price);
      tablet.setPrice(20000.2f);
      System.out.println(tablet.price);
      tablet.setStorage(128);
      System.out.println(tablet.storage);
      tablet.setFeatures("Stylus Support");
      System.out.println(tablet.features);
      tablet.setSize(10.5f);
      System.out.println(tablet.size);

      Tablet tablet1 = new Tablet(); 
      tablet1.name = "Lenovo";
      tablet1.setName("Xiaomi");
      System.out.println(tablet1.name);
      System.out.println(tablet.name);
      tablet1.price = 63262.3f;
      System.out.println(tablet1.price);
      tablet1.setPrice(45770.2f);
      System.out.println(tablet1.price);
      tablet1.setStorage(256);
      System.out.println(tablet1.storage);
      tablet1.setFeatures("Keyboard Attachment");
      System.out.println(tablet1.features);
      tablet1.setSize(11.0f);
      System.out.println(tablet1.size);

      Tablet tablet2 = new Tablet();
      tablet2.name = "Realme";
      tablet2.setName("Nokia");
      System.out.println(tablet2.name);
      tablet2.price = 63262.3f;
      System.out.println(tablet2.price);
      tablet2.setPrice(45770.2f);
      System.out.println(tablet2.price);
      tablet2.setStorage(512);
      System.out.println(tablet2.storage);
      tablet2.setFeatures("Detachable Keyboard");
      System.out.println(tablet2.features);
      tablet2.setSize(12.3f);
      System.out.println(tablet2.size);

      Tablet tablet3 = new Tablet();
      tablet3.name = "Realme";
      tablet3.setName("Nokia");
      System.out.println(tablet3.name);
      tablet3.price = 63262.3f;
      System.out.println(tablet3.price);
      tablet3.setPrice(45770.2f);
      System.out.println(tablet3.price);
      tablet3.setStorage(512);
      System.out.println(tablet3.storage);
      tablet3.setFeatures("Detachable Keyboard");
      System.out.println(tablet3.features);
      tablet3.setSize(12.3f);
      System.out.println(tablet3.size);

      // Repeating for tablet4 to tablet9
      Tablet tablet4 = new Tablet();
      tablet4.setName("Acer");
      System.out.println(tablet4.name);
      tablet4.setPrice(37700.0f);
      System.out.println(tablet4.price);
      tablet4.setStorage(1024);
      System.out.println(tablet4.storage);
      tablet4.setFeatures("Gaming Tablet");
      System.out.println(tablet4.features);
      tablet4.setSize(13.2f);
      System.out.println(tablet4.size);

      Tablet tablet5 = new Tablet();
      tablet5.setName("Huawei");
      System.out.println(tablet5.name);
      tablet5.setPrice(39000.0f);
      System.out.println(tablet5.price);
      tablet5.setStorage(512);
      System.out.println(tablet5.storage);
      tablet5.setFeatures("Hi-Res Display");
      System.out.println(tablet5.features);
      tablet5.setSize(10.8f);
      System.out.println(tablet5.size);

      Tablet tablet6 = new Tablet();
      tablet6.setName("Amazon Fire");
      System.out.println(tablet6.name);
      tablet6.setPrice(15000.0f);
      System.out.println(tablet6.price);
      tablet6.setStorage(128);
      System.out.println(tablet6.storage);
      tablet6.setFeatures("Alexa Enabled");
      System.out.println(tablet6.features);
      tablet6.setSize(9.0f);
      System.out.println(tablet6.size);

      Tablet tablet7 = new Tablet();
      tablet7.setName("Microsoft Surface");
      System.out.println(tablet7.name);
      tablet7.setPrice(75000.0f);
      System.out.println(tablet7.price);
      tablet7.setStorage(1024);
      System.out.println(tablet7.storage);
      tablet7.setFeatures("Windows OS");
      System.out.println(tablet7.features);
      tablet7.setSize(13.0f);
      System.out.println(tablet7.size);

      Tablet tablet8 = new Tablet();
      tablet8.setName("Google Pixel Slate");
      System.out.println(tablet8.name);
      tablet8.setPrice(58000.0f);
      System.out.println(tablet8.price);
      tablet8.setStorage(256);
      System.out.println(tablet8.storage);
      tablet8.setFeatures("Chrome OS");
      System.out.println(tablet8.features);
      tablet8.setSize(12.3f);
      System.out.println(tablet8.size);

      Tablet tablet9 = new Tablet();
      tablet9.setName("Asus ZenPad");
      System.out.println(tablet9.name);
      tablet9.setPrice(30000.0f);
      System.out.println(tablet9.price);
      tablet9.setStorage(128);
      System.out.println(tablet9.storage);
      tablet9.setFeatures("Expandable Storage");
      System.out.println(tablet9.features);
      tablet9.setSize(10.1f);
      System.out.println(tablet9.size);
   }

   public void setName(String tabletName)
   {
      name = tabletName;
   }

   public void setPrice(float tabletPrice)
   {
      price = tabletPrice;
   }

   public void setStorage(int tabletStorage)
   {
      storage = tabletStorage;
   }

   public void setFeatures(String tabletFeatures)
   {
      features = tabletFeatures;
   }

   public void setSize(float tabletSize)
   {
      size = tabletSize;
   }
}
