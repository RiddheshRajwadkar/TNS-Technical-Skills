package CaseStudy.Application_part_for_GoShopping;

import CaseStudy.Framework.ShopFactory;

public abstract class GSShopFactory extends ShopFactory{
    
    public GSPrimeAcc getNewPrimeAcc(int accNo, String accNm, float charges, boolean isPrime){
        GSPrimeAcc gsPrimeAcc = new GSPrimeAcc(accNo, accNm, charges, isPrime); 
        return gsPrimeAcc;
    }

    public GSNormalAcc getNewNormalAcc(int accNo, String accNm, float charges, float deliveryCharges){
        GSNormalAcc gsNormalAcc = new GSNormalAcc(accNo, accNm, charges, deliveryCharges);
        return gsNormalAcc;
    }
}
