package UTS_2210010204;

public class MobilBeraksi {
    public static void main(String[] args){
        //membuat object
        Mobil mobilku = new Mobil("Toyota","Hitam",2023,2);
        mobilku.info();
        mobilku.setBeliMobil(1);
        mobilku.beli=1;
        mobilku.info();
        mobilku.setmerkMobil("Rush");
        mobilku.info();
        
        System.out.println("=====================================");
        System.out.println("Koleksi Mobil Devi = "+mobilku.getStok());
    }
    
}
