/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        Block block = new Block(3);

        block.addBedType(0, 3);
        block.addPerson(0, "kiran vellanki", 22, "kiranvellanki510@gmail.com", "19MIS1089");

        block.addBedType(1, 3);
        block.addPerson(1, "kiran", 22, "akl@gmail.com", "19MIS1089");
        block.getDetails(1);

    }
}