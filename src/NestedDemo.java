abstract class OuterClass {
    int num = 15;
    abstract void getNum();
}
public class NestedDemo{
    public static void main(String[] args) {
        OuterClass obj = new OuterClass() {
            @Override
            void getNum(){
                System.out.println("The current num is : " + num);
            }
        };
        obj.getNum();
    }
}