public class Kasa {
    private String model;
    private String producer;
    private String material;
    private int hole_count;


    public Kasa(String model, String producer, int hole_count, String material) {
        this.model = model;
        this.producer = producer;
        this.hole_count = hole_count;
        this.material = material;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getHole_count() {
        return hole_count;
    }

    public void setHole_count(int hole_count) {
        this.hole_count = hole_count;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    public void open_comp(){
        System.out.println("Comp is opening..");
    }
}
