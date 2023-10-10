public class Person {
   private String firstName;
   private String lastName;
   private int idNumber;
   private static int lastAssignedId = 1000; // class variable to track last ID

    // constructor

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = ++lastAssignedId; // assign a unique ID and increment lastAssignedID
    }

    // getter methods that return last name, first name, and ID number

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public int getIdNumber() {
        return idNumber;
    }

    // print methods
    public void printFirstName() {
        System.out.println(firstName);
    }

    public void printLastName() {
        System.out.println(lastName);
    }

    public void printIDNumber() {
        System.out.println(idNumber);
    }

    // toString() method
    @Override
    public String toString() {
        return "Person [ID: " + idNumber + ", Name: " + getFullName() +"]";
    }

}