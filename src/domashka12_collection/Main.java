package domashka12_collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> a = new LinkedList<>();
        a.add(9);
        a.add(9);
        a.add(2);
        a.add(3);
        a.add(5);
        HashSet<Integer> b = new HashSet<>();
        b.add(9);
        b.add(8);
        b.add(1);
        b.add(3);
        b.add(6);
        CollectionUtilsImpl utils = new CollectionUtilsImpl();

        Collection<Integer> union = utils.union(a, b);
        System.out.println(union);
        Collection<Integer> intersection = utils.intersection(a, b);
        System.out.println(intersection);
        Collection<Integer> unionWithoutDuplicate = utils.unionWithoutDuplicate(a, b);
        System.out.println(unionWithoutDuplicate);
        Collection<Integer> intersectionWithoutDuplicate = utils.intersectionWithoutDuplicate(a, b);
        System.out.println(intersectionWithoutDuplicate);
        Collection<Integer> difference = utils.difference(a, b);
        System.out.println(difference);
    }
}
