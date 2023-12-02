import Pojazd.Autobus;
import Pracownicy.Kierowca;
import Pracownicy.Prac_Administracja;
import Przystanek.Przystanek;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
            double cena_biletu = 4;

        /// kierowcy
        Kierowca kierwowca_0 = new Kierowca("PLACEHOLDER", "PLACEHOLDER", 0, "PLACEHOLDER", 0,0);
        Kierowca kierowca_1 = new Kierowca("Marcin", "Wolny", 3000, "RTA34TW0", 7,1);
        Kierowca kierowca_2 = new Kierowca("Wojciech", "Polak", 3000, "RTA990A", 10,2);
        Kierowca kierowca_3 = new Kierowca("Mahmed", "Billada", 3000, "RT700A", 13,3);
        /// autobusy
        Autobus autob_0 = new Autobus();
        Autobus autob_1 = new Autobus("TKL1000", 48, 10000.0, "RTA34TW0", 1);
        Autobus autobus_2 = new Autobus("TWK2137", 56, 12000.0, "RTA990A", 2);
        Autobus autob_3 = new Autobus("WTC1109", 34, 2137.0, "RT700A", 3);
        /// Pracownik_Admin
        Prac_Administracja prac_0 = new Prac_Administracja("PLACEHOLDER", "PLACEHOLDER", 0, 0);
        Prac_Administracja prac_1 = new Prac_Administracja("Julia", "Nowak", 4000, 4);
        Prac_Administracja prac_2 = new Prac_Administracja("Henryk", "Kowalski", 4000, 9);
        ///// lista pracownikow
        ArrayList<Kierowca> lista_kierow = new ArrayList<>();
        lista_kierow.add(kierwowca_0);
        lista_kierow.add(kierowca_1);
        lista_kierow.add(kierowca_2);
        lista_kierow.add(kierowca_3);
        ArrayList<Prac_Administracja> lista_pracadm = new ArrayList<>();
        lista_pracadm.add(prac_0);
        lista_pracadm.add(prac_1);
        lista_pracadm.add(prac_2);
        //// lista autobusy
        ArrayList<Autobus> list_autob = new ArrayList<>();
        list_autob.add(autob_0);
        list_autob.add(autob_1);
        list_autob.add(autobus_2);
        list_autob.add(autob_3);


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

        ArrayList<ArrayList<Przystanek>> group = new ArrayList<ArrayList<Przystanek>>();
        group.add(linia_1);
        group.add(linia_2);
        group.add(linia_3);
        //////
        System.out.println("Jesli jestes pasazerem wybierz - 1, jesli jestes pracownikiem wybierz - 2 ");
        System.out.println("aby zamknac program wybierz 3");
        int urzytk = scan1.nextInt();
        while (urzytk != 3) {

            if (urzytk == 1) {
                System.out.println("Aby wyswietlic linie nr.1 wybierz 1");
                System.out.println("Aby wyswietlic linie nr.2 wybierz 2");
                System.out.println("Aby wyswietlic linie nr.3 wybierz 3");
                System.out.println("aby wyswietlic caly rozklad lini wybierz 4");
                System.out.println("aby wyswietlic ceny biletow wybierz 5");
                System.out.println("Aby zakonczyc wcisnij 6");
                int wyb = scan1.nextInt();
                if (wyb == 1) {
                    System.out.println("Rozklad lini nr.1");
                    for (int i = 0; i < linia_1.toArray().length; i++) {
                        System.out.println(linia_1.get(i).toString());

                    }
                    System.out.println("zakonczyc t,n ?");
                    String wybo = scan1.next();
                    if (wybo.equals("t")) {
                        urzytk = 3;
                    }
                }

                if (wyb == 2) {
                    System.out.println("Rozklad lini nr.2");
                    for (int i = 0; i < linia_2.toArray().length; i++) {
                        System.out.println(linia_2.get(i).toString());


                    }
                    System.out.println("zakonczyc t,n ?");
                    String wybo = scan1.next();
                    if (wybo.equals("t")) {
                        urzytk = 3;
                    }
                }
                if (wyb == 3) {
                    System.out.println("Rozklad lini nr.3");
                    for (int i = 0; i < linia_3.toArray().length; i++) {
                        System.out.println(linia_3.get(i).toString());

                    }
                    System.out.println("zakonczyc t,n ?");
                    String wybo = scan1.next();
                    if (wybo.equals("t")) {
                        urzytk = 3;
                    }
                }
                if (wyb == 4) {
                    System.out.println("Rozklad lini nr.1");
                    for (int i = 0; i < linia_1.toArray().length; i++) {
                        System.out.println(linia_1.get(i).toString());
                    }
                    System.out.println("Rozklad lini nr.2");
                    for (int i = 0; i < linia_1.toArray().length; i++) {
                        System.out.println(linia_1.get(i).toString());

                    }
                    System.out.println("Rozklad lini nr.3");
                    for (int i = 0; i < linia_3.toArray().length; i++) {
                        System.out.println(linia_3.get(i).toString());

                    }
                    System.out.println("zakonczyc t,n ?");
                    String wybo = scan1.next();
                    if (wybo.equals("t")) {
                        urzytk = 3;
                    }


                }
                if(wyb == 5){
                    double ulgowy = cena_biletu / 2;
                    double bil_20min = Math.round(cena_biletu / 1.5);
                    double bil_40min = cena_biletu * 2;
                    double bil_60min = cena_biletu * 2.5;
                    System.out.println("Ceny biletow");
                    System.out.println("Bilet normalny :" + cena_biletu);
                    System.out.println("bilet ulgowy : " + ulgowy);
                    System.out.println("bilet 20 min : " + bil_20min);
                    System.out.println("bilet 40 min : " + bil_40min);
                    System.out.println("bilet 60 min : " + bil_60min);
                    System.out.println();
                }
                if (wyb == 6){
                    urzytk = 3;
                }
            }
            if (urzytk == 2) {
                System.out.println("Lista pracownikow - 1");
                System.out.println("Wyszukaj autobus oraz kierowce po nr. linii - 2");
                System.out.println("Policz wyplate - 3");
                System.out.println("Dodaj pracownika - 4");
                System.out.println("Dodaj autobus - 5");
                System.out.println("Usun pracownika - 6");
                System.out.println("dodaj przystanek 7");
                System.out.println("usun przystanek 8");
                System.out.println("Aby zakonczyc wcisnij 9");
                int wyb2 = scan1.nextInt();

                if (wyb2 == 1) {
                    System.out.println("Lista Wszystkich pracownikow");
                    for (int i = 1; i < lista_kierow.toArray().length; i++) {
                        System.out.println(lista_kierow.get(i).toString());
                    }
                    for (int i = 1; i < lista_pracadm.toArray().length; i++) {
                        System.out.println(lista_pracadm.get(i).toString());
                    }
                    System.out.println("zakonczyc t,n ?");
                    String wybo = scan1.next();
                    if (wybo.equals("t")) {
                        urzytk = 3;
                    }

                }
                if (wyb2 == 2) {
                    System.out.println("Podaj nr. lini");
                    int wyb_lini = scan1.nextInt();
                    if (wyb_lini > (list_autob.size() - 1) || wyb_lini == 0) {
                        System.out.println("podana wartosc jest nieprawidlowa");
                        System.out.println("zakonczyc t,n ?");
                        String wybo = scan1.next();
                        if (wybo.equals("t")) {
                            urzytk = 3;
                        }


                    } else {
                        System.out.println("Autobus oraz kierowca kursujacy po lini nr." + wyb_lini);
                        for (int i = 1; i < list_autob.size(); i++) {
                            if (wyb_lini == list_autob.indexOf(i) ) {
                                System.out.println(list_autob.get(i).toString());
                            }

                        }
                        for (int i = 1; i < lista_kierow.size(); i++) {
                            if (wyb_lini == lista_kierow.indexOf(i) ) {
                                System.out.println(lista_kierow.get(i).toString());
                            }

                        }




                    }
                }
                if (wyb2 == 3) {

                    for (int i = 1; i < lista_kierow.toArray().length; i++) {
                        System.out.println(lista_kierow.get(i).toString());
                    }
                    for (int i = 1; i < lista_pracadm.toArray().length; i++) {
                        System.out.println(lista_pracadm.get(i).toString());
                    }
                    System.out.println("Podaj nazwisko pracownika");
                    String nazw = scan1.next();

                    for (int i = 1; i < lista_pracadm.size(); i++) {
                        Prac_Administracja prac_adm = lista_pracadm.get(i);
                        String surname = prac_adm.getSurname();
                        if (surname.equalsIgnoreCase(nazw)) {
                            System.out.println("Wyplata to :" + Math.round(prac_adm.Count_salary_adm()));
                        }
                    }
                    for (int i = 1; i < lista_kierow.size(); i++) {
                        Kierowca kierow = lista_kierow.get(i);
                        String surname2 = kierow.getSurname();
                        if (surname2.equalsIgnoreCase(nazw)) {
                            System.out.println("Wyplata to :" + Math.round(kierow.Count_salary()));
                        }

                        System.out.println("zakonczyc t,n ?");
                        String wybo = scan1.next();
                        if (wybo.equals("t")) {
                            urzytk = 3;
                        }
                    }


                }
                if (wyb2 == 4) {
                    System.out.println("Dodawanie Pracownika ");
                    System.out.println("Chcesz dodac pracownika administracji - 1 czy kierwoce - 2 ?");
                    int chois = scan1.nextInt();
                    if (chois == 1) {
                        System.out.println("Podaj imie");
                        String name = scan1.next();
                        System.out.println("Podaj Nazwisko");
                        String surname = scan1.next();
                        System.out.println("Podaj pensje");
                        double salary = scan1.nextInt();
                        System.out.println("Podaj doswiadczenie");
                        int experience = scan1.nextInt();
                        lista_pracadm.add(new Prac_Administracja(name, surname, salary, experience));
                        System.out.println("zakonczyc t,n ?");
                        String wybo = scan1.next();
                        if (wybo.equals("t")) {
                            urzytk = 3;
                        }

                    } else if (chois == 2) {
                        System.out.println("Podaj imie");
                        String name = scan1.next();
                        System.out.println("Podaj Nazwisko");
                        String surname = scan1.next();
                        System.out.println("Podaj pensje");
                        double salary = scan1.nextInt();
                        System.out.println("Podaj rejestracje pojazdu ( pusty ciag oznacza brak przypisanego autobusu)");
                        String rej = scan1.next();
                        System.out.println("Podaj doswiadczenie");
                        int experience = scan1.nextInt();
                        System.out.println("Podaj nr lini na ktorej kursuje");
                        int nrlini = scan1.nextInt();
                        if(nrlini > group.size() || nrlini == 0){
                            System.out.println("Nie ma takiej linii");
                        }
                        else {
                            lista_kierow.add(new Kierowca(name, surname, salary, rej, experience,nrlini));
                        }


                        System.out.println("zakonczyc t,n ?");
                        String wybo = scan1.next();
                        if (wybo.equals("t")) {
                            urzytk = 3;
                        }
                    }
                }
                if (wyb2 == 5) {
                    System.out.println("Dodawanie autobusu ");
                        System.out.println("Podaj model");
                        String model = scan1.next();
                        System.out.println("Podaj ilosc miejsc");
                        int  numofseats = scan1.nextInt();
                        System.out.println("Podaj przebieg");
                        double milage = scan1.nextInt();
                        System.out.println("Podaj podaj rejestracje");
                        String rej = scan1.next();
                     System.out.println("podaj nr. lini do ktorej zostanie przypisany");
                     int line = scan1.nextInt();
                     if(line > group.size() || line == 0){
                         System.out.println("Nie ma takiej lini");
                     }
                     else
                     {
                         list_autob.add(new Autobus(model, numofseats, milage, rej,line));

                         for (int i = 1; i < list_autob.toArray().length; i++) {
                             System.out.println(list_autob.get(i).toString());
                         }
                     }
                        System.out.println("zakonczyc t,n ?");
                        String wybo = scan1.next();
                        if (wybo.equals("t")) {
                            urzytk = 3;

                    }
                }


                if (wyb2 == 6) {
                    System.out.println("Usuwanie pracownika");
                    for (int i = 1; i < lista_kierow.toArray().length; i++) {
                        System.out.println(lista_kierow.get(i).toString());
                    }
                    for (int i = 1; i < lista_pracadm.toArray().length; i++) {
                        System.out.println(lista_pracadm.get(i).toString());
                    }
                    System.out.println("Podaj nazwisko");
                    String wyb = scan1.next();
                    for (int i = 1; i < lista_kierow.size(); i++) {
                        Kierowca kierow = lista_kierow.get(i);
                        String surname2 = kierow.getSurname();
                        if (wyb.equalsIgnoreCase(surname2)) {
                            lista_kierow.remove(i);
                            break;
                        }

                    }
                    for (int i = 1; i < lista_pracadm.size(); i++) {
                        Prac_Administracja adm = lista_pracadm.get(i);
                        String surname2 = adm.getSurname();
                        if (wyb.equalsIgnoreCase(surname2)) {
                            lista_pracadm.remove(i);
                            break;
                        }
                    }
                    System.out.println("zakonczyc t,n ?");
                    String wybo = scan1.next();
                    if (wybo.equals("t")) {
                        urzytk = 3;

                    }
                }
                if (wyb2 == 7){
                    System.out.println("dodaj przystanek");
                    System.out.println("podaj godzine przyjazdu w formacie hh:mm");
                    String godzina_przyjazdu = scan1.next();
                    System.out.println("podaj nazwe ulicy");
                    String nazwa_ulicy = scan1.next();
                    System.out.println("podaj nazwe ulicy");
                    int nr_lini = scan1.nextInt();
                    if(nr_lini > group.size() || nr_lini == 0){
                        System.out.println("Nie ma takiej lini");
                    }
                    else if (nr_lini == 1){
                        linia_1.add((new Przystanek(godzina_przyjazdu,nazwa_ulicy,nr_lini)));
                    }
                    else if (nr_lini == 2){
                        linia_2.add((new Przystanek(godzina_przyjazdu,nazwa_ulicy,nr_lini)));
                    }
                    else if (nr_lini == 3){
                        linia_3.add((new Przystanek(godzina_przyjazdu,nazwa_ulicy,nr_lini)));
                    }

                }
                if (wyb2 == 8){
                    System.out.println("usun przystanek");
                    System.out.println("Rozklad lini nr.1");
                    for (int i = 0; i < linia_1.toArray().length; i++) {
                        System.out.println(linia_1.get(i).toString());
                    }
                    System.out.println("Rozklad lini nr.2");
                    for (int i = 0; i < linia_1.toArray().length; i++) {
                        System.out.println(linia_1.get(i).toString());

                    }
                    System.out.println("Rozklad lini nr.3");
                    for (int i = 0; i < linia_3.toArray().length; i++) {
                        System.out.println(linia_3.get(i).toString());

                    }
                    System.out.println("Podaj kolejno linie i nr.przystanku ktory chcesz usunac");
                    int lin = scan1.nextInt();
                    int nr = scan1.nextInt();
                    if (lin == 0 || nr == 0 || lin > group.size() || nr > linia_1.size() || nr > linia_2.size()|| nr > linia_3.size()){
                        System.out.println("Nieprawidlowe wartosci");
                        System.out.println("zakonczyc t,n ?");
                        String wybo = scan1.next();
                        if (wybo.equals("t")) {
                            urzytk = 3;

                        }
                    } else if (lin == 1) {
                        linia_1.remove(nr);
                    } else if (lin == 2) {
                        linia_2.remove(nr);

                    } else if (lin == 3) {
                        linia_3.remove(nr);

                    }
                    System.out.println("zakonczyc t,n ?");
                    String wybo = scan1.next();
                    if (wybo.equals("t")) {
                        urzytk = 3;

                    }

                }
                if (wyb2 == 9){
                    urzytk = 3;
                }

            }
        }
    }
}


