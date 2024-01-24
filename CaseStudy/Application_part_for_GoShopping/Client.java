package CaseStudy.Application_part_for_GoShopping;

import CaseStudy.Framework.NormalAcc;
import CaseStudy.Framework.PrimeAcc;

public class Client {
    public static void main(String[] args) {
        
        PrimeAcc pa = new GSPrimeAcc(123, "Salaar", 230, true);
        pa.bookProduct(pa.getCharges());
        pa.toString();

        NormalAcc na = new GSNormalAcc(321, "Vardharaj", 230, 70);
        na.bookProduct(na.getDeliveryCharges());
        na.toString();  
    }
}
