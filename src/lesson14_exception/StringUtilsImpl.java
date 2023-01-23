package lesson14_exception;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtilsImpl implements StringUtils {

    @Override
    public double div(String number1, String number2) throws NullPointerException, NumberFormatException, ArithmeticException {
        if (number1 == null || number2 == null) {
            throw new NullPointerException("number1==null||number2==null");
        }
        double num1 = 0;
        double num2 = 0;
        try {
            num1 = Double.parseDouble(number1);
        } catch (Exception e) {
            throw new NumberFormatException("Первая переменная не число");

        }
        try {
            num2 = Double.parseDouble(number2);
        } catch (Exception e) {
            throw new NumberFormatException("Вторая переменная не число");

        }
        if (num2 == 0) {
            throw new ArithmeticException("Делить на ноль нельзя");
        }

        return num1 / num2;
    }

    @Override
    public int[] findWord(String text, String word) throws NullPointerException {
        if (text == null || word == null) {
            throw new NullPointerException("text==null||word==null");
        }
        ArrayList<Integer> result = new ArrayList<>();
        String word1 = word.toLowerCase();
        String text1 = " " + text.toLowerCase();
        int fromInd = 0;
        int index = 0;
        for (int i = 0; i < text1.length(); i++) {
            index = text1.indexOf(word1, fromInd + 1);
            if (index >= 0) {
                result.add(index - 1);
                fromInd +=index;
            }
        }
        Integer[] indexes = result.toArray(new Integer[result.size()]);
        int[] ind = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            ind[i] = indexes[i];
        }
        return ind;
    }

    @Override
    public double[] findNumbers(String text) throws CustomException {
        ArrayList<Double> arrayList = new ArrayList<>();
        Pattern p = Pattern.compile("(\\d+(?:\\.\\d+))");
        Matcher m = p.matcher(text);
        while (m.find()) {
            double d = Double.parseDouble(m.group(1));
            arrayList.add(d);
        }
        if (arrayList.isEmpty()) {
            throw new CustomException("не найдены числа");
        }
        double[] indexes = new double[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            indexes[i] = arrayList.get(i);
        }
        return indexes;
    }
}
