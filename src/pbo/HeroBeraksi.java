
package pbo;

import java.util.Scanner; //untuk membuat scanner
public class HeroBeraksi {
    public static void main(String[] args) {
        //object
        //Hero hero1 = new Hero("Alpha","1120020908",3);
        
        //System.out.println(hero1.display());
        //System.out.println("=========================================");
        //System.out.println(hero1.display("Kill"));
        
        //error handling 
        try{
            //input output sederhana
        Scanner scanner = new Scanner(System.in);
        
        //array
        Superhiro[] hero1 = new Superhiro[2];
        
        //perulangan sederhana
        for(int i=0; i<hero1.length; i++){
        System.out.print("Masukan Nama Hiro "+(i+1)+": ");
        String name = scanner.nextLine();
        System.out.print("Masukan ID "+(i+1)+": ");
        String id = scanner.nextLine();
        System.out.print("Masukan Level "+(i+1)+": ");
        int level = scanner.nextInt();
        scanner.nextLine();
            System.out.println("--------------------------------");
        
        //object
        hero1[i] = new Superhiro (name, id, level);
        }
        
        //perulangan
        for(Superhiro data: hero1){
            System.out.println("================================");
            System.out.println("Data Hero");
            System.out.println(data.display());
   
        }
    
    }catch (NumberFormatException e){
            System.out.println("Kesalahan Format Nomor : "+e.getMessage());
    }catch (StringIndexOutOfBoundsException e){
            System.out.println("Kesalahan Format ID : "+e.getMessage());
    }
        catch (Exception e){
            System.out.println("Tampilkan Error = "+e.getMessage());
    }           
  }
}
