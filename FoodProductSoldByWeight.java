
public class FoodProductSoldByWeight extends FoodProduct{

    private double Poids;
    
    public FoodProductSoldByWeight(String _nom, double _prix_HT, double _poids, int _DVL) {
        super(_nom, _prix_HT, _DVL);
        this.Poids = _poids; 
    }
    @Override
    public double getUnitPrice(){
        return getPrix_ht()*(1+getVat())* (1 / Poids); // Prix HT par kg
    } 

    public double getPoids(){
        return Poids;
    }
}
