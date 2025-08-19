class CountDigitPowerSum 
{
    public static void main(String args[])
    {
        int num = 123;
        int count = 0;
        int quotient = num;

        while (quotient > 0)
        {
            quotient = quotient / 10;
            count = count + 1;
        }

        int temp = num;
        int sum = 0;

        while (temp > 0) 
        {
            int digit = temp % 10;
            int power = 1;

            for (int i = 0; i < count; i++) 
            {
                power = power * digit;
            }

            sum = sum + power;
            temp = temp / 10;
        }

        System.out.println("Count of digits: " + count);
        System.out.println("Sum of digits raised to the power of count: " + sum);
    }
}
