package imt.fisa.reengineering.v2;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import imt.fisa.reengineering.v2.Employee.EmployeeType;

/**
 * Classe de test pour la version 2 du modèle d'entreprise.
 * Teste les méthodes de calcul des statistiques avec une structure séparée pour les employés et filiales.
 */
public class CompanyTest {
	
	/** L'entreprise utilisée pour les tests */
	Company company;

	/**
	 * Initialise l'entreprise et sa structure avant chaque test.
	 * Crée une entreprise avec des employés et une filiale contenant également des employés.
	 */
	@Before
	public void setUp() throws Exception {
		// Création de l'entreprise principale
		company = new Company();
		// Ajout d'employés à l'entreprise principale
		company.addEmployee(new Employee(10, EmployeeType.STAFF));
		company.addEmployee(new Employee(20, EmployeeType.STAFF));
		company.addEmployee(new Employee(30, EmployeeType.ADMINISTRATIVE));
		company.addEmployee(new Employee(40, EmployeeType.TECHNICAL));
		
		// Création d'une filiale avec ses propres employés
	    Subsidiary subsidiary = new Subsidiary();
	    subsidiary.addEmployee(new Employee(1000, EmployeeType.STAFF));
	    subsidiary.addEmployee(new Employee(2000, EmployeeType.STAFF));
	    subsidiary.addEmployee(new Employee(3000, EmployeeType.ADMINISTRATIVE));
	    subsidiary.addEmployee(new Employee(4000,EmployeeType.TECHNICAL));
	    // Ajout de la filiale à l'entreprise principale
	    company.addSubsidiary(subsidiary);
	}
	
	/**
	 * Teste le comptage des filiales.
	 */
	@Test 
	public void testSubsidiaries() {
        Assert.assertEquals(1, company.getNumberSubsidiaries());
    }
	
	/**
	 * Teste le comptage des employés.
	 */
	@Test
    public void testEmployees() {
        Assert.assertEquals(8, company.getNumberEmployees());
    }
	
	/**
	 * Teste le comptage des nœuds.
	 */
	@Test
    public void testNodes() {
        Assert.assertEquals(10, company.getNumberNodes());
    }
	
	/**
	 * Teste le comptage des employés administratifs.
	 */
	@Test
    public void testAdministrativeEmployees() {
        Assert.assertEquals(2, company.getNumberAdministrativeEmployees());
    }
	
	/**
	 * Teste le comptage des employés de type STAFF.
	 */
	@Test
    public void testStaffEmployees() {
        Assert.assertEquals(4, company.getNumberStaffEmployees());
    }
	
	/**
	 * Teste le calcul de la masse salariale.
	 */
	@Test
    public void testWage() {
        Assert.assertEquals(10100, company.getWage());
    }
}
