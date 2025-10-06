public class Main {
    public static void main(String[] args) {
        String[] Warna = {"Merah", "Ungu", "Putih", "Hitam", "Biru", "Kuning"};

        Anggrek anggrekUngu = new Anggrek(Warna[1]);
        anggrekUngu.Mekar();
        anggrekUngu.Aromanya();
        anggrekUngu.infoAnggrek();

        System.out.println(" ");

        Mawar mawarMerah = new Mawar(Warna[0]);
        mawarMerah.Mekar();
        mawarMerah.Aromanya();
        mawarMerah.infoMawar();
    }
}
