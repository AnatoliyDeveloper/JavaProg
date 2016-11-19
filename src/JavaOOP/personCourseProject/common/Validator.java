package JavaOOP.personCourseProject.common;

/**
 * Created by Anatoliy on 09.11.2016.
 */
public final class Validator {

    private Validator() {
    }

    public static boolean isInt(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
