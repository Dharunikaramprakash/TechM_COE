package pack1;

public class AlternateCapitalization {
    public static void main(String[] args) {

        String input="anurag";
        System.out.println("input String"+input);

        String result = capitalizeAlternate(input);


        System.out.println("Output: " + result);
    }


    public static String capitalizeAlternate(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(Character.toLowerCase(str.charAt(i)));
            }
        }

        return sb.toString();
    }
}
