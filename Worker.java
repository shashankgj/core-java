class Worker 
  {
    private String name;
    private float salary;
    private int hoursPerWeek;
    private String skill;
    private float experience;

    static String shiftTimings;
    static float overtimeRate;

    public void setName(String workerName)
    {
        name = workerName;
    }

    public void setSalary(float workerSalary) 
   {
        salary = workerSalary;
    }

    public void setHoursPerWeek(int workerHours) 
    {
        hoursPerWeek = workerHours;
    }

    public void setSkill(String workerSkill) 
    {
        skill = workerSkill;
    }

    public void setExperience(float workerExperience) 
    {
        experience = workerExperience;
    }

    public static void setShiftTimings(String shift) 
    {
        shiftTimings = shift;
    }

    public static void setOvertimeRate(float rate) 
    {
        overtimeRate = rate;
    }

    public String getName() 
    {
        return name;
    }

    public float getSalary() 
    {
        return salary;
    }

    public int getHoursPerWeek() 
    {
        return hoursPerWeek;
    }

    public String getSkill() 
    {
        return skill;
    }

    public float getExperience() 
    {
        return experience;
    }

    public String getShiftTimings() 
    {
        return shiftTimings;
    }

    public float getOvertimeRate() 
    {
        return overtimeRate;
    }
}
