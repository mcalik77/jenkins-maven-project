package call.hello;

public class App
{

    private final String message = "Hello World from Java Maven Project! It will start with github webhook trigger";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    private final String getMessage() {
        return message;
    }

}
