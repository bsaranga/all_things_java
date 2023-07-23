public class Main {
    public static void main(String[] args) {
        byte foo = (byte) 128;
        byte overflowed_foo = (byte) 256;

        System.out.print(foo);
        //System.out.print(overflowed_foo);
    }
}