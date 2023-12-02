package Pracownicy;

public class Kierowca extends Pracownik{
    String rejestr_pojazdu;

    int nrlini;

    public Kierowca(String name, String surname, double salary, String rejestr_pojazdu,int experience,int nrlini) {
        super(name, surname, salary,experience);
        this.rejestr_pojazdu = rejestr_pojazdu;
        this.nrlini = nrlini;
    }

    public Kierowca() {

    }

    public static double Count_salary(){
        return salary + ((salary * 2 )/ experience) ;
    }

    @Override
    public String toString() {
        return "Kierowca{" +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                "rejestr_pojazdu='" + rejestr_pojazdu + '\'' +
                '}';
    }
}
