public class TestIf {
    String nama, makanan;

    public static void main(String[] args){
        // Membuat Objek dari Class tutorial_dasar
        TestIf Hewan = new TestIf();
        System.out.println("====== KUCING =======");
        Hewan.Kucing();
        System.out.println("====== KAMBING ======");
        Hewan.Kambing();
    }
    //VOID
    void Kucing(){
        nama = "Carberus";
        makanan = "Daging";
        System.out.println("Nama Kucing Saya Adalah "+nama);
        System.out.println("Kucing Saya Suka Makan "+makanan);
    }
    //VOID
    void Kambing(){
        nama = "Amaterasu";
        makanan = "Rumput";
        System.out.println("Nama Kambing Saya Adalah "+nama);
        System.out.println("Kambing Saya Suka Makan "+makanan);
    }
}