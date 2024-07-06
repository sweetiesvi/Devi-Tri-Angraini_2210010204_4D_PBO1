package UTS_2210010204;

public class MobilTerbaruMain {
  public static void main(String[] args){
      MobilTerbaru mobilku = new MobilTerbaru("Xenia","Silver",2024,3);
      mobilku.info();
      mobilku.setBeliMobil(2);
      mobilku.stok=1;
      mobilku.info();
      mobilku.setStok(3);
      mobilku.info();
  }  
}
