public class MethodParameters {

        static void myMethod(String fname, int age) {
            System.out.println(fname + " is " + age + ".");
        }

        static int newMethod(int x) {
            return 5+x;

            // Outputs 8 (5 + 3)
        }

        static int Addition(int x, int y) {
            return x+y;
        }

        static int StoringResultInVariable (int x, int y){
            return x*y;
        }

        public static void main(String[] args) {

            System.out.println(Addition(15,21));
            System.out.println();

            int z = StoringResultInVariable(10,4);
            System.out.println(z);
            System.out.println();

            System.out.println(newMethod(3));
            System.out.println();

            myMethod("Liam", 5);
            myMethod("Jenny", 8);
            myMethod("Anja", 31);
        }

    }
