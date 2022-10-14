package js8;

/*
 * Farhan Novaldi
 * 21343024
 * Informatika
 */
/**
 * @author Farhan_Nvl
 */
public class Tugas3 {
    public static void main(String[] args) {
        String[][] buku = {
                { "Florence", "735-1234", "Manila" },
                { "Joyce", "983-3333", "Quezon City" },
                { "Becca", "456-3322", "Manila" }
        };
        for (int i = 0; i < buku.length; i++) {
            System.out.println("\nName : " + buku[i][0]);
            System.out.println("Tel : " + buku[i][1]);
            System.out.println("Adress : " + buku[i][2]);
        }
    }
}
