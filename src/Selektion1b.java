public class Selektion1b {
    public static void main(String[] args) {
        int x = 5;
        int y = 8;
        int z = 3;
        boolean a = x == 5 || x == y && z == 3;
        System.out.println(a);

        if (a == true){
            System.out.println("Pass" );
        }else{
            System.out.println("failed");
        }
    }
}
