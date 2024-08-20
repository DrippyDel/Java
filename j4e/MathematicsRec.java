/**
 * This class provides various mathematical recursive methods
 */
class MathematicsRec {
    /**
     * The method returns a value which:
     * - Increases each of even decimal digits of theDecimalNumber by one
     * - Decreases each of odd decimal digits of theDecimalNumber by one
     * @param theDecimalNumber the input decimal number (n)
     * @return the new decimal number after digit adjustments
     */
    public static long eduodd(final long theDecimalNumber) 
    {
        int isNeg = 0;
        long result;
        long n = theDecimalNumber;

        if (n == 0) 
        {
            return 1;
        }

        if (n < 0) 
        {
            isNeg = 1;
            n = n * -1;
        }

        result = eduoddRecursive(n);

        if (isNeg == 1) 
        {
            result = result * -1;
        }

        return result;
    }

    private static long eduoddRecursive(final long theDecimalNumber) 
    {
        long num;
        long lastDig;
        long modDig; 
        long n = theDecimalNumber;

        if (n == 0) 
        {
            return 0;
        }

        lastDig = n % 10;

        if (lastDig % 2 == 0)
        {
            modDig = lastDig + 1;
        } 
        else 
        {
            modDig = lastDig - 1;
        }

        num = eduoddRecursive(n / 10);

        return num * 10 + modDig;
    }

    /**
     * The method accepts a non-negative integer and returns a value as described below
     * @param theDecimalNumber is a non-negative decimal number (n)
     * @return the value in the following way:
     * - return 1 when n = 0
     * - return sum of fibby(floor(n/4)) and fibby(floor(3n/4)) when n > 0
     */
    public static int fibby(final int theDecimalNumber) 
    {
        if (theDecimalNumber == 0) 
        {
            return 1;
        }

        return fibby(theDecimalNumber / 4) + fibby((3 * theDecimalNumber) / 4);
    }

    /**
     * The method prints all consecutive values of n and its fibby value
     * @param theLowerBound the lower bound (start)
     * @param theUpperBound the upper bound (end)
     */
    public static void stg(final int theLowerBound, final int theUpperBound) 
    {
        stgRecursive(theLowerBound, theUpperBound, -1);
    }

    private static void stgRecursive(final int n, final int m, final int fibbyPrev) 
    {
        int fibbyCur;

        if (n > m) 
        {
            return;
        }

        fibbyCur = fibby(n);

        if (fibbyCur != fibbyPrev) 
        {
            System.out.println(n + " " + fibbyCur);
        }

        stgRecursive(n + 1, m, fibbyCur);
    }

    /**
     * The method returns the median that splits the array into 3 parts
     * @param theList the list of integers (a)
     * @return the median
     */
    public static double median3(final int[] theList) 
    {
        int n = theList.length;
       return getMedian(theList, 0, n-1);
    }

    public static double getMedian(int a[], int start, int end) 
    {
        if (end - start == 0) 
        {
            return (double) a[start];
        } 
        else if (end - start == 1) 
        {
            double mean = ((double) a[start] + (double) a[end]) / 2.0;
            return mean;
        } 
        else 
        {
            int n = end - start + 1;
            double m1, m2, m3;
            if (n % 3 == 0) 
            {
                m1 = getMedian(a, start, start + (n / 3) - 1);
                m2 = getMedian(a, start + (n / 3), start + 2 * (n / 3) - 1);
                m3 = getMedian(a, start + 2 * (n / 3), end);
            } 
            else if (n % 3 == 1) 
            {
                m1 = getMedian(a, start, start + (n / 3) - 1);
                m2 = getMedian(a, start + (n / 3), start + 2 * (n / 3));
                m3 = getMedian(a, start + 2 * (n / 3) + 1, end);
            } 
            else 
            {
                m1 = getMedian(a, start, start + (n / 3));
                m2 = getMedian(a, start + (n / 3) + 1, start + 2 * (n / 3));
                m3 = getMedian(a, start + 2 * (n / 3) + 1, end);
            }
    
            double temp;
            if (m1 > m2) 
            {
                temp = m1;
                m1 = m2;
                m2 = temp;
            }
    
            if (m1 > m3) 
            {
                temp = m1;
                m1 = m3;
                m3 = temp;
            }
    
            if (m2 > m3) 
            {
                return m3;
            } 
            else 
            {
                return m2;
            }
        }
    }    
    
}
