package Strukdatmateri;

public class Utss {
    static double fa,fx,fb;
    static double x;
    static double batas = 0.00001;
    static double e = 2.7182818285;

    public static void main(String[] args) {
        hitung(-1,0  ); // Range
    }

    public static double f(double x) {
        double hasil = Math.pow(e, x); // Hasil = e pangkat x --> kalau mau pangkat negatif ganti ke Math.pow(e, -x);
        return  x * hasil -1; // Rumus
    }

    public static void hitung(double a, double b){
        System.out.println("i\ta\t\t\tx\t\t\tb\t\t\tf(a)\t\tf(x)\t\tf(b)");
        int i = 1;
        while(i < 30) {


            fa = f(a);
            fb = f(b);
            double atas = a*fb - b*fa;
            double bawah = fb - fa;
            x = atas / bawah;
            fx = f(x);
            System.out.printf("%1$d\t%2$.6f\t%1$d %3$.6f\t%1$d %4$.6f\t%1$d %5$.6f\t%1$d %6$.8f\t%1$d %7$.6f\n",i,a,x,b,fa,fx,fb);
            if (fa * fx < 0) {
                b = x;
            } else {
                a = x;
            }
            if(Math.abs(fx)  <= batas){
                break;
            }
            i++;
        }

    }
}
