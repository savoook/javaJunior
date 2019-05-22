package lesson8;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Tovar blender = new Tovar();
        blender.setNameTovar("Philips");
        blender.setIdTovara(854565);
        blender.setFixprice(9555);
        blender.setDiscount(19);
        blender.setAvalieble(true);

        Charakteristika value = new Charakteristika();
        value.setKey("Объём");
        value.setValue("0.8");

        Charakteristika color = new Charakteristika();
        color.setKey("Цвет");
        color.setValue("белый");

        blender.addCharakteristika(value);
        blender.addCharakteristika(color);

        Otziv otziv1 = new Otziv();
        otziv1.setComments("Отлично");
        otziv1.setAges(21);
        otziv1.setBuyInOzon(true);
        otziv1.setDataComments(new Date());
        otziv1.setDislike(4);
        otziv1.setLike(21);
        otziv1.setMinus("-");
        otziv1.setPlus("+");
        otziv1.setNameClient("Pavel");
        otziv1.setReiting(5.9);

        blender.addOtziv(otziv1);

        blender.printInfo();
    }
}
