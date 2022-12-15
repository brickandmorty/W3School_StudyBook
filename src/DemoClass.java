class DemoClass implements Multipleinterfaces.InterfaceOne, Multipleinterfaces.InterfaceTwo {

    public void methodOne() {
        System.out.println("Text 1");

    }

    public void methodTwo() {
        System.out.println("Text 2");
    }
}

    class MainDemo {
        public static void main(String[] args) {

            DemoClass myObj = new DemoClass();
            myObj.methodOne();
            myObj.methodTwo();

        }
    }

