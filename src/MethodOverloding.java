//changing number of parameter
class MethodOverloading {
        private static void display(int a){
            System.out.println(a);
        }

        private static void display(int a, int b){
            System.out.println("Arguments: " + a + " and " + b);
        }

        public static void main(String[] args) {
            display(1);
            display(1, 4);
        }
    }

    /*
    # by chnging data type
    class MethodOverloading {


    private static void display(int a){
        System.out.println("Got Integer data.");
    }


    private static void display(String a){
        System.out.println("Got String object.");
    }

    public static void main(String[] args) {
        display(1);
        display("Hello");
    }
}
     */

