public class Main {

    public static void main(String[] args) {

        Product product1 = new HotDrink("Ахмат", 50, 200, 90);
        Product product2 = new HotDrink("Капучино", 100, 200, 75);
        Product product3 = new HotDrink("Американо", 75, 100, 80);
        Product product4 = new BottleOfWater("Серебряная роса", 60, 1500);
        Product product5 = new BottleOfWater("Липтон", 200, 2000);
        Product product6 = new HotDrink("Горячий шоколад", 70, 200, 65);
        Product product7 = new HotDrink("Эспрессо", 90, 200, 90);

        HotDrinkVendingMachine machine = new HotDrinkVendingMachine();

        machine.addProduct(product1);
        machine.addProduct(product2);
        machine.addProduct(product3);
        machine.addProduct(product4);
        machine.addProduct(product5);
        machine.addProduct(product6);
        machine.addProduct(product7);

        System.out.println(machine.getProduct("Капучино", 200, 75));
        System.out.println(machine.getProduct("Ахмат", 20, 90));
    }
}