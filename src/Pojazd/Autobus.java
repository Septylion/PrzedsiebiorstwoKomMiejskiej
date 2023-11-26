package Pojazd;
public class Autobus {
    String model;
    int num_of_seat;
    double milage;
    String registration;

    int num_of_line;

    public Autobus(String model, int num_of_seat, double milage, String registration, int num_of_line) {
        this.model = model;
        this.num_of_seat = num_of_seat;
        this.milage = milage;
        this.registration = registration;
        this.num_of_line = num_of_line;
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
