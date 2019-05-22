package domashka12;

import java.util.*;

public class SetUtilsImpl implements SetUtils {
    @Override
    public SortedSet<String> orderedSet(Collection<Integer> collection1, Set<String> set2) throws NullPointerException {
        TreeSet<String> result = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        for (Integer i : collection1) {
            result.add(i.toString());
        }
        for (String s : set2) {
            result.add(s);
        }
        return result;
    }

    @Override
    public Set<Integer> customOrderSet(int val1, int val2, int val3, int val4, int val5) {
        LinkedHashSet<Integer> result = new LinkedHashSet<>();
        result.add(val1);
        result.add(val2);
        result.add(val3);
        result.add(val4);
        result.add(val5);
        return result;
    }
}
