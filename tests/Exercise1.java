import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Exercise1
 */
public class Exercise1 {

    public static void main(String[] args) {
        String ip1 = "121.18.19.20";
        String ip2 = "255.255.255.0";
        String ip3 = "453.14.25.21";
        String ip4 = "121.18.19.20.1";

        System.out.println("The IP is " + isIPValid(ip1));
        System.out.println("The IP is " + isIPValid(ip2));
        System.out.println("The IP is " + isIPValid(ip3));
        System.out.println("The IP is " + isIPValid(ip4));
    }

    private static boolean isIPValid(String ip) {

        String headRegex = "^\\d((?<=1)(\\d?\\d?)|(?<=2)([0-5][0-5])|(?<=\\d)(\\d?))\\.";

        String bodyRegex = "\\d((?<=1)(\\d?\\d?)|(?<=2)([0-5][0-5])|(?<=\\d)(\\d?))\\.";

        String queueRegex = "\\d((?<=1)(\\d?\\d?)|(?<=2)([0-5][0-5])|(?<=\\d)(\\d?))$";

        Pattern pattern = Pattern.compile(headRegex + bodyRegex + bodyRegex + queueRegex);

        Matcher matcher = pattern.matcher(ip);

        return matcher.matches();
    }
}