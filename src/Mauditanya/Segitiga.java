package Mauditanya;

public class Segitiga<A extends Number,E extends Number> {
    private A a;
    private E e;

    Segitiga(A a,E e){
        this.a =a;
        this.e =e;
    }

    int samadengan(){
        return (a.intValue() * e.intValue())/2;
    }
}
