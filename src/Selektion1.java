

public class Selektion1 {
    public static void main(String[] args) {
        int x = 5;
        int y = 8;
        int z = 3;
// Forventet output er true
        boolean a = x <= 5 && z != y;
        System.out.println("Opgave 1A er " + a);

        if (a == true){
            System.out.println("Pass" );
        }else{
            System.out.println("failed");
        }
    }
}
