public class Pracownik {
    String imie;
    String nazwisko;
    int wiek;
    double salary;

    public Pracownik(String imie, String nazwisko, int wiek, double salary) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.salary = salary;
    }

    public static void main(String[] args) {
        // Tworzenie obiektów pracowników
        Pracownik pracownik1 = new Pracownik("Jan", "Kowalski", 30, 5000.0);
        Pracownik pracownik2 = new Pracownik("Anna", "Nowak", 28, 4500.0);
        Pracownik pracownik3 = new Pracownik("Piotr", "Nowicki", 35, 6000.0);

        // Wyświetlanie danych pracownika o indeksie 3
        System.out.println("Dane pracownika o indeksie 3:");
        System.out.println("Imię: " + pracownik3.imie);
        System.out.println("Nazwisko: " + pracownik3.nazwisko);
        System.out.println("Wiek: " + pracownik3.wiek);
        System.out.println("Wynagrodzenie: " + pracownik3.salary);

        // Modyfikacja wynagrodzenia pracownika o indeksie 3
        pracownik3.salary += 1000.0;
        System.out.println("Nowe wynagrodzenie pracownika o indeksie 3: " + pracownik3.salary);
    }
}