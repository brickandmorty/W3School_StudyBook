public class AssigningAttributes {

    int x = 5;

    public static void main(String[] args) {

        AssigningAttributes myObj = new AssigningAttributes();
        myObj.x = 25;
        System.out.println(myObj.x);

        // if object is declared final (modifier) at the start, you won't be able to override it
        // instead the IDE will generate an error: cannot assign a value to a final variable

    }
}
