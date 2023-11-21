package Pracownicy;

public class Pracownik {
    String name;
    String surname;

    static double salary;

    static int experience;

    public Pracownik(String name, String surname, double salary, int experience) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Pracownik{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
