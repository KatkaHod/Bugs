package packageBugs;
import java.math.BigDecimal;


public class Bugs {


    public static void ukol1() {
            String pozdrav = "Hello World!";
             System.out.println(pozdrav);
        }

        public static void ukol2() {
            String uzivatel = "Karel";
             System.out.println(uzivatel);
        }

        public static void ukol3() {
            int pocetLekci = 10;
             System.out.println(pocetLekci);
        }

        public static void ukol4() {
         double cena = 10.0;
          System.out.println(cena);
        }

        public static void ukol5() {
            BigDecimal cena = new BigDecimal("0");
              for (int i = 0; i < 10; i++) {
                  //cena += 0.1; bug

                System.out.println(cena);
              }
        }

        public static void ukol6() {
            BigDecimal cena = 0;
            cena = cena.add(BigDecimal.valueOf(0.1));
            System.out.println(cena);
        }

        public static void ukol7() {
            int vykonMotoru = 120;
            System.out.println("Výkon Motoru je: " + vykonMotoru + " kW.");
        }

        public static void ukol8() {
            int velikostKosile = 37;
            System.out.println("Velikost košile je: " + velikostKosile + ".");
        }

        public static void ukol9() {
            System.out.println("Metoda *skoro* bez chybičky!");
        }


    }
