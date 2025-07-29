public class ArrayDataTypes 
{
    public static void main(String args[]) 
     {
        int[] intArray = {10, 20, 30, 15, 28};
        int intNum = 20;
        for (int i = 0; i < intArray.length; i++) 
        {
            if (intArray[i] == intNum) 
            {
                System.out.println(" element found " + intNum + " at the index of " + i);
            }
        }

        float[] floatArray = {1.5f, 2.5f, 3.5f, 4.0f, 5.5f};
        float floatNum = 4.0f;
        for (int i = 0; i < floatArray.length; i++) 
        {
            if (floatArray[i] == floatNum) 
            {
                System.out.println(" element found " + floatNum + " at the index of " + i);
            }
        }

        double[] doubleArray = {10.5, 20.5, 30.25, 15.75, 28.5};
        double doubleNum = 30.25;
        for (int i = 0; i < doubleArray.length; i++)
        {
            if (doubleArray[i] == doubleNum) 
            {
                System.out.println(" element found " + doubleNum + " at the index of " + i);
            }
        }

        char[] charArray = {'a', 'e', 'i', 'o', 'u'};
        char charToFind = 'o';
        for (int i = 0; i < charArray.length; i++) 
        {
            if (charArray[i] == charToFind) 
            {
                System.out.println(" element found " + charToFind + " at the index of " + i);
            }
        }

        boolean[] boolArray = {true, false, true, false, true};
        boolean boolToFind = false;
        for (int i = 0; i < boolArray.length; i++) 
        {
            if (boolArray[i] == boolToFind) 
            {
                System.out.println(" element found " + boolToFind + " at the index of " + i);
            }
        }

        byte[] byteArray = {10, 20, 30, 40, 50};
        byte byteToFind = 40;
        for (int i = 0; i < byteArray.length; i++) 
        {
            if (byteArray[i] == byteToFind)
            {
                System.out.println(" element found " + byteToFind + " at the index of " + i);
            }
        }

        short[] shortArray = {100, 200, 300, 400, 500};
        short shortToFind = 300;
        for (int i = 0; i < shortArray.length; i++) 
        {
            if (shortArray[i] == shortToFind)
            {
                System.out.println(" element found " + shortToFind + " at the index of " + i);
            }
        }

        long[] longArray = {10000L, 20000L, 30000L, 40000L, 50000L};
        long longToFind = 40000L;
        for (int i = 0; i < longArray.length; i++) 
        {
            if (longArray[i] == longToFind)
            {
                System.out.println(" element found " + longToFind + " at the index of " + i);
            }
        }

       
    }
}
