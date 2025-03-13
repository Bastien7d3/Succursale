package imt.fisa.reengineering.v3;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe représentant une filiale dans la version 3.
 * Implémente l'interface CompanyComposite et utilise le pattern Composite
 * pour traiter uniformément les employés et les structures.
 */
public class Subsidiary implements CompanyComposite {
    
    /**
     * Liste des éléments (employés ou autres structures) contenus dans cette filiale
     */
    protected List<CompanyItem> items = new ArrayList<CompanyItem>();

    /**
     * Calcule la masse salariale totale de la filiale
     * en agrégeant les salaires de tous les éléments
     * 
     * @return La somme des salaires de tous les éléments
     */
    public long getWage() {
        long result = 0;
        for (CompanyItem item : items)
            result = result + item.getWage();
        return result;
    }

    /**
     * Détermine le nombre total d'employés dans la filiale
     * en agrégeant les comptages de chaque élément
     * 
     * @return Le nombre total d'employés
     */
    public long getNumberEmployees() {
        long result = 0;
        for (CompanyItem item : items) {
            result = result + item.getNumberEmployees();
        }
        return result;
    }

    /**
     * Compte cette filiale comme une seule filiale
     * 
     * @return 1 (toujours)
     */
    public long getNumberSubsidiaries() {
        return 1;
    }

    /**
     * Calcule le nombre total de nœuds (cette filiale + tous les éléments)
     * 
     * @return Le nombre total de nœuds
     */
    public long getNumberNodes() {
        long result = 1;
        for (CompanyItem item : items) {
            result = result + item.getNumberNodes();
        }
        return result;
    }

    /**
     * Compte le nombre total d'employés de type STAFF
     * en agrégeant les comptages de chaque élément
     * 
     * @return Le nombre d'employés réguliers (STAFF)
     */
    public long getNumberStaffEmployees() {
        long result = 0;
        for (CompanyItem item : items) {
            result = result + item.getNumberStaffEmployees();
        }
        return result;
    }

    /**
     * Compte le nombre total d'employés de type ADMINISTRATIVE
     * en agrégeant les comptages de chaque élément
     * 
     * @return Le nombre d'employés administratifs
     */
    public long getNumberAdministrativeEmployees() {
        long result = 0;
        for (CompanyItem item : items) {
            result = result + item.getNumberAdministrativeEmployees();
        }
        return result;
    }

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
}
