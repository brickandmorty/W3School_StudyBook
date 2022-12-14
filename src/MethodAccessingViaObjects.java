public class MethodAccessingViaObjects {

    public static void main(String[] args) {

        MethodAccessingViaObjects myCar = new MethodAccessingViaObjects();
        myCar.fullThrottle();
        myCar.maxSpeed(300);

    }

    public void fullThrottle(){
        System.out.println("The car is going as fast as it can!");
    }

    public void maxSpeed(int maxSpeed){
        System.out.println("The max speed is: " + maxSpeed + " km/h.");
    }

}

/*

  // Create a fullThrottle() method
  public void fullThrottle() {
    System.out.println("The car is going as fast as it can!");
  }

  // Create a speed() method and !!! add a parameter!!! WICHTIG
  public void speed(int maxSpeed) {
    System.out.println("Max speed is: " + maxSpeed);
  }

  // Inside main, call the methods on the myCar object
  public static void main(String[] args) {
    Main myCar = new Main();   // Create a myCar object
    myCar.fullThrottle();      // Call the fullThrottle() method
    myCar.speed(200);          // Call the speed() method
  }
}

 */