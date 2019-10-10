public class AMultiDimensi {
    public static void main(String[] args) {
        String[][] arrChar = new String[2][];
        arrChar[0] = new String[2];
        arrChar[1] = new String[3];

        // Dimensi 1 yang indeksnya 0 memiliki panjang elemen 2
        arrChar[0][0] = "Java";
        arrChar[0][1] = ".Net";
        // Dimensi 1 yang indeksnya 1 memiliki panjang elemen 3
        arrChar[1][0] = "PHP";
        arrChar[1][1] = "C#";
        // Tampilkan semua data dari dimensi 1 yang memiliki indeks 0
        System.out.println("Bootcamp31 : " + arrChar[0][0]);
    }
}
