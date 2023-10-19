package TD2;
public class FoodProduct extends ConsumerProduct{

    private Deadline DLV; // Objet composer 
    // private static final double VAT= 0.055; //vat = taxe(tva)

    public FoodProduct(String _nom, double _prix_HT, int _DVL){ //constructeur avec parametre 
       super(_nom, _prix_HT); 
       this.DLV = new Deadline(_DVL); 
       VAT = 0.055;
    }

    public boolean expired() {
        return DLV.expired(); 
    }

    @Override
    public double getUnitPrice() {
        return getPrix_ht();
    }

}
