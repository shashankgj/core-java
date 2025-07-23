class Student
{
   private String name;
   private float fees;
   private int rollNumber;
   private String course;
   private float percentage;
   static String semester;
   static float scholarship;

   public void setName(String studentName)
   {
    name = studentName;
   }
   public void setFees(float studentFees)
   {
    fees = studentFees;
   }
   public void setRollNumber(int studentRoll)
   {
    rollNumber = studentRoll;
   }
   public void setCourse(String studentCourse)
   {
    course = studentCourse;
   }
   public void setPercentage(float studentPercentage)
   {
    percentage = studentPercentage;
   }
   public static void setSemester(String studentSemester)
   {
    semester = studentSemester;
   }
   public static void setScholarship(float studentScholarship)
   {
    scholarship = studentScholarship;
   }

   public String getName()
   {
    return name;
   }
   public float getFees()
   {
    return fees;
   }
   public int getRollNumber()
   {
    return rollNumber;
   }
   public String getCourse()
   {
    return course;
   }
   public float getPercentage()
   {
    return percentage;
   }
   public String getSemester()
   {
    return semester;
   }
   public float getScholarship()
   {
    return scholarship;
   }
}
