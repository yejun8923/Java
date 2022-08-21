package test3;

public class Ex03 {
    public static void main(String[] args) {
        ShapePrinter printer = new ShapePrinter();

        printer.prinTriangle(3);
        System.out.println("---------");
        printer.prinTriangle(5);
        System.out.println("---------");
        printer.prinTriangle(15);
    }
}
