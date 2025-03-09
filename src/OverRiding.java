class OverRiding extends Demo{
    public static void main(String[] args) {
        echo();
        Demo.echo();
    }
    static void echo(){
        System.out.println("Hello, from Base Class");
    }
}
class Demo{
    static void echo(){
        System.out.println("Hello, from Parent Class");
    }
}