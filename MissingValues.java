class MissingValues
{
 public static void main(String args[])
  {
   int arr[]={1,2,4,5};
   int n=5;
   Boolean found=false;

   for(int i=1;i<=n;i++)
   {
    for(int j=0;j<arr.length;j++)
     {
      if(i==arr[j])
       {
        found=true;
        break;
       }
     }
     if(!found)
     {
       System.out.println("missing number "+i);
     }
     found=false;
   }
 }
}
   