import java.util.ArrayList;
import java.util.List;

public class HotDrinkVendingMachine implements VendingMachine{

    private final List<Product> PRODUCT_LIST;
    private int money;

    public HotDrinkVendingMachine() {
        this.PRODUCT_LIST = new ArrayList<>();
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
        if (product instanceof HotDrink){
            PRODUCT_LIST.add(product);
        }else{
            System.out.println("Этот продукт не для данного автомата!");
        }
    }

    public HotDrink getProduct(String name, int volume, int temperature){
        for (Product product : PRODUCT_LIST){
            if (product instanceof HotDrink){
                if (product.getName().equals(name) && ((HotDrink) product).getVolume() == volume &&
                        ((HotDrink) product).getTemperature() == temperature) {
                    money = product.getPrice();
                    return (HotDrink) product;
                }
            }
        }
        return null;
    }
}
