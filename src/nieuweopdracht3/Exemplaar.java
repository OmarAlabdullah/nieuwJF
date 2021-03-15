//package nieuweopdracht3;
//
//import java.util.ArrayList;
//
//public class Exemplaar {
//
//    private String aanschafDatum;
//    private int serieNr;
//    private String status;
//    private ArrayList<VerhuurRegel> regels;
//
//    public Exemplaar(String aanschafDatum, int serieNr, String status){
//        this.aanschafDatum =aanschafDatum;
//        this.status = status;
//        this.serieNr = serieNr;
//        this.regels = new ArrayList<>();
//    }
//
//
//    public String isVerhuurd() {
//        for (VerhuurRegel regel : regels) {
//            return regel.geefPeriode();
//        }
//        return "Geen beschikbare exemplaren";
//    }
//
//    public String geefDetails(){
//        return aanschafDatum+status+serieNr;
//
//    }
//}
//
