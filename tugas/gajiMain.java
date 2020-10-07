/**
 * gajiMain
 */
public class gajiMain {

    public static void main(String[] args) {
        dosen Andika = new dosen("12345","Andika Hilmi","GPI");
        Andika.setJumlahSKS(10);
        dosen Hamdani = new dosen("7890","Hamdani","GPI");
        Hamdani.setJumlahSKS(20);

        daftarGaji gaji = new daftarGaji(2);
        gaji.addPegawai(Andika);
        gaji.addPegawai(Hamdani);
        gaji.printGaji();
    }
}