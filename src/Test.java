public class Test {
    public static void main(String[] args) {
Resalution resalution  = new Resalution(1920,1080);
Monitor monitor = new Monitor("VS197DE","ASUS","10.5",resalution);
Kasa kasa = new Kasa("Shadow Blade","Shadow",2,"Temperli Cam");
MainCart mainCart = new MainCart("B250-PRO","ASUS",10,"Window 10");

Computer pc = new Computer(monitor,kasa,mainCart);
pc.getKasa().open_comp();
pc.getMonitor().shutDown();
pc.getMainCart().working_system("ubuntu 16.04");

    }
}
