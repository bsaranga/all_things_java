import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] intArray = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        var mapped = Arrays.stream(intArray).map(f -> f * 2);

        var copy = Arrays.copyOfRange(intArray, 2, 5);
        Arrays.stream(copy).forEach(e -> System.out.println(e));
        mapped.forEach(m -> System.out.println(m));
    }
}