public class AbstractDemo extends Footwear{
    @Override
    public void setType(String type){
        this.type = type;
    }
    public static void main(String[] args) {
        AbstractDemo demo = new AbstractDemo();
        demo.setType("Slippers");
        System.out.println("The type of footware is : " + demo.getType());
    }
}
abstract class Footwear{
    protected String type;
    public abstract void setType(String type);
    public String getType(){
       return type;
    }
}