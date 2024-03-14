public class OddPositionCharacters {
    public static void main(String[] args) {
        String text = "type here\nto search";

        // Remove white spaces from the string
        String cleanedText = text.replaceAll("\\s", "");

        // Print odd-position characters
        for (int i = 0; i < cleanedText.length(); i++) {
            if (i % 2 == 0) {
                System.out.print(cleanedText.charAt(i));
            }
        }
    }
}