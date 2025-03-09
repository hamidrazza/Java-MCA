class Species {
    private int legs;
    private int hands;

    Species(int legs, int hands) {
        this.legs = legs;
        this.hands = hands;
    }

    public void pwdHands() {
        hands -= 1;
    }

    public void pwdLegs() {
        legs -= 1;
    }

    public String toString() {
        return ("No. of hands are " + hands + "\n" + "No. of legs are " + legs);
    }
}

class Humans extends Species {
    protected String name;

    public Humans(String name, int legs, int hands) {
        super(legs, hands);
        this.name = name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    @Override
    public String toString() {
        return ("Name is " + name + "\n" + super.toString());
    }
}
class RichHumans extends Humans{
    private String car;
    private String business;
    RichHumans(String name, int legs, int hands){
        super(name, legs, hands);
    }
    public void setCar(String car){
        this.car = car;
    }
    public void setBusiness(String businessName){
        this.business = businessName;
    }
    @Override
    public String toString(){
        return (super.toString() + "\nCar name is " + car + "\nBusiness is " + business);
    }
}
class Insects extends Species{
    private String name;
    Insects(int legs, int hands){
        super(legs, hands);
    }
    public void setName(String newName){
        this.name = newName;
    }
    @Override
    public String toString(){
        return ("Insect name is " + name + "\n" + super.toString());
    }
}

public class DemoInheritance {
    public static void main(String[] args) {
        // Humans aman = new Humans("Aman", 2, 2);
        // System.out.println(aman.toString());
        // Insects spider = new Insects(8,0);
        // spider.setName("Spider");
        // System.out.println(spider.toString());

        RichHumans demo = new RichHumans("sahil", 2, 2);
        demo.setCar("Lambo");
        demo.setBusiness("Spicy Restaurant");

        System.out.println(demo.toString());
        
    }
}