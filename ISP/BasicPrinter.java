package ISP;

public class BasicPrinter implements IPrint {
    @Override
    public void print(String content) {
        System.out.println("Printing: " + content);
    }
}