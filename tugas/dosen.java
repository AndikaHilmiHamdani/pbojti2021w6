/**
 * dosen
 */
public class dosen extends pegawai {

    public  int jumlahSKS, tarif_SKS=200000;
    protected dosen(){

    }
    protected dosen(String nip,String nama, String alamat){
        super(nip, nama, alamat);
    }
    public void setJumlahSKS(int jumlahSKS) {
        this.jumlahSKS = jumlahSKS;
    }
    public int getGaji(int totalGaji){
        return totalGaji = jumlahSKS * tarif_SKS;
    }
}