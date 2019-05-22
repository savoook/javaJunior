package domashka12;

import java.util.*;

public class ListUtilsImpl implements ListUtils {
    @Override
    public List<String> asList(String... strings) throws IllegalArgumentException {
        ArrayList<String> result = new ArrayList<>();
        for (String s : strings) {
            result.add(s);
        }
        return result;
    }

    @Override
    public List<Double> sortedList(List<Double> data) throws IllegalArgumentException {
        ArrayList<Double> result = new ArrayList<>();
        for (Iterator<Double> iter = data.iterator(); iter.hasNext(); ) {
            result.add(iter.next());
        }
        Collections.sort(result, new Comparator<Double>() {
            @Override
            public int compare(Double o1, Double o2) {
                return o2.compareTo(o1);
            }
        });
        return result;
    }
}
