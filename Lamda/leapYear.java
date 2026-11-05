package Main_course.Lamda;

public interface leapYear {
    boolean test(int n);

    public class CheckleapYear {
        public static void main(String[] args) {
            leapYear leapyear = (year) -> {
                if ((year % 4 == 0) &&
                        (year % 100 != 0) ||
                        (year % 400 == 0)) {
                    return true;
                } else {
                    return false;
                }
            };

            int year = 2020;
            if (leapyear.test(year)) {
                System.out.println(year + " is a leap year");
            } else {
                System.out.println(year + " is not a leap year");
            }

        }
    }
}
