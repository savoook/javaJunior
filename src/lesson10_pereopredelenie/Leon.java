package lesson10_pereopredelenie;

import java.io.Serializable;

public class Leon implements Animal, Serializable {

    @Override
    public void breath() {
        System.out.println("Лев дышит");
    }

    @Override
    public void voice() {
        System.out.println("рррррр");
    }

}
