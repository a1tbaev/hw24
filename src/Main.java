import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        LinkedHashSet<Integer>integers = new LinkedHashSet<>();
        LinkedHashSet<Integer> integers1 = new LinkedHashSet<>(Arrays.asList(0,1,2));
        integers.add(1);
        integers.add(2);
        integers.add(3);
        System.out.println(meth(integers,integers1));

    }
    public static Set<Integer> meth(Set<Integer>s1, Set<Integer>s2){
        Set<Integer> integers = new HashSet<>(s1);
        integers.addAll(s2);
        Set<Integer> integer = new HashSet<>(s1);
        integer.retainAll(s2);
        integers.removeAll(integer);
        return integers;
    }
}