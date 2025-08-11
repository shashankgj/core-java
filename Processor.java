
class Processor
{
  private int cores;
  private String processorType;
  private String manufacturer;

  public Processor(int cores, String processorType, String manufacturer)
  {
    this.cores = cores;
    this.processorType = processorType;
    this.manufacturer = manufacturer;
  }

  public int getCores()
  {
    return cores;
  }
  public String getProcessorType()
  {
    return processorType;
  }
  public String getManufacturer()
  {
    return manufacturer;
  }
}

