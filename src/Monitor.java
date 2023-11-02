public class Monitor {
    private String model;
    private String producer;
    private String height;
    private Resalution resalution;
public  void shutDown(){
    System.out.println("Monitor is shutting down.");
}
    public Monitor(String model, String producer, String height, Resalution resalution) {
        this.model = model;
        this.producer = producer;
        this.height = height;
        this.resalution = resalution;
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

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public Resalution getResalution() {
        return resalution;
    }

    public void setResalution(Resalution resalution) {
        this.resalution = resalution;
    }
}
