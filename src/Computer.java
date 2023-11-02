public class Computer {
    private Monitor monitor;
    private Kasa kasa;
    private MainCart mainCart;

    public Computer(Monitor monitor, Kasa kasa, MainCart mainCart) {
        this.monitor = monitor;
        this.kasa = kasa;
        this.mainCart = mainCart;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Kasa getKasa() {
        return kasa;
    }

    public void setKasa(Kasa kasa) {
        this.kasa = kasa;
    }

    public MainCart getMainCart() {
        return mainCart;
    }

    public void setMainCart(MainCart mainCart) {
        this.mainCart = mainCart;
    }
}
