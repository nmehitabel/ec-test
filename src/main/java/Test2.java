public class Test2 {
    public static void main(String[] args) {
        System.out.println("*** Test: Palindrome Permutation\n");
        test("tenet"); // true
        test("race the car"); // false
        test("radar"); // true
        test("willow"); // false
    }
    private static void test(String str) {
        var rts = new StringBuilder(str)
                .reverse()
                .toString();

        System.out.println(str + ": Palindrome ? - "  +  str.equals(rts));
    }
}
