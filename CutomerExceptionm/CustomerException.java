package Main_course.CutomerExceptionm;

public class CustomerException {

    public static void main(String[] args) {

        try {
            setmark(24);
        } catch (InvalidMarkException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    static void setmark(int marks) throws InvalidMarkException {

        if (marks < 0 || marks > 100) {
            throw new InvalidMarkException(
                "Marks must be between 0 and 100"
            );
        }

        System.out.println("Marks saved in DB: " + marks);
    }

    // Custom Exception
    public static class InvalidMarkException extends Exception {

        public InvalidMarkException(String message) {
            super(message);
        }
    }
}

