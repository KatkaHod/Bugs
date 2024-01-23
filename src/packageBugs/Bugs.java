package packageBugs;
import java.math.BigDecimal;


public class Bugs {

    public static void homework1() {
            String pozdrav = "Hello World!";
             System.out.println(pozdrav);
        }

        public static void homework2() {
            String uzivatel = "Karel";
             System.out.println(uzivatel);
        }

        public static void homework3() {
            int pocetLekci = 10;
             System.out.println(pocetLekci);
        }

        public static void homework4() {
         double cena = 10.0;
          System.out.println(cena);
        }

        public static void homework5() {
            BigDecimal cena = BigDecimal.valueOf(0.0);
            cena = cena.add(BigDecimal.valueOf(0.1));

                System.out.println(cena);
        }


        public static void homework6() {
            BigDecimal bdcena = BigDecimal.valueOf(0.0);
            BigDecimal bdzvysenihodnoty = BigDecimal.valueOf(0.1);

            for (int i = 0; i < 10; i++) {
                bdcena = bdcena.add(bdzvysenihodnoty);
            }
            System.out.println(bdcena);
        }

        public static void homework7() {
            int vykonMotoru = 120;
            System.out.println("Výkon Motoru je: " + vykonMotoru + " kW.");
        }

        public static void homework8() {
            int velikostKosile = 37;
            System.out.println("Velikost košile je: " + velikostKosile + ".");
        }

        public static void homework9() {
            System.out.println("Metoda *skoro* bez chybičky!");
        }


    }
