import java.util.Scanner;
public class P243_18 {
    public static void main(String[] argus) {
        Scanner sc = new Scanner(System.in);
        String[][] hotel = new String[2][3];
        for (int i = 0; i < hotel.length; i++) {
            for (int j = 0; j < hotel[0].length; j++) {
                System.out.print("Please enter the name of the person in floor: " + i + ", room: " + j + " = ");
                hotel[i][j] = sc.nextLine();
            }
        }
        System.out.print("Please enter the person of enquiry: ");
        String search = sc.nextLine();
        boolean found = false;
        int room = 0, floor = 0;
        outer: for (floor = 0; floor < hotel.length; floor++) {
            for (room = 0; room < hotel[0].length; room++) {
                if (hotel[floor][room].equals(search)) {
                    found = true;
                    break outer;
                }
            }
        }
        if (found)
            System.out.println("Guest found at floor: " + floor + ", room: " + room); 
    }
}