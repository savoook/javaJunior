package domashka10;

public class FractionNumberOperationClass implements FractionNumberOperation {

    @Override
    public FractionNumber add(FractionNumber a, FractionNumber b) throws NullPointerException {
        FractionNumberClass result = new FractionNumberClass();
        result.setDividend(a.getDividend() * b.getDivisor() + a.getDivisor() * b.getDividend());
        result.setDivisor(a.getDivisor() * b.getDivisor());
        return result;
    }

    @Override
    public FractionNumber sub(FractionNumber a, FractionNumber b) throws NullPointerException {
        FractionNumberClass result = new FractionNumberClass();
        result.setDividend(a.getDividend() * b.getDivisor() - a.getDivisor() * b.getDividend());
        result.setDivisor(a.getDivisor() * b.getDivisor());
        return result;
    }

    @Override
    public FractionNumber mul(FractionNumber a, FractionNumber b) throws NullPointerException {
        FractionNumberClass result = new FractionNumberClass();
        result.setDividend(a.getDividend() * b.getDividend());
        result.setDivisor(a.getDivisor() * b.getDivisor());
        return result;
    }

    @Override
    public FractionNumber div(FractionNumber a, FractionNumber b) throws NullPointerException, ArithmeticException {
        FractionNumber result = new FractionNumberClass();
        result.setDividend(a.getDividend() * b.getDivisor());
        result.setDivisor(a.getDivisor() * b.getDividend());
        return result;
    }
}
