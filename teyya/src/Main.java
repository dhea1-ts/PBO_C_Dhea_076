import java.util.Scanner;

class CariKataArray {
    private String keyword;
    private String[] variableArray;

    public CariKataArray(String keyword, String[] variableArray) {
        this.keyword = keyword;
        this.variableArray = variableArray;
    }

    public void cari() {
        int indeks = -1, banyakKarakter = 0;

        for (int i = 0; i < variableArray.length; i++) {
            if (variableArray[i].equals(keyword)) {
                indeks = i;
                banyakKarakter++;
            }
        }

        if (banyakKarakter > 0) {
            System.out.println("Kata '" + keyword + "' ditemukan di indeks " + indeks + " sebanyak " + banyakKarakter + " kali.");
        } else {
            System.out.println("Kata '" + keyword + "' tidak ditemukan.");
        }
    }
}

