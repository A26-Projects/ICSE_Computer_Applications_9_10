public class P339_17 {
    public void display(String str, int p) {
        if (p == 1) {System.out.print("Uppercase alphabets: ");}
        else {System.out.print("Lowercase alphabets: ");}
            for (int i = 0; i < str.length(); i++) {
                if (p == 1) {
                    if (Character.isUpperCase(str.charAt(i)))
                        System.out.print(str.charAt(i) + " ");
                } else {
                    if (Character.isLowerCase(str.charAt(i)))
                        System.out.print(str.charAt(i) + " ");
                }
            }
        }

    public void display(String str, char chr) {
        if (chr != 'v') {System.out.print("Alphabets: ");}
        else {System.out.print("Vowels: ");}
        for(int i = 0; i < str.length(); i++) {
            if (chr != 'v') {
                if(Character.isAlphabetic(str.charAt(i)))
                    System.out.print(str.charAt(i) + " ");
            } else {
                if("aeiou".indexOf(Character.toLowerCase(str.charAt(i))) != -1)
                    System.out.print(str.charAt(i) + " ");
            }
        }
    }
}

