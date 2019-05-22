package lesson4;

public class Main1 {
    public static void main(String[] args) {
        String text1 = "text to print";
        String text2 = "new day";
        String text1Upper = text1.toUpperCase();
        String text3 = text2.replace('w', 'f');
        char ch = text2.charAt(6);
        int a = text1.length();
        String text4 = text1.concat(text2);
        String text5 = text1 + " " + text2;
        String email = " savoook@mail.ru ";
        String emailindatabase = "savooook@mail.ru";
        String result = email.trim();
        if (result.equals(emailindatabase)) {
            System.out.println("Вход");
        } else {
            System.out.println("Не вход");
        }
    }
}
