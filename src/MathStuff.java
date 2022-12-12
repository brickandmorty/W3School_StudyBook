public class MathStuff {

    public static void main(String[] args) {

        // The Math.abs(x) method returns the absolute (positive) value of x:
        Math.abs(-4.7);

        // Math.random() returns a random number between 0.0 (inclusive), and 1.0 (exclusive):
        Math.random();

        int randomNum = (int)(Math.random() * 101);  // method from above but from 0 to 100

        // The Math.sqrt(x) method returns the square root of x:
        Math.sqrt(64);

        // Boolean Comparison Tools

        int myAge = 28;
        int votingAge = 18;

        if (myAge >= votingAge){
            System.out.println("Yey! You're old enough to go vote! :-)");
        } else {
            System.out.println("Oh no... You're still too young to vote. " +
                    "Go educate yourself a few more years! ");
        }


    }
}
