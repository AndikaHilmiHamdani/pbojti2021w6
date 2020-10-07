/**
 * pegawai
 */
public class pegawai {

    public String nip,alamat,nama;
    public  int jumlahSKS, tarif_SKS=200000;
    protected pegawai(){

    }
    protected pegawai(String nip, String nama,String alamat){
        this.nip = nip;
        this.nama = nama;
        this.alamat = alamat;
    }
    public String getNama() {
        return nama;
    }
    public int getGaji(int totalGaji){
        return totalGaji = jumlahSKS * tarif_SKS;
    }
}