public class Main {
    public static void main(String[] args) {
        String str = "Hello world";
        int x = 7;
        String str1 = str.substring(0, x);
        String str2 = str.substring(x);
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
    }
}