import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("witaj swiecie");

        System.out.println("lekcja 1 testgit");

        /*
         * git config user.name "nick"
         * git config user.email "mail"
         * git init - puste repozytorium
         * git add . - dodaj wszystkie pliki do repozytorium
         * git commit -m "nazwa" - tworzy migawke o nazwie pusty projekt
         * git push -u origin master - dodaj do repozytorium
         */

        int wylosowana = (int) (Math.random() * 100 + 1);
        System.out.println(wylosowana);
/*git in
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
            System.out.println("Pudło");
        }
        //wyrazenie warunkowe
        String komunikat = wylosowana == wpisanaLiczba ? "Poprawnie":"Niepoprawnie";
        System.out.println(komunikat);

        int roznica = wylosowana>wpisanaLiczba? wylosowana-wpisanaLiczba : wpisanaLiczba-wylosowana;
        roznica=roznica/10;//dzielenie calkowite bo wynik typu int
        //instrukcja switch
        switch (roznica){
            case 0:
                System.out.println("Brawo");
                break;
            case 1:
                System.out.println("Bardzo blisko");
                break;
            case 2:
                System.out.println("Dosc blisko");
                break;
            default:
                System.out.println("Słabo");
        }
        //wyrazenie switch
        System.out.println(switch(roznica){
                    case 0-> "Brawo";
                    case 1-> "Blisko";
                    case 2->"Dosc blisko";
                    default-> "Slabo";
                }
        );
        //zgadwyanie 10 razy
        for(int i = 0;i <10; i++){
            System.out.println("Zgadnij liczbe");
            wpisanaLiczba = klawiatura.nextInt();
            if(wpisanaLiczba == wylosowana){
                System.out.println("Wygrana");
                break;
            }else {
                if(wpisanaLiczba>wylosowana){
                    System.out.println("Wpisano za duzo");
                }else {
                    System.out.println("Wpisano za malo");
                }
            }
        }
        //zgadywanie do skutku
        System.out.println("Zgadnij liczbe");
        wpisanaLiczba= klawiatura.nextInt();
        while (wpisanaLiczba !=wylosowana){
            if(wpisanaLiczba>wylosowana){
                System.out.println("Wpisano za duzo");
            }else {
                System.out.println("Wpisano za malo");
            }
            System.out.println("Zgadnij liczbe");
            wpisanaLiczba = klawiatura.nextInt();
        }
        System.out.println("Gratulacje wygrana");

    }
}