public class Main {
    public static void main(String[] args) {
        // Crée un produit lait vendu par volume
        FoodProductSoldByVolume lait = new FoodProductSoldByVolume("Lait en pack de 6 bouteilles de 50cl", 1.45, 6 * 50 / 1000, 30); // 6 bouteilles de 50cl en litres

        // Affiche les caractéristiques du produit
        System.out.println("Exemple : " + lait.getNom());
        System.out.println("Prix du lait HT : " + lait.getPrix_ht() + " € par litre");
        System.out.println("Taux de TVA : " + lait.getVat() * 100 + "%");
        System.out.println("Prix TTC du lait : " + lait.getVatPrice() + " € par litre");
        System.out.println("Date limite de vente : " + lait.expired());
        System.out.println("Prix unitaire : " + lait.getUnitPrice() + " € par bouteille de 50cl");
        System.out.println("Volume du pack : " + lait.getVolume() + " litres");
    }
}
