public class Mawar extends Bunga implements Harum{
    Mawar(String w){
        super("Mawar itu", w);
    };

    public void infoMawar(){
        System.out.println("Mawar, tusak atau ros adalah tumbuhan perdu\n" +
        "yang pohon dan batangnya berduri, daunnya majemuk dengan tepi\n" + 
        "bergerigi, bunganya berbau harum dan beraneka warna, mulai dari\n" +
        "merah, putih, bahkan hitam, serta memiliki kelopak yang bersusun.\n" + 
        "Mawar liar terdiri dari 100 spesies lebih, kebanyakan tumbuh di \n" +
        "belahan bumi utara yang berudara sejuk.\n");
    };

    @Override
    void Mekar(){
        System.out.println("Bunga Mawarnya mekar berwarna " + warna);
    };

    @Override
    public void Aromanya() {
        System.out.println(nama + " menyebarkan aroma yang wangi dan menenangkan.");
    }
}
