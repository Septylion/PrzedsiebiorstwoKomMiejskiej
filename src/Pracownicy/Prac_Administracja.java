package Pracownicy;

public class Prac_Administracja extends Pracownik{
    int id;

    public Prac_Administracja(String name, String surname, double salary,int experience) {
        super(name, surname, salary,experience);
        this.id = id;

    }
    public static double Count_salary_adm(){
        return (salary * 2 + (salary * (experience / 100)));
    }

    @Override
    public String toString() {
        return "Prac_Administracja{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
