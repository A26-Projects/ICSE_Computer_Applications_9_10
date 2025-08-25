public class NewExpt {
    public static void main(String[] argus) {
        int[] arr = {0, 3, 5, 4, -34, 555, 21, 2, -8};
        int temp = 0;
        /*for(int i = 0; i < arr.length - 1; i++) {
            boolean swap = false;
            for(int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap = true;
                }
            }
            if(!swap) break;
        }*/
        /*for(int i = 0; i < arr.length; i++) {
            int min = i;
            for(int j = i + 1; j < arr.length; j++)
                if(arr[j] < arr[min]) min = j;
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }*/
        //for(int x : arr) System.out.print(x + " ");

        /*int target = -34;
        int low = 0, high = arr.length - 1, mid = 0;
        boolean found = false;
        while (low <= high) {
            mid = low + (high - low)/2;
            if (arr[mid] == target) {
                found = true;
                break;
            } else if (arr[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        if(found) System.out.println(mid);
        else System.out.println(-1);

        String str = "hello how are you he";
        str.toUpperCase();

        char c = 'a';
        Character.toLowerCase(c);

        System.out.println((str.replace("he", "u")));*/

        String s = "Hi!";
        NewExpt n = new NewExpt();
        /*System.out.println(n.reverse(s));
        System.out.println(s);*/
        for(int x : arr) System.out.print(x + " ");
        System.out.println();
        System.out.println(n.binary(arr));
        for(int x : arr) System.out.print(x + " ");


    }

    public String reverse(String str) {
        String rev = "";
        for(int i = str.length() - 1; i >= 0; i--) rev += str.charAt(i);
        str = rev;
        return rev;
    }

    public int binary(int[] arr) {
        int temp = 0;
        for(int i = 0; i < arr.length; i++) {
            int min = i;
            for(int j = i + 1; j < arr.length; j++)
                if(arr[j] < arr[min]) min = j;
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

        int target = -34;
        int low = 0, high = arr.length - 1, mid = 0;
        boolean found = false;
        while (low <= high) {
            mid = low + (high - low)/2;
            if (arr[mid] == target) {
                found = true;
                break;
            } else if (arr[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        if(found) return mid;
        else return -1;
    }

}
