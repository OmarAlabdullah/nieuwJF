//package nieuweopdracht3;
//
//import java.util.ArrayList;
//
//public class VerhuurProduct extends Product{
//
//    private double verhuurPrijs;
//    private  double borg;
//    public static ArrayList<Product> alleVerhuurProducte = new ArrayList<>();
//    private ArrayList<Exemplaar> exemplaren;
//
//
//    public VerhuurProduct(int productNr, String omschrijving, double prijs, double verhuurPrijs, double borg){
//        super(productNr,omschrijving,prijs);
//        this.borg = borg;
//        this.verhuurPrijs = verhuurPrijs;
//        this.exemplaren = new ArrayList<>();
//    }
//
//    public static ArrayList geefAlleOmschrijvingen() {
//        ArrayList<String> alleomschrijvingen = new ArrayList<>();
//        for (Product product : alleVerhuurProducte) {
//            alleomschrijvingen.add(product.getOmschrijving());
//
//        }
//        return alleomschrijvingen;
//    }
//
//    public ArrayList geefBeschikbareExemplaren(){
//        ArrayList<String> beschikbareExemplaren = new ArrayList<>();
//        for (Exemplaar exemplaar : exemplaren){
//                beschikbareExemplaren.add(exemplaar.geefDetails());
//                beschikbareExemplaren.add(exemplaar.isVerhuurd());
//
//        }
//        return beschikbareExemplaren;
//    }
//
//}
