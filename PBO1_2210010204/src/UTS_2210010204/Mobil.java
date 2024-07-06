package UTS_2210010204;

public class Mobil {
    //membuat atribut 
    String warna,merk;
    int tahunProduksi;
    private int stok; //encapsulation private
    int beli;   

    //membuat method constructor
    //1. nama harus sama dengan class
    //2. tidak menggunakan kata kunci return dan void
    public Mobil(String merkMobil, String warnaMobil, int tahunProduksiMobil, int stokMobil){
       merk = merkMobil;
       warna = warnaMobil;
       tahunProduksi = tahunProduksiMobil;
       stok = stokMobil;
    }
    //method mutator
    void setBeliMobil (int BeliMobil){
        stok = stok + BeliMobil;
    }
    void setmerkMobil (String MerkMobil){
    merk = MerkMobil;
    }

    //polymorphism overloading
    void setBeliMobil (int BeliMobil1, int BeliMobil2){
    stok = stok + BeliMobil1 + BeliMobil2;
    }
    //method accesor
    int getStok(){
      return stok;
    }
    String getMerkMobil(){
      return merk;
    }
    
    //membuat method biasa
    public void info(){
    System.out.println("-------------------------------------");
    System.out.println("Koleksi Mobil Devi");
    System.out.println("Merk Mobil : "+merk);
    System.out.println("Warna Mobil : "+warna);
    System.out.println("Tahun Produksi Mobil : "+tahunProduksi);
}
}
