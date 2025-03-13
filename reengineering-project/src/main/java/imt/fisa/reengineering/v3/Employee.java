package imt.fisa.reengineering.v3;

/**
 * Classe représentant un employé dans la version 3.
 * Implémente l'interface CompanyItem pour s'intégrer dans la structure composite.
 */
public class Employee implements CompanyItem {

    /**
     * Enum définissant les différents types d'employés possibles dans l'entreprise:
     * - STAFF: Personnel régulier
     * - ADMINISTRATIVE: Personnel administratif
     * - TECHNICAL: Personnel technique
     */
    public enum EmployeeType {
        STAFF, ADMINISTRATIVE, TECHNICAL
    }

    /**
     * Salaire de l'employé
     */
    protected long wage;
    
    /**
     * Type de l'employé (STAFF, ADMINISTRATIVE ou TECHNICAL)
     */
    protected EmployeeType employeeType;

    /**
     * Constructeur pour créer un nouvel employé
     * 
     * @param wage Le salaire de l'employé
     * @param employeeType Le type d'employé
     */
    public Employee(long wage, EmployeeType employeeType) {
        this.wage = wage;
        this.employeeType = employeeType;
    }

    /**
     * Récupère le salaire de l'employé
     * 
     * @return Le salaire de l'employé
     */
    public long getWage() {
        return wage;
    }

    /**
     * Récupère le type de l'employé
     * 
     * @return Le type de l'employé
     */
    public EmployeeType getEmployeeType() {
        return employeeType;
    }

    /**
     * Définit le salaire de l'employé
     * 
     * @param wage Le nouveau salaire à attribuer
     */
    public void setWage(long wage) {
        this.wage = wage;
    }

    /**
     * Définit le type de l'employé
     * 
     * @param employeeType Le nouveau type d'employé à attribuer
     */
    public void setEmployeeType(EmployeeType employeeType) {
        this.employeeType = employeeType;
    }

    /**
     * Vérifie si l'employé est de type personnel régulier (STAFF)
     * 
     * @return true si l'employé est de type STAFF, false sinon
     */
    public boolean isStaffEmployee() {
        return employeeType == EmployeeType.STAFF;
    }

    /**
     * Vérifie si l'employé est de type administratif (ADMINISTRATIVE)
     * 
     * @return true si l'employé est de type ADMINISTRATIVE, false sinon
     */
    public boolean isAdministrativeEmployee() {
        return employeeType == EmployeeType.ADMINISTRATIVE;
    }

    /**
     * Retourne 1 car un employé est un seul élément
     * 
     * @return 1 (toujours)
     */
    public long getNumberEmployees() {
        return 1;
    }
    
    /**
     * Retourne 0 car un employé n'est pas une filiale
     * 
     * @return 0 (toujours)
     */
    public long getNumberSubsidiaries() {
        return 0;
    }
    
    /**
     * Retourne 1 car un employé compte comme un seul nœud
     * 
     * @return 1 (toujours)
     */
    public long getNumberNodes() {
        return 1;
    }
    
    /**
     * Retourne 1 si c'est un employé STAFF, 0 sinon
     * 
     * @return 1 ou 0 selon le type d'employé
     */
    public long getNumberStaffEmployees() {
        return isStaffEmployee() ? 1:0;
    }
    
    /**
     * Retourne 1 si c'est un employé ADMINISTRATIVE, 0 sinon
     * 
     * @return 1 ou 0 selon le type d'employé
     */
    public long getNumberAdministrativeEmployees() {
        return isAdministrativeEmployee() ? 1:0;
    }
}