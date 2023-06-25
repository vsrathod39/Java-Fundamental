package inheritance;

public class Book implements Product {
    protected String productName;

    @Override
    public void getName() {
        System.out.println("Product: " + this.productName + " " + this.author);
    }

    @Override
    public void setName(String productName) {
        this.productName = productName;
    }
}
