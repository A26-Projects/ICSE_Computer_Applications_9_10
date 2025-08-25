public class CTA_PF2_Specimen_2025_Q7 {
    private int n;

    public static void main(String[] argus) {
        CTA_PF2_Specimen_2025_Q7 c = new CTA_PF2_Specimen_2025_Q7(1021);
        c.supSpyOrNot();
    }

    CTA_PF2_Specimen_2025_Q7(int num) {
        n = num;
    }

    void supSpyOrNot() {
        int temp = n, sum = 0, nd = 0;
        while (temp > 0) {
            nd++;
            sum += temp % 10;
            temp /= 10;
        }
        System.out.println((nd == sum ? "" : "Not a ") + "SuperSpy Number");
    }
}