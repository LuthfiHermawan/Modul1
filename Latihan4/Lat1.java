import java.util.HashMap;
import java.util.Scanner;

public class Mahasiswa {
    String nama, kelas, MKPraktikum;
    int nim;

    public Mahasiswa(String nm, String kl, String mkp, int ni){
        nama = nm;
        kelas = kl;
        MKPraktikum = mkp;
        nim = ni;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<String, Mahasiswa> mhs = new HashMap<>();
        String input;
        Mahasiswa data;

        mhs.put("1", new Mahasiswa("Sugra", "3I", "Struktur Data",20211037));
        mhs.put("2", new Mahasiswa("Aurora", "3G", "Seni Budaya", 20211034));
        mhs.put("3", new Mahasiswa("Xavi", "3G", "Pemograman Dasar", 20211038));

        System.out.print("Masukan ID : ");
        input = in.nextLine();
        data = mhs.get(input);
        if (data != null){
            System.out.println("==Data Mahasiswa==\n" + data.nama + ", kelas : " + data.kelas + ", Mata Kuliah Praktikum : " + data.MKPraktikum + ",NIM : " + data.nim);
        }

    }
}
