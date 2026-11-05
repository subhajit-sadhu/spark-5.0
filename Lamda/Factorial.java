package Main_course.Lamda;

public interface Factorial {
    int factorial(int n);
    public class fact{
        public static void main(String[] args) {
            Factorial f = (n)->
            {
            int res = 1;
            for(int i=0;i<n;i++)
                res *= i;
            return res;
            };
            System.out.println(f.factorial(5));
        }
    }
}
