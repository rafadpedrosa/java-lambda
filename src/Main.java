import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

//        List<String> bingoNumbers = Arrays.asList("g1", "f1", "f2", "h3", "h3", "t5");
//
//        bingoNumbers.stream()
//                .forEach(System.out::println);
//
//        System.out.println("-----------");

//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                String str = "letz try to figure out";
//                String[] parts = str.split(" ");
//
//                for (String part : parts) {
//                    System.out.println(part);
//                }
//            }
//        };
//
//        new Thread(runnable).start();

//        Runnable run = () -> Arrays.stream("letz try to figure out".split(" "))
//                .forEach(System.out::println);
//
//        new Thread(run).start();


//        Function<String, String> lambda = (String s) -> {
//            StringBuilder returnVal = new StringBuilder();
//            for (int i = 0; i < s.length(); i++) {
//                if (i % 2 == 1) {
//                    returnVal.append(s.charAt(i));
//                }
//            }
//
//            return returnVal.toString();
//        };
//
//        System.out.println(everySecondCharacter(lambda, "1234567890"));
//
//        System.out.println("-------");
//
//        Supplier<String> iLoveJava = () -> "I love java";
//
//        String supplierResult = iLoveJava.get();
//        System.out.println(supplierResult);


        List<String> topNames2015 = Arrays.asList(
                "Amelia",
                "Olivia",
                "emily",
                "Isla",
                "Ava",
                "oliver",
                "Jack",
                "Charlie",
                "harry",
                "Jacob"
        );

        Function<String, String> toCamelCase = name -> name.substring(0, 1).toUpperCase() + name.substring(1);
        Predicate<String> matchesAa = name -> name.matches("^[aA].*");

        topNames2015.stream()
                .map(toCamelCase)
                .peek(System.out::println)
                .sorted()
                .collect(Collectors.toList());

//        System.out.println(topNames2015.stream()
//                .filter(matchesAa)
//                .count());

    }

    public static String everySecondCharacter(Function<String, String> lambda, String s) {
        return lambda.apply(s);
    }
}
