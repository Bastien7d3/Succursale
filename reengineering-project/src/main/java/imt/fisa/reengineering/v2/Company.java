package imt.fisa.reengineering.v2;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe représentant une grande entreprise qui peut contenir des filiales.
 * Étend la classe Subsidiary et ajoute la gestion des filiales.
 * À renommer en BigCompany selon le commentaire.
 */
public class Company extends Subsidiary {
    /**
     * Liste des filiales appartenant à cette entreprise
     */
    protected List<Subsidiary> subsidiaries = new ArrayList<Subsidiary>();

    /**
     * Calcule la masse salariale totale de l'entreprise et de ses filiales
     * 
     * @return La somme des salaires de tous les employés de l'entreprise et de ses filiales
     */
    public long getWage() {
        long result = 0;
        result = super.getWage();
        for (Subsidiary subsidiary : subsidiaries)
            result = result + subsidiary.getWage();
        return result;
    }

    /**
     * Détermine le nombre total d'employés dans l'entreprise et ses filiales
     * 
     * @return Le nombre total d'employés
     */
    public long getNumberEmployees() {
        long result = super.getNumberEmployees();
        for (Subsidiary subsidiary : subsidiaries)
            result = result + subsidiary.getNumberEmployees();
        return result;
    }

    /**
     * Compte le nombre de filiales directes de l'entreprise
     * 
     * @return Le nombre de filiales
     */
    public long getNumberSubsidiaries() {
        long result = subsidiaries.size();
        return result;    
    }

    /**
     * Calcule le nombre total de nœuds (entreprise, filiales et employés)
     * 
     * @return Le nombre total de nœuds
     */
    public long getNumberNodes() {
        long result = super.getNumberNodes();
        for (Subsidiary subsidiary : subsidiaries)
            result = result + subsidiary.getNumberNodes();
        return result;
    }

    /**
     * Compte le nombre total d'employés de type STAFF dans l'entreprise et ses filiales
     * 
     * @return Le nombre d'employés réguliers (STAFF)
     */
    public long getNumberStaffEmployees() {
        long result = 0;
        result = super.getNumberStaffEmployees();
        for (Subsidiary subsidiary : subsidiaries)
            result = result + subsidiary.getNumberStaffEmployees();
        return result;
    }

    /**
     * Compte le nombre total d'employés de type ADMINISTRATIVE dans l'entreprise et ses filiales
     * 
     * @return Le nombre d'employés administratifs
     */
    public long getNumberAdministrativeEmployees() {
        long result = 0;
        result = super.getNumberAdministrativeEmployees();
        for (Subsidiary subsidiary : subsidiaries)
            result = result + subsidiary.getNumberAdministrativeEmployees();
        return result;
    }

    /**
     * Ajoute une filiale à l'entreprise
     * 
     * @param subsidiary La filiale à ajouter
     */
    public void addSubsidiary(Subsidiary subsidiary) {
        subsidiaries.add(subsidiary);
    }

    /**
     * Supprime une filiale de l'entreprise
     * 
     * @param subsidiary La filiale à supprimer
     */
    public void removeSubsidiary(Subsidiary subsidiary) {
        subsidiaries.remove(subsidiary);
    }
}
