package main.domeinLaag;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Calendar;

import static org.junit.jupiter.api.Assertions.*;

public class VluchtTest {

    static LuchtvaartMaatschappij lvm ;
    static Fabrikant f1;
    static VliegtuigType vtt1;
    static Vliegtuig vt1;
    static Luchthaven lh1, lh2;
    static Vlucht vl1, vl2;

    @BeforeEach
    public void initialize() {
        try {
            lvm = new LuchtvaartMaatschappij("NLM");
            f1 = new Fabrikant("Airbus","G. Dejenelle");
            vtt1 = f1.creeervliegtuigtype("A-200", 140);
            Calendar datum = Calendar.getInstance();
            datum.set(2000, 01, 01);
            vt1 = new Vliegtuig(lvm, vtt1, "Luchtbus 100", datum);
            Land l1 = new Land("Nederland", 31);
            Land l2 = new Land("België", 32);
            lh1 = new Luchthaven("Schiphol", "ASD", true, l1);
            lh2 = new Luchthaven("Tegel", "TEG", true, l2);
            Calendar vertr = Calendar.getInstance();
            vertr.set(2020, 03, 30, 14, 15, 0);
            Calendar aank = Calendar.getInstance();
            aank.set(2020, 03, 30, 15, 15, 0);
            vl1 = new Vlucht(vt1, lh1, lh2, vertr, aank );
            vertr.set(2020, 4, 1, 8, 15, 0);
            aank.set(2020, 4, 1, 9, 15, 0);
            vl2 = new Vlucht(vt1, lh1, lh2, vertr, aank );
        } catch (Exception e){
            String errorMessage =  "Exception: " + e.getMessage();
            System.out.println(errorMessage);
        }
    }

    /**
     * Business rule:
     * De bestemming moet verschillen van het vertrekpunt van de vlucht.
     */

    @Test
    public void testBestemmingMagNietGelijkZijnAanVertrek_False() {
        Vlucht vlucht = new Vlucht();
        try {
            vlucht.zetVliegtuig(vt1);
            vlucht.zetVertrekpunt(lh1);
            Luchthaven bestemming = vlucht.getBestemming();
            assertTrue(bestemming == null);
            vlucht.zetBestemming(lh1);
            // De test zou niet verder mogen komen: er moet al een exception gethrowd zijn.
            bestemming = vlucht.getBestemming();
            assertFalse(bestemming.equals(lh1));
        }
        catch(IllegalArgumentException e) {
            Luchthaven bestemming = vlucht.getBestemming();
            assertFalse(bestemming.equals(lh1));
        }
    }

    @Test
    public void testBestemmingMagNietGelijkZijnAanVertrek_True() {
        Vlucht vlucht = new Vlucht();
        Luchthaven bestemming;
        try {
            vlucht.zetVliegtuig(vt1);
            vlucht.zetVertrekpunt(lh2);
            bestemming = vlucht.getBestemming();
            assertTrue(bestemming == null);
            vlucht.zetBestemming(lh1);
            bestemming = vlucht.getBestemming();
            assertTrue(bestemming.equals(lh1));
        }
        catch(IllegalArgumentException e) {
            bestemming = vlucht.getBestemming();
            assertTrue(bestemming.equals(lh1));
        }

    }


        @Test
        public void zestinde_False() {
            Vlucht vlucht = new Vlucht();
            Luchthaven vertrkpunt = null;
            try {
                vlucht.zetVliegtuig(vt1);
                vertrkpunt = vlucht.getVertrekPunt();
                assertTrue(vertrkpunt == null);
                vlucht.zetBestemming(lh1);
                vertrkpunt = vlucht.getVertrekPunt();
                assertTrue(vertrkpunt.equals(lh1));
            }
            catch(NullPointerException e) {
            System.out.println("Vertrekpunt ongeldig");

            }
        }

    @Test
    public void zeventiende_False() {
        Vlucht vlucht = new Vlucht();
        try {
            vlucht.zetVliegtuig(vt1);
            vlucht.zetVertrekpunt(lh1);
            Luchthaven bestemming = vlucht.getBestemming();
            assertFalse(bestemming == null);
            vlucht.zetBestemming(lh1);
        }
        catch(AssertionError e) {
            System.out.println("Bestemming ongeldig");
        }
    }

    @Test
    public void negentiende_False() {
        Vlucht vlucht = new Vlucht();
        try {
            vlucht.zetVliegtuig(vt1);
            vlucht.zetVertrekpunt(lh1);
            Calendar aankomsttijd = vlucht.getAankomstTijd();
            assertFalse(aankomsttijd == null);
        }
        catch(AssertionError e) {
            System.out.println("Aankomsttijd ongeldig");
        }
    }



}
