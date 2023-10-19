
public abstract class ConsumerProduct implements Product {
    private String nom; 
    private double prix_ht;  
    protected double VAT = 0.2; //vat = taxe(tva) 

    public ConsumerProduct(String _nom, double _prix_ht){ //constructeur avec parametre 
        this.nom= _nom; 
        this.prix_ht=_prix_ht; 
    }

    // Méthode pour obtenir le Nom du produit
    public String getNom() {
        return nom;
    }

    // Méthode pour obtenir le prix HT du produit
    public double getPrix_ht(){
        return prix_ht;
    }

    // Méthode pour obtenir le taux de TVA
    public double getVat(){
        return VAT; 
    }

    // Méthode pour obtenir le montant de la TVA
    public double getVatPrice(){ 
        return getPrix_ht()*(1+getVat()); // 1 c'est le prix du produit
    }

    // Méthode pour obtenir le prix TTC du produit
    public double getVatAmount(){
        return getPrix_ht()* getVat(); // montant du cout de la taxe --> prix du pourcentage de la tva.
    }

    // Méthode pour obtenir le prix HT d'un produit en vente unitaire
    public abstract double getUnitPrice(); 

    // Méthode pour obtenir le prix TTC d'un produit en vente unitaire
    public double getUnitVatPrice(){
        return getVatPrice();
    }
        
    // Méthode pour obtenir le montant de la TVA d'un produit en vente unitaire
    public double getUnitVatAmount(){
        return getVatAmount();

    }
}