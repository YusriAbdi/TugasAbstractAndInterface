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

        System.out.println("\n======== Daftar Anggrek izzat ========");

        Anggrek[] warna = new Anggrek[3];
        warna[0] = new Anggrek(Warna[1]);
        warna[1] = new Anggrek(Warna[2]);
        warna[2] = new Anggrek(Warna[5]);

        for (Anggrek a : warna) {
            a.Mekar();
            a.Aromanya();
            a.infoAnggrek();
            System.out.println();
        }

        System.out.println("\n======== Daftar Mawar  ========");

        Mawar[] warnaMawar = new Mawar[3];
        warnaMawar[0] = new Mawar(Warna[0]);
        warnaMawar[1] = new Mawar(Warna[3]);
        warnaMawar[2] = new Mawar(Warna[4]);

        for (Mawar a : warnaMawar) {
            a.Mekar();
            a.Aromanya();
            a.infoMawar();
            System.out.println();
        }
    }
}
