public class Multiples {

    public static void main(String[] args) {
        int count = 0;
        for (int n = 1; n <= 1000; n++) {
            boolean divisibleBy3 = n % 3 == 0;
            boolean divisibleBy5 = n % 5 == 0;

            if (divisibleBy3 && divisibleBy5) {
                count = count + 1;
            }
            else if (divisibleBy3) {
                count = count + 1;
            }
            else if (divisibleBy5) {
                count = count + 1;
            }
        }
        System.out.println(count);
    }

}