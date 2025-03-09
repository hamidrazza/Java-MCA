public class MultipleInheritance extends Demo1 implements Demo2{
    private String name;
    @Override
    public void setName(String name){
        this.name = name;
    }
    @Override
    public String getName(){
        return name;
    }
    public static void main(String[] args) {
        MultipleInheritance obj = new MultipleInheritance();
        obj.setName("Hamid");
        System.out.println("Name is : " + obj.getName());
        add(3,7 );
        sub(5,2);
    }
}
class Demo1{
    public static void add(int a, int b){
        System.out.println("Addition is : " + (a+b));
    }
    public static void sub(int a, int b){
        System.out.println("Subtraction is : " + (a-b));
    }
}
interface Demo2{
    public void setName(String name);
    public String getName();
}
