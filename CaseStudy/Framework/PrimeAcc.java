package CaseStudy.Framework;

public abstract class PrimeAcc extends ShopAcc{
    
    private boolean isPrime;
    private static final float deliveryCharge=0;

    public PrimeAcc(int accNo, String accNm, float charges, boolean isPrime){
        super(accNo, accNm, charges);
        this.isPrime = isPrime;
    }

    public static float getDeliverycharge() {
        return deliveryCharge;
    }

        public void bookProduct(float charges){
            System.out.println("charges are:" + charges);
        }

        @Override
        public String toString(){
            return "PrimeAcc [isPrime=" + isPrime + ", getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNm() + ", getCharges()=" + getCharges() + ", getToString()=" + super.toString() + ", hasCode()=" + hashCode() + "]";
        }
}
