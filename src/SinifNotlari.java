import java.util.HashMap;
import java.util.Map;

public class SinifNotlari {
    public static void main(String[] args) {
        Map<Integer, Integer> ogrenciNotlari = new HashMap<>();

        ogrenciNotlari.put(19221200, 56);
        ogrenciNotlari.put(19221201, 35);
        ogrenciNotlari.put(19221202, 85);
        ogrenciNotlari.put(19221203, 72);
        ogrenciNotlari.put(19221204, 98);

        int minNot = Integer.MAX_VALUE;
        int maxNot = Integer.MIN_VALUE;

        for (Map.Entry<Integer, Integer> entry : ogrenciNotlari.entrySet()) {
            int not = entry.getValue();
            if (not < minNot) {
                minNot = not;
            }
            if (not > maxNot) {
                maxNot = not;
            }
        }
        System.out.println("Minimum notu alan öğrenci:");
        for (Map.Entry<Integer, Integer> entry : ogrenciNotlari.entrySet()) {
            if (entry.getValue() == minNot) {
                System.out.println("Öğrenci No: " + entry.getKey() + ", Not: " + entry.getValue());
            }
        }
        System.out.println("Maximum notu alan öğrenci:");
        for (Map.Entry<Integer, Integer> entry : ogrenciNotlari.entrySet()) {
            if (entry.getValue() == maxNot) {
                System.out.println("Öğrenci No: " + entry.getKey() + ", Not: " + entry.getValue());
            }
        }
        double toplamNot = 0;
        for (int not : ogrenciNotlari.values()) {
            toplamNot += not;
        }
        double ortalamaNot = toplamNot / ogrenciNotlari.size();
        System.out.println("Sınıfın ortalama notu: " + ortalamaNot);
    }
}