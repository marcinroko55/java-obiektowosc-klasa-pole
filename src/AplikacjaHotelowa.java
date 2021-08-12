public class AplikacjaHotelowa {
    public static void main(String[] args) {

        PokojHotelowy pokoj = new PokojHotelowy();
        pokoj.number = 1432;
        pokoj.dostepnosc = true;
        String dostepnosc = "Pokój jest dostępny";

        PokojHotelowy pokoj1 = new PokojHotelowy();
        pokoj1.number = 1435;
        pokoj1.dostepnosc = false;

        PokojHotelowy pokoj2 = new PokojHotelowy();
        pokoj2.number = 1433;
        pokoj2.dostepnosc = false;

        System.out.println(pokoj.number + " " + (pokoj.dostepnosc ? "Pokoj jest dostępny" : "Pokój nie jest dostępny"));
        System.out.println(pokoj1.number + " " + (pokoj1.dostepnosc ? "Pokoj jest dostępny" : "Pokój nie jest dostępny"));
        System.out.println(pokoj2.number + " " + (pokoj2.dostepnosc ? "Pokoj jest dostępny" : "Pokój nie jest dostępny"));
    }
}
