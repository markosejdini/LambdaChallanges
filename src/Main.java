import java.util.function.Consumer;

public class Main {


    public static void main(String[] args) {


        Consumer<String> printWords = new Consumer<String>() {
            @Override
            public void accept(String s) {
                String[] parts = s.split(" ");
                for (String part : parts) {
                    System.out.println(part);
                }
            }
        };
        // converted into lambda
        Consumer<String> printWordsLambda = s -> {
            String[] parts = s.split(" ");
            for (String part : parts) {
                System.out.println(part);
            }
        };
        printWords.accept("This sentence will be split");
        System.out.println("----------");
        printWordsLambda.accept("also this sentence ");
    }
}
