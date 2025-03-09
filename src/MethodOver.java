class MethodOver {
    public static void main(String[] args) {
        multiply(3,5);
        multiply(2.5,3.1);
    }

    public static void multiply(int a, int b) {
        System.out.println("Multiply is (int): " + (a*b));
    }
    public static void multiply(double a, double b) {
        System.out.println("Multiply is (double): " + (a*b));
    }
}