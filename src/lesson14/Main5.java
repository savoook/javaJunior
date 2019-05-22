package lesson14;

public class Main5 {
    public static void main(String[] args) {
        StringUtilsImpl stringUtils = new StringUtilsImpl();
        double result = stringUtils.div("2", "1");
        System.out.println(result);

        int[] result1 = stringUtils.findWord("Олег, Привет, Олег! Олег, как ты поживаешь? Олег молодец!", "Олег");
        for (int i = 0; i < result1.length; i++) {
            System.out.println(result1[i]);
        }

        try {
            double[] result2 = stringUtils.findNumbers("трёхстороннее международное соглашение между Великобританией, Францией и " +
                    "Италией о сотрудничестве (де-факто — разделе сфер влияния) в Абиссинии (Эфиопии). Заключено 13 " +
                    "декабря 1906 года. Лондонское соглашение 1906 года закрепило сложившийся к моменту его заключения " +
                    "политический и территориальный статус-кво Эфиопии, определило границы сфер экономических интересов " +
                    "Великобритании, Франции и Италии в Эфиопии и установило коллегиальный порядок разрешения споров по " +
                    "Эфиопии между перечисленными державами. Основное же значение Лондонского соглашения 1906 года для " +
                    "2.0 международной политики заключается в том, что ");
            for (double d : result2) {
                System.out.println(d);
            }
        } catch (CustomException e) {
            e.printStackTrace();
        }
        // =stringUtils.findNumbers()
    }
}
