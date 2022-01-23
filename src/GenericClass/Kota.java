package GenericClass;

public class Kota<E> {
    private E elemet;

    public Kota(E kota){
        elemet = kota;
    }

    public E getElemet(){
        return elemet;
    }

    public static void main(String[] args) {
        Kota<Integer> jumlahKota = new Kota<Integer>(9);
        Kota<String> namaKota = new Kota<String>("Malang");
        System.out.println("Jumlah Kota di jawa timur :" + jumlahKota.getElemet()+"kota");
        System.out.println("Salah satu kota di jawa timur : kota "+ namaKota.getElemet());
    }
}
