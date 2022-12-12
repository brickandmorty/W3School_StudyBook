public class MethodParameters {

        static void myMethod(String fname, int age) {
            System.out.println(fname + " is " + age + ".");
        }

        static int newMethod(int x) {
            return 5+x;

            // Outputs 8 (5 + 3)
        }

        public static void main(String[] args) {

            System.out.println(newMethod(3));
            System.out.println();

            myMethod("Liam", 5);
            myMethod("Jenny", 8);
            myMethod("Anja", 31);
        }

    }
