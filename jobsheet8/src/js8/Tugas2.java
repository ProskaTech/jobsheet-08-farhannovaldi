package js8;

/*
 * Farhan Novaldi
 * 21343024
 * Informatika
 */
/**
 * @author Farhan_Nvl
 */
import javax.swing.JOptionPane;

public class Tugas2 {
    public static void main(String[] args) {
        int[] a = new int[11];
        String[] n = new String[11];
        int terbesar = 0;
        for (int i = 1; i + 1 <= a.length; i++) {
            System.out.println(i); // menampilkan array ke
            n[i] = JOptionPane.showInputDialog("Masukkan angka ke-" + i + " :");
            a[i] = Integer.parseInt(n[i]);
            if (terbesar > a[i]) {
                if (terbesar > a[i]) {
                    System.out.println(terbesar); // menampilkan terbesar dicommandline
                }
            } else {
                if (a[i] > a[i - 1]) {
                    terbesar = a[i];
                } else {
                    terbesar = a[i - 1];
                }
                System.out.println(terbesar); // menampilkan terbesar di commandline
            }
        }
        String hasil = "Terbesar adalah " + terbesar;
        JOptionPane.showMessageDialog(null, hasil);
    }
}
