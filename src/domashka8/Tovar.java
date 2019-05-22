package domashka8;

public class Tovar {
    private String nameTovar;
    private int indexTovara;
    private int price;
    private boolean available;
    private double reiting;
    private int numberOfStores;
    private int voiceReiting;
    private int timeDelivery;
    private boolean exclusiveInDNS;
    private String countru;
    private int garanty;
    private Description[] descriptions = new Description[10];
    private Characteristics[] characteristics = new Characteristics[10];
    private Otzivs[] otzivs = new Otzivs[10];
    private Comments[] comments = new Comments[10];
    private QuestionAnswer[] questionAnswers = new QuestionAnswer[10];


    public String getNameTovar() {
        return nameTovar;
    }

    public void setNameTovar(String nameTovar) {
        this.nameTovar = nameTovar;
    }

    public int getIndexTovara() {
        return indexTovara;
    }

    public void setIndexTovara(int indexTovara) {
        this.indexTovara = indexTovara;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public double getReiting() {
        return reiting;
    }

    public void setReiting(double reiting) {
        this.reiting = reiting;
    }

    public int getNumberOfStores() {
        return numberOfStores;
    }

    public void setNumberOfStores(int numberOfStores) {
        this.numberOfStores = numberOfStores;
    }

    public int getVoiceReiting() {
        return voiceReiting;
    }

    public void setVoiceReiting(int voiceReiting) {
        this.voiceReiting = voiceReiting;
    }

    public int getTimeDelivery() {
        return timeDelivery;
    }

    public void setTimeDelivery(int timeDelivery) {
        this.timeDelivery = timeDelivery;
    }

    public boolean isExclusiveInDNS() {
        return exclusiveInDNS;
    }

    public void setExclusiveInDNS(boolean exclusiveInDNS) {
        this.exclusiveInDNS = exclusiveInDNS;
    }

    public String getCountru() {
        return countru;
    }

    public void setCountru(String countru) {
        this.countru = countru;
    }

    public int getGaranty() {
        return garanty;
    }

    public void setGaranty(int garanty) {
        this.garanty = garanty;
    }

    public void addChracteristic(Characteristics characteristic) {
        for (int i = 0; i < characteristics.length; i++) {
            if (characteristics[i] == null) {
                characteristics[i] = characteristic;
                return;
            }
        }
    }

    public void addOtziv(Otzivs otziv) {
        for (int i = 0; i < otzivs.length; i++) {
            if (otzivs[i] == null) {
                otzivs[i] = otziv;
                return;
            }
        }
    }

    public void addComment(Comments comment) {
        for (int i = 0; i < comments.length; i++) {
            if (comments[i] == null) {
                comments[i] = comment;
                return;
            }
        }
    }

    public void addQuestion(QuestionAnswer question) {
        for (int i = 0; i < questionAnswers.length; i++) {
            if (questionAnswers[i] == null) {
                questionAnswers[i] = question;
                return;
            }
        }
    }

    public void printInfo() {
        System.out.printf("Товар: Имя-%s, Код товара-%d, Цена-%d рублей, В наличие %b -в %d магазинах, Рейтинг-%f по %d голосам, Время доставки-%d день , " +
                "Эксклюзыв в DNS-%b, Страна-%s, Гарантия-%d месяцев", nameTovar, indexTovara, price, available, numberOfStores, reiting, voiceReiting, timeDelivery, exclusiveInDNS, countru, garanty);
        System.out.println();
        System.out.println("Характеристики");
        for (Characteristics h : characteristics) {
            if (h != null) {
                System.out.print(h.getCharakteristikaKey() + ':' + h.getCharakteristikaValue());
                System.out.println();
            }
        }
        System.out.print("Отзывы");
        System.out.println();
        for (Otzivs h : otzivs) {
            if (h != null) {
                System.out.print(h.getNameClientOtziv() + ';' + h.getCityClientOtziv() + ";...");
                System.out.println();
            }
        }
        System.out.print("Комментарии");
        System.out.println();
        for (Comments h : comments) {
            if (h != null) {
                System.out.print(h.getNameClientComment() + ';' + h.getComment() + ";...");
                System.out.println();
            }
        }
        System.out.print("Вопрос/ответ");
        System.out.println();
        for (QuestionAnswer h : questionAnswers) {
            if (h != null) {
                System.out.print(h.getNameClientQuestion() + ';' + h.getCityClientOtziv() + ";...");
                System.out.println();
            }
        }
    }
}
