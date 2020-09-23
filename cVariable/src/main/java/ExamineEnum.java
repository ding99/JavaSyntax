package main.java;

/**
 * Created by ding_ on 9/23/2020
 */

public class ExamineEnum {
    public enum Element {
        HELIUM("He","Gas"),
        MAGNESIUM("Me","Solid");

        private String symbol;
        private String type;
        Element(String symbol, String type){ this.symbol = symbol; this.type = type; }

        public String chemicalSymbol() { return symbol; }
        public String type() { return type; }
    }

    public void Start(){
        System.out.println("-- Examine Enum");
        //System.out.printf("%s,%s,%s", Element[1],Element[1].symbol,Element[1].nature);
        //System.out.printf("%s,%s,%s", Element[0],Element[0].symbol,Element[0].nature);
        System.out.printf("%s,%s,%s", Element.HELIUM,Element.HELIUM.chemicalSymbol(),Element.HELIUM.type());
        //System.out.printf("%s,%s,%s", Element.HELIUM,Element.toString().HELIUM.chemicalSymbol(),Element.HELIUM.type());
        System.out.println();
    }

    /** result: HELIUM,He,Gas **/
}
