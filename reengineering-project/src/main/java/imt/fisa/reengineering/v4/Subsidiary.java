package imt.fisa.reengineering.v4;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe représentant une filiale dans la version 4.
 * Implémente l'interface CompanyComposite et le pattern Visitor.
 */
public class Subsidiary implements CompanyComposite {
    
    /**
     * Liste des éléments (employés ou autres structures) contenus dans cette filiale
     */
    protected List<CompanyItem> items = new ArrayList<CompanyItem>();
    
    /**
     * Ajoute un élément à la filiale
     * 
     * @param item L'élément à ajouter (employé ou structure)
     */
    public void addItem(CompanyItem item) {
        items.add(item);
    }
    
    /**
     * Supprime un élément de la filiale
     * 
     * @param item L'élément à supprimer
     */
    public void removeItem(CompanyItem item) {
        items.remove(item);
    }
    
    /**
     * Accepte un visiteur et l'applique récursivement à tous les éléments de la filiale.
     * Cette méthode visite d'abord cette filiale, puis tous ses éléments.
     * Implémentation du pattern Visitor.
     * 
     * @param visitor Le visiteur à appliquer
     */
    public void accept(CompanyVisitor visitor) {
        visitor.visit(this);
        for (CompanyItem item : items)
            item.accept(visitor);
    }
}
