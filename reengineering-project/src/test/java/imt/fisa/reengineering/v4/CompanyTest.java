package imt.fisa.reengineering.v4;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import imt.fisa.reengineering.v4.Employee.EmployeeType;

public class CompanyTest {
	
	Company company;

	@Before
	public void setUp() throws Exception {
		company = new Company();
		company.addItem(new Employee(10, EmployeeType.STAFF));
		company.addItem(new Employee(20, EmployeeType.STAFF));
		company.addItem(new Employee(30, EmployeeType.ADMINISTRATIVE));
	
		company.addItem(new Employee(40, EmployeeType.TECHNICAL));
	    Subsidiary subsidiary = new Subsidiary();
	    subsidiary.addItem(new Employee(1000, EmployeeType.STAFF));
	    subsidiary.addItem(new Employee(2000, EmployeeType.STAFF));
	    subsidiary.addItem(new Employee(3000, EmployeeType.ADMINISTRATIVE));
	    subsidiary.addItem(new Employee(4000,EmployeeType.TECHNICAL));
	    company.addItem(subsidiary);
	}
	
	@Test 
	public void testSubsidiaries() {
        Assert.assertEquals(1, new NumberSubsidiariesVisitor().
				getNumberSubsidiaries(company));
    }
	
	@Test
    public void testEmployees() {
        Assert.assertEquals(8, new 
	             NumberEmployeesVisitor().getNumberEmployees(company));
    }
	
	@Test
    public void testNodes() {
        Assert.assertEquals(10, new NumberNodesVisitor().getNumberNodes(company));
    }
	
	@Test
    public void testAdministrativeEmployees() {
        Assert.assertEquals(2, 
        		new NumberAdministrativeEmployeesVisitor().getNumberAdministrativeEmployees(company));
    }
	
	@Test
    public void testStaffEmployees() {
        Assert.assertEquals(4, new NumberStaffEmployeesVisitor().getNumberStaffEmployees(company));
    }
	
	@Test
    public void testWage() {
        Assert.assertEquals(10100, new TotalWageVisitor().getWage(company));
    }
}
