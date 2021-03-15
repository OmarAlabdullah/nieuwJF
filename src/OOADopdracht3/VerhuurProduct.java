//package OOADopdracht3;
//
//import java.util.ArrayList;
//
//public class VerhuurProduct extends Product{
//
//    private double verhuurPrijs;
//    private  double borg;
//    private Exemplaar exemplaar;
//    public static ArrayList<Exemplaar> alleVerhuurProducte = new ArrayList<>();
//
//
//    public VerhuurProduct(double verhuurPrijs, double borg){
//        super();
//        this.borg = borg;
//        this.verhuurPrijs = verhuurPrijs;
//
//    }
//
//    public static ArrayList geefAlleOmschrijvingen() {
//        ArrayList<String> alleomschrijvingen = new ArrayList<>();
//        for (Exemplaar product : alleVerhuurProducte) {
//            alleomschrijvingen.add(product.getOmschrijving());
//
//        }
//        return alleomschrijvingen;
//    }
//
//    public ArrayList geefBeschikbaareExemplaren(){
//        ArrayList<String> beschikbareExemplaren = new ArrayList<>();
//        for (Exemplaar exemplaar : alleVerhuurProducte){
//
//                exemplaar.getDetails();
//                exemplaar.isVerhuurd(exemplaar);
//
//        }}
//        return beschikbareExemplaren;
//    }
//
//}
