import java.util.Locale;
import java.util.Scanner;

public class DomaciSreda {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        // 1. zadatak

        System.out.println("Ocenite kvalitet naseg restorana od 1 - 10.");
        int kvalitet = s.nextInt();
        System.out.println("Ocenite uslugu naseg restorana od 1 - 10.");
        int usluga = s.nextInt();
        int prosek = (kvalitet + usluga) / 2;
        if (kvalitet < 1 || kvalitet > 10 || usluga > 10 || usluga < 1) { // ovde treba nesto popraviti
            System.out.println("Podaci nisu validni");
        } else if (prosek >= 5) {
            System.out.println("Prosek je veci od 5");
        } else if (prosek < 5 && kvalitet == 1) {
            System.out.println("Treba popraviti kvalitet");
        } else if (prosek < 5 && usluga == 1) {
            System.out.println("Treba popraviti uslugu");
        }

        // 2. zadatak Verzija 1 - dugacka ---------------------------------------------------------------

      /*   System.out.println("Unesite zeljeni mesec.");
        switch (s.nextLine()) {
            case "Januar":
                System.out.println("Januar ima 31 dan.");
                break;
            case "Februar":
                System.out.println("Februar ima 28 dana.");
                break;
            case "Mart":
                System.out.println("Mart ima 31 dan.");
                break;
            case "April":
                System.out.println("April ima 30 dana.");
                break;
            case "Maj":
                System.out.println("Maj ima 31 dan.");
                break;
            case "Jun":
                System.out.println("Jun ima 30 dana.");
                break;
            case "Jul":
                System.out.println("Jul ima 31 dan.");
                break;
            case "Avgust":
                System.out.println("Avgust ima 31 dan.");
                break;
            case "Septembar":
                System.out.println("Septembar ima 30 dana.");
                break;
            case "Oktobar":
                System.out.println("Oktobar ima 31 dan.");
                break;
            case "Novembar":
                System.out.println("Novembar ima 30 dana.");
                break;
            case "Decembar":
                System.out.println("Decembar ima 31 dan.");
                break;
            default:
                System.exit(1);

// 2. zadatak -- verzija 2 -- kraca ------------------------------------------------------------------


                System.out.println("Unesite zeljeni mesec.");
                switch (s.nextLine()) {
                    case "Januar":
                    case "Mart":
                    case "Maj":
                    case "Jul":
                    case "Avgust":
                    case "Oktobar":
                    case "Decembar":
                        System.out.println("Izabrani mesec ima 31 dan!");
                        break;

                    case "Februar":
                        System.out.println("Izabrani  mesec ima 28 dana.");
                        break;

                    case "April":
                    case "Jun":
                    case "Septembar":
                    case "Novembar":
                        System.out.println("Izabrani mesec ima 30 dana!");
                        break;
                    default:
                        System.exit(1);
                }
        } */
    }
}
