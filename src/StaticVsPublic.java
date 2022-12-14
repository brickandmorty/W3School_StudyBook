public class StaticVsPublic {



/*
You will often see Java programs that have either static or public attributes and methods.

In the example above, we created a static method, which means that it can be accessed
without creating an object of the class,
unlike public, which can only be accessed by objects:
 */

    public static void main(String[] args) {

        myStaticMethod();
        // myPublicMethod(); >> this would compile an error since there are yet no Obj declared in the method

        System.out.println();


        StaticVsPublic myObj = new StaticVsPublic();
        myObj.myPublicMethod();

    }

    static void myStaticMethod(){
        System.out.println("Static methods can be called without creating objects.");
    }
    public void myPublicMethod(){
        System.out.println("Public methods must be called by creating objects.");

    }

}

