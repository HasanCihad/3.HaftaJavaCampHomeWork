public class OgrenciKrediManager extends BaseKrediManager{

    // override
    public double hesapla (double tutar) {
        return tutar * 1.10 ;
    }
}
