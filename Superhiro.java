
package pbo;

//inheritance
public class Superhiro extends Hero{
     //overriding
    public Superhiro(String name, String id, int level) {
        super(name, id, level);
    }
    
    public String getAsalNegara(){
        String kodeNeg = getId().substring(0, 2);
        //seleksi if
        if (kodeNeg.equals("11")){
            return "Prancis";
        }else {
            return "Negara Lain";
        }
    }
    
    public int getTahunDaftar(){
        return Integer.parseInt(getId().substring(2, 4))+2000;
    }
    
    public String getClan(){
        String kodeClan = getId().substring(4, 6);
        //seleksi switch
        switch(kodeClan){
            case "01":   
                return "Empire";
            case "02":   
                return "Kingdom";
            case "03":   
                return "Castle";
            default:
                return "Clan lain";
        }
    }
    public int getUrutanHero(){
        return Integer.parseInt(getId().substring(6));
    }
    
    //polymorphism overriding

    @Override
    public String display() {
        return super.display()+ //To change body of generated methods, choose Tools | Templates.
                "\nNegara Asal = "+getAsalNegara()+
                "\nTahun Pembuatan = "+getTahunDaftar()+
                "\nCode Clan = "+getClan()+
                "\nUrutan Hero = "+getUrutanHero();
                }
    
    }