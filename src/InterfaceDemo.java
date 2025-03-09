public class InterfaceDemo implements Demo {

    @Override
    public int incrementNum(int num) {
        return (num += 1);
    }

    @Override
    public int decrementNum(int num) {
        return (num -= 1);
    }

    @Override
    public int doubleNum(int num) {
        return (num *= num);
    }

    public static void main(String[] args) {
        InterfaceDemo obj = new InterfaceDemo();
        int num = 5;
        System.out.println("Num = " + num);

        System.out.println("After increment the num = " + obj.incrementNum(num));

        System.out.println("After doubling the num = " + obj.doubleNum(num));

        System.out.println("After decrement the num = " + obj.decrementNum(num));
    }
}

interface Demo {

    int incrementNum(int n);

    int decrementNum(int n);

    int doubleNum(int n);
}