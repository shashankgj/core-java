class Vehicle
{
   private String name;
   private float price;
   private int capacity;
   private String features;
   private float milage;
   static String serviceIntervals;
   static float serviceCost;

   public void setName(String vehicleName)
   {
    name=vehicleName;
   }
   public void setPrice(float vehiclePrice)
   {
    price=vehiclePrice;
   }
   public void setCapacity(int vehicleCapacity)
   {
    capacity=vehicleCapacity;
   }
   public void setFeatures(String vehicleFeatures)
   {
    features=vehicleFeatures;
   }
   public void setMilage(float vehicleMilage)
   {
    milage=vehicleMilage;
   }
   public static void setServiceIntervals(String vehicleServiceIntervals)
   {
    serviceIntervals = vehicleServiceIntervals;
   }
   public static void setServiceCost(float vehicleServiceCost)
   {
    serviceCost = vehicleServiceCost;
   }
   
   public String getName()
   {
    return name;
   }
   public float getPrice()
   {
    return price;
   }
   public int getCapacity()
   {
    return capacity;
   }

   public String getFeatures()
   {
    return features;
   }
   public float getMilage()
   {
    return milage;
   }
   public String getServiceIntervals()
   {
    return serviceIntervals;
   }
   public float getServiceCost()
   {
    return serviceCost;
   }


}

