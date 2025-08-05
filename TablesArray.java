class TablesArray
{
 public static void main(String args[])
  {
   int[] threeTable = new int[10];
   //i=0;
   //3*1=3;

  //I as 0
  System.out.println("multiplication table of three");
  for(int i=0;i<threeTable.length;i++)
   {
    threeTable[i] = 3*(i+1);
    System.out.println(threeTable[i]);
   }

    System.out.println();
  //I as 1
  for(int i=1;i<=threeTable.length;i++)
   {
    threeTable[i-1] = 3*i;
    //System.out.println(threeTable[i-1]);
   }
for(int i=1;i<=threeTable.length;i++)
   {
    System.out.println(threeTable[i-1]);
   }


  }
}

