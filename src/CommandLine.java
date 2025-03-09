class CommandLine {
    public static void main(String[] args) {
        try{
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);

            System.out.println(a + " is assigned using CommandLine Argument");
            System.out.println(b + " is also assigned using CommandLine Argument");
        }
        catch(Exception e){
            System.out.println("Please provide the command-line arguments");
        }
    }
}