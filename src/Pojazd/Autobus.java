public class Autobus {
   private String model;
    private int num_of_seat;
    private double milage;
    private String registration;

    int num_of_line;

    public Autobus(String model, int num_of_seat, double milage, String registration, int num_of_line) {
        this.model = model;
        this.num_of_seat = num_of_seat;
        this.milage = milage;
        this.registration = registration;
        this.num_of_line = num_of_line;
    }

    public String getModel() {
        return model;
    }

    public int getNum_of_seat() {
        return num_of_seat;
    }

    public double getMilage() {
        return milage;
    }

    public String getRegistration() {
        return registration;
    }

    public int getNum_of_line() {
        return num_of_line;
    }

    public Autobus() {
    }

    @Override
    public String toString() {
        return "Autobus{" +
                "model='" + model + '\'' +
                ", num_of_seat=" + num_of_seat +
                ", milage=" + milage +
                ", registration='" + registration + '\'' +
                ", num_of_line=" + num_of_line +
                '}';
    }
}
