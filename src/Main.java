public class Main {
    public static void main(String[] args) {

        System.out.println("witaj swiecie");

        System.out.println("lekcja 1 testgit");

        /**
         * git config user.name "nick"
         * git config user.email "mail"
         * git init
         * git add .
         * git commit -m"nazwa"
         * git push
         */

        int wylosowana = (int)(Math.random()*10+1);
        System.out.println(wylosowana);

        /*
typy proste (zawsze z malej litery, maja tylko wartosc):
logiczny: boolean
calkowite: byte, short, int, long
rzeczywiste: float, double
znakowy: char

typy zlozone(zawsze pisane wielka litera)
obiekty ktore maja wlasnosci i metody
 */
        System.out.println("Zgadnij liczbe z zakresu 1-10");
        Scanner klawiatura = new Scanner(System.in);
        int wpisanaLiczba = klawiatura.nextInt();//wczytywanie z klawiatury liczby calkowitej
        System.out.println("Wpisano z klawiatury "+wpisanaLiczba);
        //instrukcja warunkowa
        if(wpisanaLiczba == wylosowana){
            System.out.println("Trafiona liczba");
        }else{
            System.out.println("Nie trafiono sprobuj ponownie");
        }
        //wyrazenie warunkowe
        String komunikat = wylosowana == wpisanaLiczba ? "Poprawinie":"Niepoprawnie";
        System.out.println(komunikat);

        int roznica = wylosowana>wpisanaLiczba? wylosowana : wpisanaLiczba-wylosowana;
        roznica=roznica/10;//dzielenie calkowite bo wynik typu int
        //instrukcja switch
        switch (roznica){
            case 0:
                System.out.println("brawo");
                break;
            case 1:
                System.out.println("Bardzo blisko");
                break;
            case 2:
                System.out.println("Dosc blisko");
                break;
            default:
                System.out.println("Sprobuj szczescia innym razem");
        }

    }
}
