
package pbo;


public class Hero {
    //atribut dan enkapsulasi
    protected String name, id;
    protected int level;

    //consructor
    public Hero(String name, String id, int level) {
        this.name = name;
        this.id = id;
        this.level = level;
    }
    
    //mutator
    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    //accesor
    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getLevel() {
        return level;
    }
    
    //polymorphism overloading 
    public String display(){
    return "\nNama Hero : "+getName() +"\nID Hero : "+getId() +"\nLevel Hero : "+getLevel();
    }
    
    public String display(String skill){
        return display() + "\nSkill : "+skill;
    }
}
