class SmartphoneProcessorRunner
{
  public static void main(String args[])
  {
    Smartphone phone = new Smartphone("Samsung Galaxy S23", "Black", 12, "Snapdragon 8 Gen 2", "UFS 4.0");
    System.out.println("Smartphone details..");
    System.out.println(phone.getBrand());
    System.out.println(phone.getColor());
    System.out.println(phone.getRamSize());
    System.out.println(phone.getProcessor());
    System.out.println(phone.getStorageType());

    Processor processorObj = new Processor(8, "Octa-core", "Qualcomm");
    System.out.println("Processor details..");
    System.out.println(processorObj.getManufacturer());
    System.out.println(processorObj.getProcessorType());
    System.out.println(processorObj.getCores());
  }
}
