import java.util.*;

public class a
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int search = sc.nextInt();
        int first = 0;
        int last = 9;
        int mid;
        int[] a = new int[10];

        for (int i = 0; i < 10; i++)
        {
            a[i] = sc.nextInt();
        }

        while (first <= last)
        {
            mid = (first + last) / 2;
            if (search == a[mid])
            {
                System.out.println("Search found at index " + mid);
                break;
            }
            else if (search < a[mid])
                last = mid - 1;
            else
                first = mid + 1;
        }

        if (first > last)
            System.out.println("Element not found in the array");
    }
}