import Pojazd.Autobus;
import Pracownicy.Kierowca;
import Pracownicy.Prac_Administracja;
import Przystanek.Przystanek;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /// kierowcy
        Kierowca kierowca_1 = new Kierowca("Marcin", "Polak", 3000, "RTA34TW0", 7);
        Kierowca kierowca_2 = new Kierowca("Wojciech", "Polak", 3000, "RTA990A", 10);
        Kierowca kierowca_3 = new Kierowca("Mahmed", "Billada", 3000, "RT700A", 13);
        /// autobusy
        Autobus autob_1 = new Autobus("TKL1000",48,10000.0,"RTA34TW0",1);
        Autobus autobus_2 = new Autobus("TWK2137",56,12000.0,"RTA990A",2);
        Autobus autob_3 = new Autobus("WTC1109",34,2137.0,"RT700A",3);
        /// Pracownik_Admin
        Prac_Administracja prac_1 = new Prac_Administracja("Julia","Nowak",4000,4);
        Prac_Administracja prac_2 = new Prac_Administracja("Henryk","Kowalski",4000,9);
        ///linia 1
        ArrayList<Przystanek> linia_1 = new ArrayList<>();
        Przystanek przys_1 = new Przystanek("6:00", "Jana Pawla 2", 1);
        Przystanek przys_2 = new Przystanek("6:30", "Sienkiewicza", 1);
        Przystanek przys_3 = new Przystanek("7:00", "Bema", 1);
        Przystanek przys_4 = new Przystanek("7:30", "Slowackiego", 1);
        linia_1.add(przys_1);
        linia_1.add(przys_2);
        linia_1.add(przys_3);
        linia_1.add(przys_4);

        /// linia 2
        ArrayList<Przystanek> linia_2 = new ArrayList<>();
        Przystanek przys_5 = new Przystanek("6:40", "Gen.Sikorskiego", 2);
        Przystanek przys_6 = new Przystanek("9:30", "Sienkiewicza", 2);
        Przystanek przys_7 = new Przystanek("9:40", "Bema", 2);
        Przystanek przys_8 = new Przystanek("10:30", "Slowackiego", 2);
        linia_2.add(przys_5);
        linia_2.add(przys_6);
        linia_2.add(przys_7);
        linia_2.add(przys_8);
        //// linia 3
        ArrayList<Przystanek> linia_3 = new ArrayList<>();
        Przystanek przys_9 = new Przystanek("10:40", "Gen.Sikorskiego", 3);
        Przystanek przys_10 = new Przystanek("11:30", "Sienkiewicza", 3);
        Przystanek przys_11 = new Przystanek("12:40", "Bema", 3);
        Przystanek przys_12 = new Przystanek("13:30", "Slowackiego", 3);
        linia_3.add(przys_9);
        linia_3.add(przys_10);
        linia_3.add(przys_11);
        linia_3.add(przys_12);



    }
}