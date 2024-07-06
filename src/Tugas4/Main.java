
package Tugas4;


public class Main {
    
    public static void main(String[] args) {
        Hero hero1 = new Hero();
        hero1.name = "Layla";
        hero1.skill = "roll";
        hero1.getBatrey();
        hero1.display();
        System.out.println("===============================");
        
        Herosui hero2 = new Herosui();
        hero2.name = "Queen";
        hero2.skill = "Killing";
        hero2.setBatrey(20);
        hero2.display();
        System.out.println("===============================");
        
        Hero hero3 = new Hero();
        hero3.display();
    }
    
}
