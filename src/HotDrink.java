public class HotDrink extends Product{

    private int volume;
    private int temperature;

    public HotDrink(String name, int price) {
        super(name, price);
    }

    public HotDrink(String name, int price, int volume, int temperature) {
        super(name, price);
        this.volume = volume;
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "HotDrink{" +
                "temperature=" + temperature + " name=" + getName() + " price=" + getPrice() +
                "volume=" + volume + '}';
    }
}
