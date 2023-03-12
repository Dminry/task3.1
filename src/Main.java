public class Main {
    public static void main(String[] args) {
        int m ;
        MagicBox<Integer> intMagicBox = new MagicBox<>( 3);
        intMagicBox.add(1);
        intMagicBox.add(2);
        intMagicBox.add(5);
        intMagicBox.add(9);
        Integer pick = intMagicBox.pick();
        System.out.println(pick);
    }
}