import Pojazd.Autobus;
import Pracownicy.Kierowca;
import Pracownicy.Prac_Administracja;
import Pracownicy.Pracownik;
import Przystanek.Przystanek;

import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static Pracownicy.Prac_Administracja.Count_salary_adm;

public class Main {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);


        /// kierowcy
        Kierowca kierwowca_0 = new Kierowca("PLACEHOLDER", "PLACEHOLDER", 0, "PLACEHOLDER", 0);
        Kierowca kierowca_1 = new Kierowca("Marcin", "Wolny", 3000, "RTA34TW0", 7);
        Kierowca kierowca_2 = new Kierowca("Wojciech", "Polak", 3000, "RTA990A", 10);
        Kierowca kierowca_3 = new Kierowca("Mahmed", "Billada", 3000, "RT700A", 13);
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
                int wyb = scan1.nextInt();
                if (wyb == 1) {
                    System.out.println("Rozklad lini nr.1");
                    for (int i = 1; i < linia_1.toArray().length; i++) {
                        System.out.println(linia_1.get(i).toString());

                    }
                }

                if (wyb == 2) {
                    System.out.println("Rozklad lini nr.2");
                    for (int i = 1; i < linia_2.toArray().length; i++) {
                        System.out.println(linia_2.get(i).toString());


                    }
                }
                if (wyb == 3) {
                    System.out.println("Rozklad lini nr.3");
                    for (int i = 1; i < linia_3.toArray().length; i++) {
                        System.out.println(linia_3.get(i).toString());

                    }
                }
                if (wyb == 4) {
                    System.out.println("Rozklad lini nr.1");
                    for (int i = 1; i < linia_1.toArray().length; i++) {
                        System.out.println(linia_1.get(i).toString());
                    }
                    System.out.println("Rozklad lini nr.2");
                    for (int i = 1; i < linia_1.toArray().length; i++) {
                        System.out.println(linia_1.get(i).toString());

                    }
                    System.out.println("Rozklad lini nr.3");
                    for (int i = 1; i < linia_3.toArray().length; i++) {
                        System.out.println(linia_3.get(i).toString());

                    }


                }
            }
            if (urzytk == 2) {
                System.out.println("Lista pracownikow - 1");
                System.out.println("Wyszukaj autobus oraz kierowce po nr. linii - 2");
                System.out.println("Policz wyplate - 3");
                System.out.println("Dadaj pracownika - 4");
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
                    if(wybo.equals("t")){
                        urzytk = 3;}

                }
                if (wyb2 == 2) {
                    System.out.println("Podaj nr. lini");
                    int wyb_lini = scan1.nextInt();
                    if (wyb_lini > (list_autob.size() - 1) || wyb_lini == 0) {
                        System.out.println("podana wartosc jest nieprawidlowa");
                        System.out.println("zakonczyc t,n ?");
                        String wybo = scan1.next();
                        if(wybo.equals("t")){
                            urzytk = 3;}


                    } else {

                        System.out.println("Autobus oraz kierowca kursujacy po lini nr." + wyb_lini);
                        System.out.println(lista_kierow.get(wyb_lini).toString());
                        System.out.println(list_autob.get(wyb_lini).toString());
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
                        if(wybo.equals("t")){
                            urzytk = 3;}
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
                        if(wybo.equals("t")){
                            urzytk = 3;}

                    } else if (chois == 2) {
                        System.out.println("Podaj imie");
                        String name = scan1.next();
                        System.out.println("Podaj Nazwisko");
                        String surname = scan1.next();
                        System.out.println("Podaj pensje");
                        double salary = scan1.nextInt();
                        System.out.println("Podaj rejestracje pojazdu ( pusty ciag oznacza brak przypisanego autobusu)");
                        String rej = scan1.nextLine();
                        System.out.println("Podaj doswiadczenie");
                        int experience = scan1.nextInt();
                        lista_kierow.add(new Kierowca(name, surname, salary, rej, experience));

                        System.out.println("zakonczyc t,n ?");
                        String wybo = scan1.next();
                        if (wybo.equals("t")) {
                            urzytk = 3;
                        }
                    } else {
                        System.out.println("Nieprawidlowa wartosc");

                        System.out.println("zakonczyc t,n ?");
                        String wybo = scan1.next();
                        if (wybo.equals("t")) {
                            urzytk = 3;
                        }
                    }



                }


            }

        }
    }
}


