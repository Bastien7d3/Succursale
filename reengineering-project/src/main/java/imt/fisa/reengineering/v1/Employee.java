package imt.fisa.reengineering.v1;

/**
 * Classe qui représente un employé dans l'entreprise.
 * Contient les informations de base comme le salaire et le type d'employé.
 */
public class Employee {

	/**
	 * Enumération des différents types d'employés dans l'entreprise.
	 */
	public enum EmployeeType {
		/** Personnel standard */
		STAFF, 
		/** Personnel administratif */
		ADMINISTRATIVE, 
		/** Personnel technique */
		TECHNICAL
	}

	/** Salaire de l'employé */
	protected long wage;
	
	/** Type de l'employé */
	protected EmployeeType employeeType;

	/**
	 * Constructeur qui initialise un employé avec son salaire et son type.
	 * 
	 * @param wage Salaire de l'employé
	 * @param employeeType Type de l'employé
	 */
	public Employee(long wage, EmployeeType employeeType) {
		this.wage = wage;
		this.employeeType = employeeType;
	}

	/**
	 * Récupère le salaire de l'employé.
	 * 
	 * @return Le salaire de l'employé
	 */
	public long getWage() {
		return wage;
	}

	/**
	 * Récupère le type de l'employé.
	 * 
	 * @return Le type de l'employé
	 */
	public EmployeeType getEmployeeType() {
		return employeeType;
	}

	/**
	 * Modifie le salaire de l'employé.
	 * 
	 * @param wage Le nouveau salaire
	 */
	public void setWage(long wage) {
		this.wage = wage;
	}

	/**
	 * Modifie le type de l'employé.
	 * 
	 * @param employeeType Le nouveau type
	 */
	public void setEmployeeType(EmployeeType employeeType) {
		this.employeeType = employeeType;
	}

	/**
	 * Vérifie si l'employé est de type STAFF.
	 * 
	 * @return true si l'employé est de type STAFF, sinon false
	 */
	public boolean isStaffEmployee() {
		return employeeType == EmployeeType.STAFF;
	}

	/**
	 * Vérifie si l'employé est de type ADMINISTRATIVE.
	 * 
	 * @return true si l'employé est de type ADMINISTRATIVE, sinon false
	 */
	public boolean isAdministrativeEmployee() {
		return employeeType == EmployeeType.ADMINISTRATIVE;
	}
}