package imt.fisa.reengineering.v3;

/**
 * Interface CompanyItem qui représente un élément générique dans la structure d'entreprise (version 3).
 * Définit les méthodes communes à tous les éléments de l'entreprise pour les statistiques et calculs.
 */
public interface CompanyItem {

	/**
	 * Calcule la masse salariale totale de cet élément.
	 * @return Le montant total des salaires
	 */
	public long getWage();
	
	/**
	 * Compte le nombre total d'employés dans cet élément.
	 * @return Le nombre d'employés
	 */
	public long getNumberEmployees();
	
	/**
	 * Compte le nombre de filiales dans cet élément.
	 * @return Le nombre de filiales
	 */
	public long getNumberSubsidiaries();
	
	/**
	 * Compte le nombre total de nœuds (entreprises, filiales et employés) dans cet élément.
	 * @return Le nombre total de nœuds
	 */
	public long getNumberNodes();
	
	/**
	 * Compte le nombre d'employés de type STAFF dans cet élément.
	 * @return Le nombre d'employés de type STAFF
	 */
	public long getNumberStaffEmployees();
	
	/**
	 * Compte le nombre d'employés administratifs dans cet élément.
	 * @return Le nombre d'employés administratifs
	 */
	public long getNumberAdministrativeEmployees();
}
