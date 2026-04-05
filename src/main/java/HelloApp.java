public class HelloApp {

    public static void main(String[] args) {

        if (args.length > 0) {

            String result = "Hello " + String.join(", ", args);
            System.out.println(result);

        } else {
            System.out.println("Hello Guest");
        }

    }
}