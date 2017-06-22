package pattern;

import javax.swing.*;
import java.util.regex.*;

class MatchJavaIdentifier2 {

    private static final String STOP    = "STOP";
    private static final String VALID   = "Valid Java identifier";
    private static final String INVALID = "Not a valid Java identifier";

    private static final String VALID_IDENTIFIER_PATTERN
                   = "[a-zA-Z][a-zA-Z0-9_$]*";


    public static void main (String[] args) {

        String   str, reply;
        Matcher  matcher;
        Pattern  pattern
                        = Pattern.compile(VALID_IDENTIFIER_PATTERN);

        while (true) {

            str = JOptionPane.showInputDialog(null, "Identifier:");

            if (str.equals(STOP)) break;

            matcher = pattern.matcher(str);

            if (matcher.matches()) {
                reply = VALID;

            } else {
                reply = INVALID;
            }

            JOptionPane.showMessageDialog(null, str + ":\n" + reply);
        }
    }
}
