public class PersonTester {
    public static void main(String[] args) {
        // test person class

        Person person1 = new Person ("Christina", "Manisap");
        Person person2 = new Person ("David", "Friend");

        // test getter methods
        System.out.println("First Name: " + person1.getFirstName());
        System.out.println("Last Name: " + person1.getLastName());
        System.out.println("Full Name: " + person1.getFullName());
        System.out.println("ID Number: " + person1.getIdNumber());

        //  test print methods
        System.out.println("Print First Name: ");
        person1.printFirstName();

        System.out.println("Print Last Name: ");
        person1.printLastName();

        System.out.println("Print ID Number: ");
        person1.printIDNumber();

        // test toString() method
        System.out.println("toString() result: " + person1.toString());

        // test multiple instances and unique IDs
        System.out.println("Person 2 Full Name: " + person2.getFullName());
        System.out.println("Person 2 ID Number: " + person2.getIdNumber());

        Person person3 = new Person ("Eden", "Homie");

        //test ID uniqueness of IDs
        System.out.println("Person 3 ID Number: " + person3.getIdNumber());

        //test toString() for the new person
        System.out.println("toString() result for Person 3: " + person3.toString());
    }
}
