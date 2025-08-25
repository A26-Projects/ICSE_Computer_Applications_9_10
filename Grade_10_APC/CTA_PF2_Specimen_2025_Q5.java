public class CTA_PF2_Specimen_2025_Q5 {
    private String str;

    public static void main(String[] argus) {
        CTA_PF2_Specimen_2025_Q5 c = new CTA_PF2_Specimen_2025_Q5("#IMAGINATION@2024");
        c.display();
    }

    CTA_PF2_Specimen_2025_Q5(String s) {
        str = s;
    }

    void display() {
        str = str.toUpperCase();
        String v = "AEIOU";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isLetter(c)) {
                if (v.indexOf(c) != -1)
                    str = str.substring(0, i) + (char) (c + 1) + str.substring(i + 1);
                else
                    str = str.substring(0, i) + (char) (c - 1) + str.substring(i + 1);
            }
        }
        System.out.println(str);
    }

}
