public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        /* GetAndSet myObj = new GetAndSet();
        myObj.name = "John";
        System.out.println(myObj.name); */ // > this won't work, of course, since the String is declared private in the other class
        // we have to use getter and setter instead to access the variable / method

        // class connected to GetAndSet.java

        GetAndSet myObj = new GetAndSet();
        myObj.setName("Name of Object was changed to Johnny.");
        myObj.getName();

        System.out.println(myObj.getName());
    }
}