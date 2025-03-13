package imt.fisa.reengineering.v4;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import imt.fisa.reengineering.v4.Employee.EmployeeType;

/**
 * Classe de test pour la version 4 du modèle d'entreprise utilisant le pattern Visitor.
 * Teste les différents visiteurs et leur capacité à calculer les statistiques de l'entreprise.
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
		company.addItem(new Employee(10, EmployeeType.STAFF));
		company.addItem(new Employee(20, EmployeeType.STAFF));
		company.addItem(new Employee(30, EmployeeType.ADMINISTRATIVE));
		company.addItem(new Employee(40, EmployeeType.TECHNICAL));
		
		// Création d'une filiale avec ses propres employés
	    Subsidiary subsidiary = new Subsidiary();
	    subsidiary.addItem(new Employee(1000, EmployeeType.STAFF));
	    subsidiary.addItem(new Employee(2000, EmployeeType.STAFF));
	    subsidiary.addItem(new Employee(3000, EmployeeType.ADMINISTRATIVE));
	    subsidiary.addItem(new Employee(4000,EmployeeType.TECHNICAL));
	    // Ajout de la filiale à l'entreprise principale
	    company.addItem(subsidiary);
	}
	
	/**
	 * Teste le comptage des filiales avec le visiteur approprié.
	 */
	@Test 
	public void testSubsidiaries() {
        Assert.assertEquals(1, new NumberSubsidiariesVisitor().
				getNumberSubsidiaries(company));
    }
	
	/**
	 * Teste le comptage des employés avec le visiteur approprié.
	 */
	@Test
    public void testEmployees() {
        Assert.assertEquals(8, new 
	             NumberEmployeesVisitor().getNumberEmployees(company));
    }
	
	/**
	 * Teste le comptage des nœuds avec le visiteur approprié.
	 */
	@Test
    public void testNodes() {
        Assert.assertEquals(10, new NumberNodesVisitor().getNumberNodes(company));
    }
	
	/**
	 * Teste le comptage des employés administratifs avec le visiteur approprié.
	 */
	@Test
    public void testAdministrativeEmployees() {
        Assert.assertEquals(2, 
        		new NumberAdministrativeEmployeesVisitor().getNumberAdministrativeEmployees(company));
    }
	
	/**
	 * Teste le comptage des employés de type STAFF avec le visiteur approprié.
	 */
	@Test
    public void testStaffEmployees() {
        Assert.assertEquals(4, new NumberStaffEmployeesVisitor().getNumberStaffEmployees(company));
    }
	
	/**
	 * Teste le calcul de la masse salariale avec le visiteur approprié.
	 */
	@Test
    public void testWage() {
        Assert.assertEquals(10100, new TotalWageVisitor().getWage(company));
    }
}
