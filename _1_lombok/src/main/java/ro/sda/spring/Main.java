package ro.sda.spring;

public class Main {
    public static void main(String[] args) {
        User u1 = new User();
        u1.setFirstName("Ana");
        u1.setLastName("Baiceanu");
        u1.setAge(20);
        System.out.println(u1);

        User u2 = new User("Leo", "Messi",35);
        System.out.println(u2);
    }
}