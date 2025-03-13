package imt.fisa.reengineering.v2;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import imt.fisa.reengineering.v2.Employee.EmployeeType;

public class CompanyTest {
	
	Company company;

	@Before
	public void setUp() throws Exception {
		company = new Company();
		company.addEmployee(new Employee(10, EmployeeType.STAFF));
		company.addEmployee(new Employee(20, EmployeeType.STAFF));
		company.addEmployee(new Employee(30, EmployeeType.ADMINISTRATIVE));
	
		company.addEmployee(new Employee(40, EmployeeType.TECHNICAL));
	    Subsidiary subsidiary = new Subsidiary();
	    subsidiary.addEmployee(new Employee(1000, EmployeeType.STAFF));
	    subsidiary.addEmployee(new Employee(2000, EmployeeType.STAFF));
	    subsidiary.addEmployee(new Employee(3000, EmployeeType.ADMINISTRATIVE));
	    subsidiary.addEmployee(new Employee(4000,EmployeeType.TECHNICAL));
	    company.addSubsidiary(subsidiary);
	}
	
	@Test 
	public void testSubsidiaries() {
        Assert.assertEquals(1, company.getNumberSubsidiaries());
    }
	
	@Test
    public void testEmployees() {
        Assert.assertEquals(8, company.getNumberEmployees());
    }
	
	@Test
    public void testNodes() {
        Assert.assertEquals(10, company.getNumberNodes());
    }
	
	@Test
    public void testAdministrativeEmployees() {
        Assert.assertEquals(2, company.getNumberAdministrativeEmployees());
    }
	
	@Test
    public void testStaffEmployees() {
        Assert.assertEquals(4, company.getNumberStaffEmployees());
    }
	
	@Test
    public void testWage() {
        Assert.assertEquals(10100, company.getWage());
    }
}
