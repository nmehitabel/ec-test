import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {
        System.out.println("*** Test: Unique characters?\n");
        test("Benny"); // false
        test("Ben"); // true
        test("Alex"); // true
        test("Gillian"); // false
        test("");
        test(null); //arguable as to what result should be
    }
    private static void test(String str) {
        var strM = Optional.ofNullable(str);
        Set<Character> cset = strM
                .map(s -> s.chars()
                    .mapToObj(c -> (char)c)
                    .collect(Collectors.toSet()))
                .orElseGet(() -> new HashSet<>());

        System.out.format("%8s: %s%n",
                strM.orElseGet(() -> ""),
                strM.map(s -> s.length()).orElseGet(() -> 0) == cset.size());
    }
}
