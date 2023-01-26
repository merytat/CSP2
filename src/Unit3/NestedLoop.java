package Unit3;

public class NestedLoop {
    public static void main(String[] args) {
        //external loop
        for (int i = 4; i >= 1; i--) {//loop 4 times 1 per row
            //internal loop
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
