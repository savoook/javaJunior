package domashka5;

public class Proverka {
    public static void main(String[] args) {
        NumMethod.smallestNum(1432, 245, 376);
        StringMethod.numChar("Сколько же символов в этом тексте?");
        NumMethod.biggestNum(134, 54, 2);
        StringMethod.withNewLine("разбейте это по разным строкам, немедленно");
        char[] a=StringMethod.vowel("London is the capital of Great Britain");
        StringMethod.pervaya("bad, but not!");
        System.out.println(a);
    }
}
