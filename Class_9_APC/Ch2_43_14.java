//class containg the two methods
class Picnic {
    //first method for displaying details
    void display1() {
        //print statements to print the details
        System.out.println("Venue: Tesla Headquarters");
        System.out.println("Place: Dilshukhnagar, Hyderabad");
        System.out.println("Reporting Time: 10:00 a.m");
    }
    
    //second method for displaying details
    void display2() {
        //print statements to print the details
        System.out.println("Number of Students: 36");
        System.out.println("Teacher: Ms. Aarti Singam");
        System.out.println("Bus number: US6266NYC34");
    }
}

//main class of the program
public class Ch2_43_14 {
    public static void main(String[] args) {
        //Instantiation of the picnic object
        Picnic picnic = new Picnic();
        //calling both the methods using the object
        picnic.display1();
        picnic.display2();
    }
}