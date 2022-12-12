public class FunctionParameters {

    static void myMethod(String cars) {
        System.out.println(cars + " - Car Brand");
    }

    public static void main(String[] args) {

        System.out.println("Following are a few examples which come to mind: ");
        System.out.println();

        myMethod("Mercedes");
        myMethod("Volvo");
        myMethod("Audi");

        myMethod("Tesla");
        myMethod("Fiat");
        myMethod("Opel");

    }
}

