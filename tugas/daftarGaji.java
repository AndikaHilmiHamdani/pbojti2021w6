/**
 * daftarGaji
 */
public class daftarGaji {
    public pegawai[] listPegawai;
    public int jmlPegawai;
    daftarGaji(int jmlPegawai){
        listPegawai = new pegawai[jmlPegawai];
    }
    public void addPegawai(pegawai pgw){
        listPegawai[jmlPegawai]=pgw;
        jmlPegawai++;
    }
    public void printGaji(){
        System.out.println("===================");
        for (int i = 0; i < jmlPegawai; i++) {
            System.out.print(listPegawai[i].getNama()+ " Mendapatkan gaji sebesar ");
            System.out.println("Rp."+listPegawai[i].getGaji(0));
        }
    }
}