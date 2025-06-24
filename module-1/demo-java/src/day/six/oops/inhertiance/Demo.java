package day.six.oops.inhertiance;

public class Demo {
    public static void main(String[] args) {
        Tata tata = new Tata();
        tata.breaks();
        tata.tyres();

        Bmw bmw = new Bmw();
        bmw.breaks();
        bmw.tyres();


        TataSuv tataSuv = new TataSuv();
        tataSuv.breaks();
        tataSuv.tyres();
    }
}
