public class MainCart {
    private String model;
    private String producer;
    private int hole;
    private String working_system;

    public MainCart(String model, String producer, int hole, String working_system) {
        this.model = model;
        this.producer = producer;
        this.hole = hole;
        this.working_system = working_system;
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

    public int getHole() {
        return hole;
    }

    public void setHole(int hole) {
        this.hole = hole;
    }

    public String getWorking_system() {
        return working_system;
    }

    public void setWorking_system(String working_system) {
        this.working_system = working_system;
    }

    public void working_system(String working_system){
        this.working_system =working_system;
        System.out.println("working_system is loaded "+working_system);
    }
}
