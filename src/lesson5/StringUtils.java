package lesson5;

public class StringUtils {
    public static String reversText(String text) {
        return new StringBuilder(text).reverse().toString();
    }
    public static String netGlasnih(String text) {
        return text.replaceAll("[aeiou](?!\\b)", "");
    }
    public static void printGlassFromText(String st) {
        char[] simbols = st.toCharArray();
        for (char ch:simbols){
            if (ch=='a'||ch=='o'||ch=='i'||ch=='e'){
                System.out.print(ch);
            }
        }
        System.out.println();
    }
}
