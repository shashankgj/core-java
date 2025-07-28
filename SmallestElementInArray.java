class SmallestElementInArray
 {
    public static void main(String[] args) 
     {
        int[] numbers = {25, 12, 47, 3, 19, 88, 7, 56};

        int min = numbers[0]; 
        for (int i = 1; i < numbers.length; i++)
        {
            if (numbers[i] < min) 
            {
                min = numbers[i];             }
        }

        System.out.println("The smallest element in the array is: " + min);
    }
}
