package domashka8;

public class Main {
    public static void main(String[] args) {
        Tovar acelineS_40_серебристый = new Tovar();
        acelineS_40_серебристый.setNameTovar("acelineS_40_серебристый");
        acelineS_40_серебристый.setIndexTovara(1144956);
        acelineS_40_серебристый.setPrice(1499);
        acelineS_40_серебристый.setAvailable(true);
        acelineS_40_серебристый.setReiting(3.9);
        acelineS_40_серебристый.setNumberOfStores(17);
        acelineS_40_серебристый.setVoiceReiting(16);
        acelineS_40_серебристый.setTimeDelivery(1);
        acelineS_40_серебристый.setExclusiveInDNS(true);
        acelineS_40_серебристый.setCountru("Китай");
        acelineS_40_серебристый.setGaranty(12);

        //Description

        Characteristics supportHigh_definitionVideo = new Characteristics();
        supportHigh_definitionVideo.setCharakteristikaKey("Поддержка видео высокой четкости");
        supportHigh_definitionVideo.setCharakteristikaValue("Full HD");

        Characteristics maximumVideoResolution = new Characteristics();
        maximumVideoResolution.setCharakteristikaKey("Максимальное разрешение видеосъёмки");
        maximumVideoResolution.setCharakteristikaValue("1920 x1080");

        Characteristics numberOfFramesAtMaximumResolution = new Characteristics();
        numberOfFramesAtMaximumResolution.setCharakteristikaKey("Число кадров при максимальном разрешении");
        numberOfFramesAtMaximumResolution.setCharakteristikaValue("30 кадр./сек");

        acelineS_40_серебристый.addChracteristic(supportHigh_definitionVideo);
        acelineS_40_серебристый.addChracteristic(maximumVideoResolution);
        acelineS_40_серебристый.addChracteristic(numberOfFramesAtMaximumResolution);

        Otzivs otziv1 = new Otzivs();
        otziv1.setNameClientOtziv("Павел");
        otziv1.setCityClientOtziv("Балашиха");
        //...

        acelineS_40_серебристый.addOtziv(otziv1);

        Comments comment1 = new Comments();
        comment1.setNameClientComment("Павел");
        comment1.setComment("Отлично");
        //...

        acelineS_40_серебристый.addComment(comment1);

        QuestionAnswer question1 = new QuestionAnswer();
        question1.setNameClientQuestion("Павел");
        question1.setCityClientOtziv("Балашиха");
        //...

        acelineS_40_серебристый.addQuestion(question1);

        acelineS_40_серебристый.printInfo();
    }
}
