
package Tugas4;

public class Hero {
    public String name, skill;
    protected int batrey; //enkapsulasi yaitu menyembunyikan suatu proses data dalam sistem
    
    //Polymorphism adalh kemampuan untuk memperlakukan object yang memiliki perilaku berbeda
    // overloading construktor adalah kemampuan untuk menggunakan nama yang sama utk beberapa method
    Hero(String name, String skill, int batrey){
        this.name = name;
        this.skill = skill;
        this.batrey = batrey;
    }
    Hero(){
        this.name = "Alexander";
        this.skill = "killing";
        this.batrey = 20;
    }
        void setBatrey(int pertambahanBatrey){
        batrey = batrey + pertambahanBatrey;
    }
        int getBatrey(){
            return this.batrey;
        }
        
        void display(){
            System.out.println("Nama Hiro = "+this.name);
            System.out.println("Skill Hiro = "+this.skill);
            System.out.println("Batrey Hiro = "+this.batrey);
        }
}
