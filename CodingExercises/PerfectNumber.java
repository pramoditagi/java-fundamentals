package CodingExercises;

public class PerfectNumber {
    public boolean isPerfectNumber(int number) {
        if (number <= 0)
            return false;
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        if (sum == number) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        PerfectNumber perfectNumber = new PerfectNumber();
        System.out.println(perfectNumber.isPerfectNumber(6));
    }
}
