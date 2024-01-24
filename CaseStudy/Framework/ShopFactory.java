package CaseStudy.Framework;

public abstract class ShopFactory {

        public abstract PrimeAcc getNewPrimeAcc(int accNo, String accNm, float charges, boolean isPrime);
        public abstract NormalAcc getNewNormalAcc(int accNo, String accNm, int charges, float deliveryCharges);
}