package domashka10;

public class Main {
    public static void main(String[] args) {
        FractionNumberClass fractionNumberClass1 = new FractionNumberClass(2, 3);
        FractionNumberClass fractionNumberClass2 = new FractionNumberClass(5, 6);
        FractionNumberOperationClass calculator = new FractionNumberOperationClass();
        FractionNumber resultAdd = calculator.add(fractionNumberClass1, fractionNumberClass2);
        FractionNumber resultSub = calculator.sub(fractionNumberClass1, fractionNumberClass2);
        FractionNumber resultMul = calculator.mul(fractionNumberClass1, fractionNumberClass2);
        FractionNumber resultDiv = calculator.div(fractionNumberClass1, fractionNumberClass2);
        System.out.printf("Первая дробь:%s,вторая дробь:%s, результат сложения:%s, результат вычитания:%s, результат перемножения:%s," +
                "результат деления:%s",fractionNumberClass1, fractionNumberClass2, resultAdd, resultSub, resultMul, resultDiv);
    }
}