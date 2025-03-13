package imt.fisa.reengineering.v3;

/**
 * Classe représentant une entreprise dans la version 3.
 * Étend la classe Subsidiary et redéfinit la méthode de comptage des filiales.
 */
public class Company extends Subsidiary {

    /**
     * Compte le nombre total de filiales dans l'arborescence
     * Contrairement à la classe parente, cette implémentation compte récursivement
     * les filiales contenues dans chaque élément.
     * 
     * @return Le nombre total de filiales dans l'arborescence
     */
    public long getNumberSubsidiaries() {
        long result = 0;
        for (CompanyItem item : items) {
            result = result + item.getNumberSubsidiaries();
        }
        return result;    
    }
}
