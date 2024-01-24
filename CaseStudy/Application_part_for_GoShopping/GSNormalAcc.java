package CaseStudy.Application_part_for_GoShopping;

import CaseStudy.Framework.NormalAcc;

public class GSNormalAcc extends NormalAcc{
    
public GSNormalAcc(int accNo, String accNm, float charges, float deliveryCharge) {
        super(accNo, accNm, charges, deliveryCharge);
    }
        
        @Override
        public void bookProduct(float deliveryCharges){
            System.out.println("Dear Normal User, your charges are: " + getCharges() + " and delivery Charge is: " + deliveryCharges);
        }

        @Override
        public String toString(){
            return "GSNormalAcc [ getDeliveryCharge()=" + getDeliveryCharges() + ", toString=" + super.toString() + ", getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNm() + ", getCharges()=" + getCharges() + ", getClass()=" + getClass() + ", hasCode()=" + hashCode() + "]";
        }
}

