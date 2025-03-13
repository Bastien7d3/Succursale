package imt.fisa.reengineering.v4;

/**
 * Classe représentant une entreprise dans la version 4.
 * Étend la classe Subsidiary et implémente le pattern Visitor.
 */
public class Company extends Subsidiary {

    /**
     * Accepte un visiteur et l'applique récursivement à tous les éléments de l'entreprise.
     * Cette méthode visite d'abord cette entreprise, puis tous ses éléments.
     * 
     * @param visitor Le visiteur à appliquer
     */
    public void accept(CompanyVisitor visitor) {
        visitor.visit(this);
        for (CompanyItem item : items)
            item.accept(visitor);
    }
}
