public class Expt {

    private int a;
    public static void main(String[] argus) {
       int[] arr = {1, 3, 4, 8, 5, 6, 2, 9, 0, 7};
       int temp = 0;
       int[] anotherArr = {1, 3, 2, 0, 4};

        // BUBBLE SORT
        /*
        for(int i = 0; i < arr.length - 1; i++) {
            boolean swap = false;
            for(int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j+1]) {
                    temp = arr[j]; arr[j] = arr[j + 1];
                    arr[j + 1] = temp; swap = true;
                }
            }
            if(!swap) break;
        }
        for (int x : arr) System.out.print(x + " ");
        */

        // SELECTION SORT
        /*
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[minIndex]) minIndex = j;
            temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        for (int x : arr) System.out.print(x + " ");
         */

        // BINARY SEARCH
        /*
        int low = 0, high = arr.length - 1, mid = 0;
        int target = 5;
        boolean found = false;

        while(low <= high) {
            mid = low + (high - low)/2;
            if(mid == target) {
                found = true;
                break;
            } else if (mid < target) low = mid + 1;
            else high = mid - 1;
        }

        if(found) System.out.println("Target found at index: " + mid);
        else System.out.println("Target not found");
        */

        //MATH FUNCTIONS
        /*
        System.out.println(Math.rint(1.1));
        System.out.println(Math.round(1.1));
        System.out.println();
        System.out.println(Math.rint(-1.1));
        System.out.println(Math.round(-1.1));
        System.out.println();
        System.out.println(Math.rint(1.7));
        System.out.println(Math.round(1.7));
        System.out.println();
        System.out.println(Math.rint(-1.7));
        System.out.println(Math.round(-1.7));
        System.out.println(Math.rint(1.55));
        System.out.println(Math.round(1.5));
        System.out.println();
        System.out.println(Math.rint(2.55));
        System.out.println(Math.round(2.5));

        System.out.println(Math.ceil(1.1));
        System.out.println(Math.floor(1.1));
        System.out.println();
        System.out.println(Math.floor(-1.1));
        System.out.println(Math.ceil(-1.1));
        System.out.println();
        System.out.println(Math.floor(1.7));
        System.out.println(Math.ceil(1.7));
        System.out.println();
        System.out.println(Math.floor(-1.7));
        System.out.println(Math.ceil(-1.7));

        /*int a = 0, b = 0, c = 0;
        for(int i = 0; i < 10; i++) {
            a = (int)(Math.random()*21);
            b = (int)(Math.random()*21);
            c = (int)(Math.random()*21);
            System.out.println(a + " " + b + " " + c);
            System.out.println(Math.min(Math.max(a, b), Math.max(a, c)));
            System.out.println();
        }
        */

        //INSERTION
        /*
        int[] set = new int[6]; //new array
        for(int i = 0; i < set.length - 1; i++) set[i] = i;
        //initialising all but one element
        int index = 3, rep = 21;
        //shifting elements
        for (int i = set.length - 2; i >= 3; i--) set[i + 1] = set[i];
        set[3] = rep;
        for(int x : set) System.out.print(x + " ");
        */

        //DELETION
        /*
        int[] set = new int[6]; //new array
        for(int i = 0; i < set.length; i++) set[i] = i;
        //initialising array
        int index = 3;
        //shifting elements
        for (int i = index; i < set.length - 1; i++) set[i] = set[i + 1];
        set[set.length - 1] = 0; //setting last element to zero
        for(int x : set) System.out.print(x + " ");
        //or you can choose to print only till the last element
        */

        //MERGING
        /*
        int[] arr0 = new int[3];
        int[] arr1 = new int[5];
        int[] arr2 = new int[8];
        for (int i = 0; i < arr0.length; i++) arr0[i] = i;
        for (int i = 0; i < arr1.length; i++) arr1[i] = i;
        for(int i = 0; i < arr0.length; i++) arr2[i] = arr0[i];
        for(int i = 0; i < arr1.length; i++) arr2[i + arr0.length] = arr1[i];
        for(int x : arr2) System.out.print(x + " ");
        */

        int i = 10;
        long l = 100;
        float f = 103.34f;
        double d = 103.3445;
        String s = String.valueOf(i + " " + l + " " + f + " " + d);
        s = i + " " + l + " " + f + " " + d;
        System.out.println(s);
        System.out.println(Boolean.toString(false).length());
        System.out.println(s);
    }


}
