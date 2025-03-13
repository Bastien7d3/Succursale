package imt.fisa.reengineering.v2;


/**
 * Classe représentant un employé dans le système.
 * Contient les informations de base comme le salaire et le type d'employé.
 */
public class Employee {

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
}