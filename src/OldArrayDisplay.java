public class OldArrayDisplay {
    public static void main(String[] args) {
        int[] numbers = {12, 25, 37, 44, 59};
        int moreThan30 = 0;

        for (int number : numbers) {
            System.out.println(number);
            if (number > 30) {
                moreThan30 += 1;
            }
        }

        System.out.println("Numbers greater than 30: " + moreThan30);
    }
}
