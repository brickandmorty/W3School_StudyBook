public class Concatenation {

    public static void main(String[] args) {

        String firstName = "John";
        String lastName = "Doe";
        System.out.println(firstName + " " + lastName);

        // " " > fügt Space ein

        System.out.println();
        System.out.println(firstName.concat(lastName));

        // hier fehlt placeholder für Space

        /* to print the quotes in a String use a backslash beforehand
        else you will induce a error message..
         */
        System.out.println();
        System.out.println("Hello, my name is Sara \"Kati\" Horvat");

    }
}
