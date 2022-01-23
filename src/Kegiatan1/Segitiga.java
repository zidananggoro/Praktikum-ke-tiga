package Kegiatan1;

public class Segitiga<T extends Number > {
    private T luas;



    Segitiga(T luas){
        this.luas = luas;
    }

    int getResultAsInt(){
        return luas.intValue();
    }

    double getResultAsDoble(){
        return luas.doubleValue();
    }
}
