package emailValidation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {

    public static final Pattern VALID_EMAIL_ADDRESS =
            Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

    public static boolean validate (String emailString) {
        Matcher matcher = VALID_EMAIL_ADDRESS.matcher(emailString);
        return matcher.find();
    }
}
