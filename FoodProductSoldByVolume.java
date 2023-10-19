package TD2;
public class FoodProductSoldByVolume extends FoodProduct {
    private double Volume; 

    public FoodProductSoldByVolume(String _nom, double _prix_HT, double _volume, int _DVL){ //constructeur avec parametre 
        super(_nom, _prix_HT, _DVL); 
        this.Volume = _volume; 
    }

    @Override
    public double getUnitPrice(){
        return getPrix_ht()*(1+getVat()) * (1 / Volume); // Prix HT par litre ou par unité de volume;
    } 

    public double getVolume(){
        return Volume;
    }
}
