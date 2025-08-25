public class ClassExpt {
    private int age;
    private String name;

    ClassExpt(int age, String name) {
        this.age = age;
        this.name = name;
    }

    ClassExpt(ClassExpt c) {
        age = c.age;
        name = c.name;
    }

    public static void main(String[] argus) {
        ClassExpt c1 = new ClassExpt(23, "Dominic");
        ClassExpt c2 = new ClassExpt(c1);

        c1.age = 33;
        System.out.println(c1.age + " " + c2.age);
    }
}

/*
class newClass {

    private String name;
    private int age;

    newClass(ClassExpt c) {
        age = c.getAge();
        name = c.getName();
    }

    public int getAge() { return age; }
    public String getName() { return name; }

    public static void main(String[] argus) {
        ClassExpt c1 = new ClassExpt(26, "Brian");
        newClass n = new newClass(c1);
        System.out.println(n.getAge() + " " + n.getName());
    }
}*/
