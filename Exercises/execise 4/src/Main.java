import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
                // Array of subject strings for positive cases
                String[] positiveSubjects = {
                        "stu@NEU.edu",
                        "192.168.0.0",
                        "(408) 444-2032",
                        "01/18/2001",
                        "stu123",
                        "95113"
                };

                // Array of subject strings for negative cases
                String[] negativeSubjects = {
                        "user@example",
                        "999.999.999.abc",
                        "408-231-4022",
                        "25/12/2023",
                        "User@123!",
                        "234432"
                };

                // Array of regular expressions
                String[] patterns = {
                        "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$", // Email pattern
                        "^([0-9]{1,3}\\.){3}[0-9]{1,3}$", // IP address pattern
                        "^\\(\\d{3}\\) \\d{3}-\\d{4}$", // Phone number pattern
                        "^(0[1-9]|1[0-2])/(0[1-9]|[12][0-9]|3[01])/[0-9]{4}$", // Date pattern
                        "^[a-zA-Z0-9]+$" ,// Alphanumeric pattern
                        "^\\d{5}$" // Zip code pattern
                };

                for (int i = 0; i < patterns.length; i++) {
                    System.out.println("Testing pattern: " + patterns[i]);
                    Pattern pattern = Pattern.compile(patterns[i]);

                    // Positive case
                    Matcher positiveMatcher = pattern.matcher(positiveSubjects[i]);
                    System.out.println("Positive case with \"" + positiveSubjects[i] + "\": " + positiveMatcher.matches());

                    // Negative case
                    Matcher negativeMatcher = pattern.matcher(negativeSubjects[i]);
                    System.out.println("Negative case with \"" + negativeSubjects[i] + "\": " + negativeMatcher.matches());

                    System.out.println(); // Blank line for readability
                }
            }
        }
