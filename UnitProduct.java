package TD2;
public class UnitProduct extends ConsumerProduct {

    public UnitProduct(String _nom, double _prix_ht){
        super(_nom, _prix_ht);
    }
    
    @Override
    public double getUnitPrice() {
        return getPrix_ht();
    }
}