import java.util.Scanner;
public class CTA_PF2_Specimen_2025_Q4 {
    public static void main(String[] argus) {
        Scanner sc = new Scanner(System.in);
        double[] arr = {5.6, 11.5, 20.8, 35.4, 43.1, 52.4, 66.6, 78.9, 80.0, 95.5};
        System.out.print("Please enter the search element: ");
        double search = sc.nextDouble();
        int index = -1;
        int l = 0, h = arr.length - 1;
        while(l <= h) {
            int m = l + (h - l)/2;
            if(search == arr[m]) {
                index = m;
                break;
            } else if (search > arr[m])
                l = m + 1;
            else
                h = m - 1;
        }

        if(index != -1)
            System.out.println("Search successful. Element at index: " + index);
        else
            System.out.println("Search element not found");
    }
}
