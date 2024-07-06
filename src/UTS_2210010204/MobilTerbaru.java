package UTS_2210010204;

//membuat inheritance (pewarisan)
public class MobilTerbaru extends Mobil{
    int pembaharuan;
    int stok;
    
    public MobilTerbaru(String merkMobil, String warnaMobil, int tahunProduksiMobil, int stokMobil){
        super(merkMobil, warnaMobil, tahunProduksiMobil, stokMobil);
    }
    
    //method mutator 
    void setStok(int pembaharuan){
        this.pembaharuan = pembaharuan;
        stok = getStok()+pembaharuan;
    }
    
    //method acessor
    @Override
    int getStok(){
        return stok;
    }
    
    int getPembaharuan(){
        return pembaharuan;
    }
    
    @Override
    public void info(){
        super.info();
        System.out.println("Bertambahnya Mobil Devi = "+getPembaharuan());
        System.out.println("Total Mobil Devi = "+getStok());
    }
}
