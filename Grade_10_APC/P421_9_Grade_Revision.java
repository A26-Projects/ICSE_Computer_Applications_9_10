import java.util.Scanner;
public class P421_9_Grade_Revision {
    private String name;
    private int bas, expn;
    private double inc, nbas;

    public static void main(String[] argus) {
        P421_9_Grade_Revision p = new P421_9_Grade_Revision();
        p.accept();
        p.increment();
        p.display();
    }

    P421_9_Grade_Revision() {
        name = " ";
        bas = 0; expn = 0;
        inc = 0.0; nbas = 0.0;
    }

    public void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the employee's name, experience and basic salary respectively");
        name = sc.nextLine();
        expn = sc.nextInt();
        bas = sc.nextInt();
    }

    public void increment() {
        if (expn < 3)
            inc = 1000 + (10.0 * bas)/100;
        else if(expn < 5)
            inc = 3000 + (12.0 * bas)/100;
        else if (expn < 10)
            inc = 5000 + (15.0 * bas)/100;
        else
            inc = 8000 + (20.0 * bas)/100;
        nbas = bas + inc;
    }

    public void display() {
        System.out.println("Name of Employee: " + name);
        System.out.println("Old Basic Salary: Rs. " + bas);
        System.out.println("Experience: " + expn);
        System.out.println("Salary Increment: Rs. " + inc);
        System.out.println("New Basic Salary: Rs. " + nbas);
    }
}
