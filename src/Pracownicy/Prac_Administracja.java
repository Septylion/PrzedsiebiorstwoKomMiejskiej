package Pracownicy;

public class Prac_Administracja extends Pracownik{
    int id;

    public Prac_Administracja(String name, String surname, double salary,int experience) {
        super(name, surname, salary,experience);
        this.id = id;

    }

    public Prac_Administracja() {


    }

    public static double Count_salary_adm(){
        return (salary + ((salary * 2 )/ experience));
    }

    @Override
    public String toString() {
        return "Prac_Administracja{" +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
