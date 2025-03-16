import java.util.Scanner;

public class PencarianArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kata yang dicari: ");
        String keyword = scanner.nextLine();
        System.out.print("Masukkan jumlah elemen array: ");
        int n = scanner.nextInt();
        String[] variableArray = new String[n];
        scanner.nextLine(); // Clear buffer

        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan elemen ke-" + (i + 1) + ": ");
            variableArray[i] = scanner.nextLine();
        }

        new CariKataArray(keyword, variableArray).cari();
    }
}
