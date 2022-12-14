public class AccessModifiersPartTwo {

    public static void main(String[] args) {

        // create an object of the Student class (which inherits attributes and methods from AccessModifiers)

        Student myObj = new Student();

        System.out.println("Student Name: " + myObj.fname);
        System.out.println("Student's Age: " + myObj.age);
        System.out.println("Graduation Year: " + myObj.graduationYear);

        myObj.study();

    }



}
