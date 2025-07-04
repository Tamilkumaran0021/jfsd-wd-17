package module_1.day.additional_1.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo {
    public static void main(String[] args) {
//        emailValid("sarath.kumar@gmail.com");
//        emailValid("sarath.kumar@gmail.com");
        passwordChecker("12tEst@123");
    }

    public static void passwordChecker(String password) {
        findMatch("[[A-Z]+\\w+[@\\$\\.]\\d+]{3,}", password);
    }

    public static void emailValid(String email) {
        findMatch("^\\w+\\S\\w+@\\w+\\.\\w+{2,3}", email);
    }

    public static void lookBehind() {
//        findMatch("(?<=\\$)\\d+", "$100 #200");
        findMatch("(?<!\\$)\\d+", "$100 #200");
    }

    public static void lookAhead() {
//        findMatch("\\d+(?=px)", "12px 14em 18px 20pt");
        findMatch("\\d+(?!px)", "12px 14em 18px 20pt");
    }

    public static void alternation() {
        findMatch("apple|banana", "apple banana");
    }

    public static void group() {
        String input = "Peter Doe, Jane Doe";
        String regex = "(\\w+) (\\w+)";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            System.out.println("Found: " + matcher.group(0));
            System.out.println("Found: " + matcher.group(1));
            System.out.println("Found: " + matcher.group(2));
        }
    }

    public static void anchor() {
//        findMatch("^a", "apple banana"); // start of line
//        findMatch("a$", "apple banana"); // end of line
//        findMatch("\\ba", "apple banana ant"); // start of word
        findMatch("\\Ba", "apple banana ant"); // other than start of word
    }

    public static void quantifier() {
//        findMatch("a{2}", "apple baanana");
//        findMatch("a{2,3}", "apple baananaaa");
//        findMatch("a{2,}", "apple baananaaaaa");
//        findMatch("a?", "apple baananaaaaa"); // 0 or 1 time {0,1}
//        findMatch("a*", "apple baananaaaaa"); // 0 or more times {0,}
        findMatch("a+", "apple baananaaaaa"); // 1 or more times {1,}
    }

    public static void preDefinedCharacterClass() {
//        findMatch("\\d", "apple12 banana12"); // [0-9]
//        findMatch("\\D", "apple12 banana12"); // [^0-9]
//        findMatch("\\w", "apple12 banana12"); // alpha numeric
//        findMatch("\\W", "apple12 banana12"); // non - alpha numeric
//        findMatch("\\s", "apple12 banana12"); // space
//        findMatch("\\S", "apple12 banana12@");// not space
    }

    public static void characterClass() {
//        findMatch("[ab]", "apple banana");
//        findMatch("[^ab]", "apple banana");
//        findMatch("[a-z]", "apple banana");
        findMatch("[0-9]", "apple12 banana12");
    }

    public static void simpleMatch() {
        // Regex -> Regular expressions
        String input = "apple banana";
        String regex = "a";

        findMatch(regex, input);
    }

    private static void findMatch(String regex, String input) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            System.out.println("Found: " + matcher.group() + " at position " + matcher.start());
        }
    }

}
