package lesson5;

public class Student {
    //модификатор доступа (4 вида)
    //стачичность (принадлежность или государственная собственность)
    //возвращаемый тип
    //название метода
    //входящие параметры
    public static void printHello() {
        System.out.println("Hello!!!");
    }
    public static int squareArea(int storona){
        return storona*storona;
    }
    public static int perimetrTreugolnika(int storona1, int storona2, int storona3){
        return storona1+storona2+storona3;
    }

}