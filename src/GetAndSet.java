public class GetAndSet {

        private String name;

        public String getName() {  //Getter
            return name;
        }
        public String setName(String NewName) { //Setter
            this.name = NewName;
            return NewName; //recommended by Compiler
        }

    public static void main(String[] args) {
            GetAndSet myObj = new GetAndSet();
            myObj.name = "John";
        System.out.println(myObj.name);
    }

    }
