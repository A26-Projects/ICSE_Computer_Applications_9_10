public class P290_12 {
    public static void main(String[] argus) {
        String str = "Blue bottle is in Blue bag lying on Blue carpet";
        for(int i = 0; i < str.length() - 3; i++) {
            if (str.startsWith("Blue", i)) //OR str.substring(i, i + 4).equals("Blue)
                str = str.substring(0, i) + "Red" + str.substring(i + 4);
        }
        System.out.println(str);
    }
}
