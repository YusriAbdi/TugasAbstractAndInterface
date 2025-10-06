public class Anggrek extends Bunga implements Harum{
    Anggrek(String w){
        super("Anggrek itu", w);
    };

    public void infoAnggrek(){
        System.out.println("Anggrek atau Orchidaceae merupakan satu \n" + 
        "suku tumbuhan berbunga dengan anggota jenis terbanyak. \n" + 
        "Jenis-jenisnya tersebar luas dari daerah tropika basah\n"+
        "hingga wilayah sirkumpolar, meskipun sebagian besar anggotanya\n" +
        "ditemukan di daerah tropika. Kebanyakan anggota suku\n" + 
        "ini hidup sebagai epifit, terutama yang berasal dari daerah tropika.\n");
    }

    @Override
    void Mekar(){
        System.out.println("Bunga Anggreknya mekar berwarna " + warna);
    };

    @Override
    public void Aromanya() {
        System.out.println(nama + " menyebarkan aroma yang menyegarkan.");
    }
}
