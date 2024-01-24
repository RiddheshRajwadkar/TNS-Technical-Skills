package CaseStudy.Framework;

public abstract class NormalAcc extends ShopAcc{
    
    final private float deliveryCharges;

    public NormalAcc(int accNo, String accNm, float charges, float deliveryCharges){
        super(accNo, accNm, charges);
        this.deliveryCharges = deliveryCharges;
    }

        public float getDeliveryCharges(){
            return deliveryCharges;
        }
        
        public void bookProduct(float deliveryCharges){
            System.out.println("Delivery Charges are: " + deliveryCharges);
        }

        @Override
        public String toString(){
            return "NormalAcc [ deliveryCharges=" + deliveryCharges + ", getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNm() + ", getCharges()=" + getCharges() + ", getToString()=" + super.toString() + ", hasCode()=" + hashCode() + "]";
        }
}
