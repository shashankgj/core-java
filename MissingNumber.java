class MissingNumber
{
public static void main(String args[])
 { 
  int[] arr={1,3}; 
  int n=arr.length+1;
  int sum=0;
  int total=0;

  for(int i=0;i<=n;i++)
  {
     total=total+i;
  }
  for(int i=0;i<=arr.length;i++)
  {
     sum=sum+arr[i];
  }
System.out.println("missing number is :"+(total-sum));
}
}