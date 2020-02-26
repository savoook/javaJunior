package domashka12_collection;

import java.util.*;

public class CollectionUtilsImpl implements CollectionUtils {
    @Override
    public Collection<Integer> union(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        LinkedList<Integer> result = new LinkedList<>();
        for (Integer i : a) {
            result.add(i);
        }
        for (Integer i : b) {
            result.add(i);
        }
        return result;
    }

    @Override
    public Collection<Integer> intersection(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        LinkedList<Integer> result = new LinkedList<>();
        for (Integer i : a) {
            if (b.contains(i)) {
                result.add(i);
            }
        }
        //for (Integer i : b) {
        // if (a.contains(i)) {
        // result.add(i);
        // }
        // }                       - немного не понятно по заданию, надо ли проходить 2 коллекции или одну)
        return result;
    }

    @Override
    public Set<Integer> unionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        LinkedHashSet<Integer> result = new LinkedHashSet();
        for (Integer i : a) {
            result.add(i);
        }
        for (Integer i : b) {
            result.add(i);
        }
        return result;
    }

    @Override
    public Set<Integer> intersectionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        LinkedHashSet<Integer> result = new LinkedHashSet<>();
        for (Iterator<Integer> iter = a.iterator(); iter.hasNext(); ) {
            int current = iter.next();
            if (b.contains(current)) {
                result.add(current);
            }
        }
        for (Iterator<Integer> iter = b.iterator(); iter.hasNext(); ) {
            int current = iter.next();
            if (a.contains(current)) {
                result.add(current);
            }
        }
        return result;
    }

    @Override
    public Collection<Integer> difference(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        ArrayList<Integer> result = new ArrayList<>();
        for (Integer num : a) {
            if (!b.contains(num)) {
                result.add(num);
            }
        }
        for (Integer num : b) {
            if (!a.contains(num)) {
                result.add(num);
            }
        }
        return result;
    }
}
