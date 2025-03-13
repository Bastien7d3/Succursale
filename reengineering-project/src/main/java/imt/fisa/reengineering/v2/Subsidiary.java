package imt.fisa.reengineering.v2;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe représentant une filiale dans la version 2.
 * Gère une liste d'employés et fournit des méthodes pour calculer diverses statistiques.
 */
public class Subsidiary {

    /**
     * Liste des employés de la filiale
     */
    protected List<Employee> employees = new ArrayList<Employee>();
    
    /**
     * Calcule la masse salariale totale de la filiale
     * 
     * @return La somme des salaires de tous les employés
     */
    public long getWage() {
        long result = 0;

        for (Employee employee : employees)
            result = result + employee.getWage();
        return result;
    }

    /**
     * Détermine le nombre total d'employés dans la filiale
     * 
     * @return Le nombre d'employés
     */
    public long getNumberEmployees() {
        long result = employees.size();
        return result;
    }

    /**
     * Calcule le nombre total de nœuds (1 filiale + tous les employés)
     * 
     * @return Le nombre total de nœuds
     */
    public long getNumberNodes() {
        long result = employees.size() + 1;
        return result;
    }

    /**
     * Compte le nombre d'employés de type STAFF
     * 
     * @return Le nombre d'employés réguliers (STAFF)
     */
    public long getNumberStaffEmployees() {
        long result = 0;
        for (Employee employee : employees)
            if (employee.isStaffEmployee())
                result = result + 1;
        return result;
    }

    /**
     * Compte le nombre d'employés de type ADMINISTRATIVE
     * 
     * @return Le nombre d'employés administratifs
     */
    public long getNumberAdministrativeEmployees() {
        long result = 0;
        for (Employee employee : employees)
            if (employee.isAdministrativeEmployee())
                result = result + 1;
        return result;
    }

    /**
     * Ajoute un employé à la filiale
     * 
     * @param employee L'employé à ajouter
     */
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }
    
    /**
     * Supprime un employé de la filiale
     * 
     * @param employee L'employé à supprimer
     */
    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }
}

