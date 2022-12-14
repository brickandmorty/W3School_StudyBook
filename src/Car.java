class Car extends Inheritance {

    private String modelName = "Mustang"; // Car attribute

    public static void main(String[] args) {

        // creating a myCar object
        Car myCar = new Car();
        // Call the honk() method (from the Vehicle class) on the myCar object
        myCar.honk();

        // Display the value of the brand attribute (from the Vehicle class)
        // and the value of the modelName from the Car class

        System.out.println("Car Brand: " + myCar.brand);
        System.out.println("Modell: " + myCar.modelName);
    }
}
