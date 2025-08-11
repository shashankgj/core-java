class Smartphone
{
  private String brand;
  private String color;
  private int ramSize;
  private String processor;
  private String storageType;
  private Processor processorObj;
 
  public Smartphone(String brand, String color, int ramSize, String processor, String storageType)
  {
    this.brand = brand;
    this.color = color;
    this.ramSize = ramSize;
    this.processor = processor;
    this.storageType = storageType;
  }

  public Smartphone(String brand, String color, int ramSize, String processor, String storageType, Processor processorObj)
  {
    this(brand, color, ramSize, processor, storageType);
    this.processorObj = processorObj;
  }

  public String getBrand()
  {
    return brand;
  }
  public String getColor()
  {
    return color;
  }
  public int getRamSize()
  {
    return ramSize;
  }
  public String getProcessor()
  {
    return processor;
  }
  public String getStorageType()
  {
    return storageType;
  }
  public Processor getProcessorObj()
  {
    return processorObj;
  }
}
