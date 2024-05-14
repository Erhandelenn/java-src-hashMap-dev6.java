import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OgrenciSilme {
    public static void main(String[] args) {

        Map<Integer, Integer> ogrenciNotlari = new HashMap<>();

        ogrenciNotlari.put(1922123, 56);
        ogrenciNotlari.put(1922124, 35);
        ogrenciNotlari.put(1922125, 85);
        ogrenciNotlari.put(1922126, 72);
        ogrenciNotlari.put(1922127, 98);

        System.out.println(ogrenciNotlari);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Silinecek öğrenci numarasını giriniz: ");
        int ogrenciNo = scanner.nextInt();

        if (ogrenciNotlari.containsKey(ogrenciNo)) {
            yazdirOgrenciBilgileri(ogrenciNo, ogrenciNotlari.get(ogrenciNo));

            ogrenciNotlari.remove(ogrenciNo);
            System.out.println("Öğrenci başarıyla silindi.");

            System.out.println("Güncellenmiş Öğrenci Listesi:");
            for (Map.Entry<Integer, Integer> entry : ogrenciNotlari.entrySet()) {
                yazdirOgrenciBilgileri(entry.getKey(), entry.getValue());
            }
        } else {
            System.out.println("Girilen öğrenci numarasına sahip bir öğrenci bulunamadı.");
        }
        scanner.close();
    }
    public static void yazdirOgrenciBilgileri(int ogrenciNo, int not) {
        System.out.println("Öğrenci Numarası: " + ogrenciNo);
        System.out.println("Not: " + not);
    }
}