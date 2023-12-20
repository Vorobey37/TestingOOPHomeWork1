import java.util.List;

public class BottleOfWaterWendingMachine implements VendingMachine{

    private final List<Product> PRODUCT_LIST;
    private int money;

    public BottleOfWaterWendingMachine(List<Product> productList) {
        this.PRODUCT_LIST = productList;
        this.money = 0;
    }

    @Override
    public Product getProduct(String name) {
        for (Product product : PRODUCT_LIST) {
            if (product.getName().equals(name)){
                money = product.getPrice();
                return product;
            }
        }
        return null;
    }

    @Override
    public void addProduct(Product product) {
        if (product instanceof BottleOfWater){
            PRODUCT_LIST.add(product);
        }else{
            System.out.println("Этот продукт не для данного автомата!");
        }
    }

    public BottleOfWater getProduct(String name, int volume){
        for (Product product : PRODUCT_LIST){
            if (product instanceof BottleOfWater){
                if (product.getName().equals(name)&&((BottleOfWater) product).getVolume() == volume){
                    money = product.getPrice();
                    return (BottleOfWater) product;
                }
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "BottleOfWaterWendingMachine{" +
                "PRODUCT_LIST=" + PRODUCT_LIST +
                ", money=" + money +
                '}';
    }
}
