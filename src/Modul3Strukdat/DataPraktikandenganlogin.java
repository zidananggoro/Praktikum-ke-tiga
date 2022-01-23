package Modul3Strukdat;

import java.util.HashMap;
import java.util.Scanner;


public class DataPraktikandenganlogin {
    static int counter = 0;

    static Scanner scan = new Scanner(System.in);
    static HashMap<String, String> tabelData = new HashMap<>();
    static HashMap<String, String> tabelSesiLogin = new HashMap<>();

    static boolean tambahData(String nim, String namaAsisten){
        System.out.println("--Tambah Data Baru--");
        System.out.print("Masukan Nim : ");
        nim = scan.next();

        if(tabelData.containsKey(nim)){
            System.out.println("Nim sudah terdaftar");
            return false;
        }
        else{
            if(nim.contains("IF")){
                System.out.print("Masukan namaAsisten : ");
                namaAsisten = scan.next();
                tabelData.put(nim, namaAsisten);

                System.out.println("tambahData berhasil");

                counter  = counter + 2;
                return true;
            }
            else {
                System.out.println("tambahData gagal");

                return false;
            }
        }
    }

    static void tampil(){
        if(!tabelData.isEmpty()){
            System.out.println("Total Data Yang Tersimpan : " + tabelData.size());

            tabelData.keySet().forEach((key)->{
                String value = tabelData.get(key);
                System.out.println("Nim : " + key + "\tNama Asisten : " + value);
            });
        }else{
            System.out.println("Total Data Yang Tersimpan : " + tabelData.size());
        }

    }

    static void listNimPraktikan(){
        if(!tabelData.isEmpty()){
            System.out.println("--Nim Praktikan--");

            tabelData.keySet().forEach((key) -> {
                System.out.println(key);
            });
        }else{
            System.out.println("data kosong");
        }

    }

    static void listNamaAsisten(){
        if(!tabelData.isEmpty()){
            System.out.println("--Nama Asisten--");

            tabelData.values().forEach((value) -> {
                System.out.println(value);
            });
        }else{
            System.out.println("data kosong");
        }

    }

    static int totalEmail(){
        return counter;
    }

    static boolean hapusData(String nim, String namaAsisten){
        System.out.print("Masukan Nim yang ingin dihapus : ");
        String newNim = scan.next();

        if(tabelData.containsKey(newNim)){
            tabelData.remove(newNim,tabelData.get(newNim));
            counter  = counter - 2;

            System.out.println("hapusData berhasil");

            return true;
        }
        else{
            System.out.println("hapusData gagal");

            return false;
        }
    }

    static void editData(String nim, String namaAsisten){
        System.out.println("--editData--");
        System.out.print("Masukan Nim yang akan diubah: ");
        nim = scan.next();
        if(tabelData.containsKey(nim)){

            System.out.print("Masukan Nim yang baru : ");
            String newNim = scan.next();

            System.out.print("Masukan namaAsisten yang baru : ");
            namaAsisten = scan.next();

            tabelData.put(newNim, tabelData.remove(nim));
            tabelData.replace(newNim, namaAsisten);
            System.out.println("editData berhasil");
        }
        else{
            System.out.println("Nim yang akan di edit tidak terdaftar");
        }
    }

    static void search(String nim){
        System.out.print("Masukan Nim yang ingin di cari : ");
        String input = scan.next();

        if(tabelData.containsKey(input)){
            System.out.println("Nim Praktikan : " + input +"\nNama Asisten : " + tabelData.get(input));
        }
        else{
            System.out.println("Nim yang akan di edit tidak terdaftar");
        }
    }

    static void login(){
        System.out.print("Masukan Email : ");
        String email = scan.next();

        if(email.contains("@umm.ac.id")){
            System.out.print("Masukan password : ");
            String password = scan.next();

            if(tabelSesiLogin.containsKey(email) && tabelSesiLogin.containsValue(password)){
                int end = 1;
                while(end != 0){
                    System.out.println("Menu : ");
                    System.out.println("1.Tambah data ");
                    System.out.println("2.tampil");
                    System.out.println("3.List NIM Praktikan");
                    System.out.println("4.List Nama Asisten");
                    System.out.println("5.Total Data ");
                    System.out.println("6.Hapus Data");
                    System.out.println("7.Edit Data ");
                    System.out.println("8.Search");
                    System.out.println("9.Logout");

                    System.out.print("Pilihan Anda : ");
                    int pilihan = scan.nextInt();

                    switch(pilihan){
                        case 1 :
                            tambahData("","");
                            break;
                        case 2 :
                            tampil();
                            break;
                        case 3 :
                            listNimPraktikan();
                            break;
                        case 4 :
                            listNamaAsisten();
                            break;
                        case 5 :
                            System.out.println("total data key dan value yang masuk : " + totalEmail());
                            break;
                        case 6 :
                            hapusData("","");
                            break;
                        case 7 :
                            editData("","");
                            break;
                        case 8 :
                            search("");
                            break;
                        case 9 :
                            logout();
                            break;
                        default :
                            System.out.println("Pilihan tidak tersedia");
                            break;
                    }
                    System.out.print("lanjutkan operasi ?\nInput 0 untuk mengakhiri program");
                    System.out.println("pilihan anda : ");
                    end = scan.nextInt();
                }
            }
            else{
                System.out.println("email atau password salah");
            }
        }
        else{
            System.out.println("email tidak memiliki frasa yang dibutuhkan");
        }
    }

    static void logout(){
        System.exit(0);
    }

    public static void main(String args[]){
        tabelSesiLogin.put("zidan@umm.ac.id","gampang123");
        login();
    }
}
