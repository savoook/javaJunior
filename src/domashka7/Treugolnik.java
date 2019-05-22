package domashka7;

public class Treugolnik {
    private  double storonaA;
    private   double storonaB;
    private double storonaC;
    public void setStoronaA(double newStoronaA){
        this.storonaA=newStoronaA;

    }
    public void setStoronaB(double newStoronaB){
        this.storonaB=newStoronaB;

    }
    public void setStoronaC(double newStoronaC){
        this.storonaC=newStoronaC;

    }
    public double getStoronaA(){
        return storonaA;
    }
    public double getStoronaB(){
        return storonaB;
    }
    public double getStoronaC(){
        return storonaC;
    }
    public double perimetr() {
        return storonaA+storonaB+storonaC;
    }

    public double ploshad() {
        return Math.sqrt(perimetr()*(perimetr()-storonaA)*(perimetr()-storonaA)*(perimetr()-storonaA));
    }

    public void printInfo() {
        System.out.printf("Сторона1-%s, Сторона2-%s, Сторона3-%s,Площадь-%s, Периметр-%s", storonaA, storonaB, storonaC, ploshad(), perimetr());
    }
}
