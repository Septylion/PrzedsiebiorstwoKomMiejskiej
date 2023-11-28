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

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public static double getSalary() {
        return salary;
    }

    public static int getExperience() {
        return experience;
    }

    public Pracownik() {
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public static void setSalary(double salary) {
        Pracownik.salary = salary;
    }

    public static void setExperience(int experience) {
        Pracownik.experience = experience;
    }

    @Override
    public String toString() {
        return "Pracownik{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
