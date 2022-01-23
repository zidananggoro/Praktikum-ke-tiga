package Metodegenerik;

public class Main {
    public static void main(String[] args) {
        Cell<Integer>integerCell = new Cell<Integer>();
        Cell<String>stringCell = new Cell<>();
        integerCell.set(1);
        stringCell.set("Test");
    }
}
