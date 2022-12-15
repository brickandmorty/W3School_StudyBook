abstract class AbstractClass {
    // Abstract class

        // Abstract method (does not have a body)
        public abstract void animalSound();

        // Regular method
        public void sleep() {
            System.out.println("Zzz");
        }
    }

    // Subclass (inherit from "AbstractClass")
    class Sheep extends AbstractClass {
        public void animalSound() {
            // The body of animalSound() is provided here
            System.out.println("The sheep says: meeh meeh");
        }
    }

    class Executive {
        public static void main(String[] args) {
            Sheep randomSheep = new Sheep(); // Create a Sheep object
            randomSheep.animalSound();
            randomSheep.sleep();
        }
    }


    /* Why And When To Use Abstract Classes and Methods?
    To achieve security - hide certain details and only show the important details of an object.

    Note: Abstraction can also be achieved with Interfaces, which you will learn more about in the next chapter. */

